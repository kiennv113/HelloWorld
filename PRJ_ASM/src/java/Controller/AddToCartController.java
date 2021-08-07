/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAO;
import Entity.Account;
import Entity.Item;
import Entity.Order;
import Entity.Product;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kien Nguyen
 */
@WebServlet(name = "AddToCartController", urlPatterns = {"/cart"})
public class AddToCartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int quantity = 1;
        String mess;
        DAO dao = new DAO();
        if (request.getParameter("pid") != null) {
            String pid = request.getParameter("pid");
            Product p = dao.getProductByProductId(pid);
            String command = request.getParameter("command");
            if (p != null) {
                HttpSession ses = request.getSession();
                Account acc = (Account) ses.getAttribute("a");
                if (ses.getAttribute("order") == null) {
                    List<Item> listItems = new ArrayList();
                    Item item = new Item();
                    item.setProduct(p);
                    item.setQuantity(quantity);
                    listItems.add(item);
                    Order order = new Order();
                    order.setItems(listItems);
                    Timestamp t = new Timestamp(System.currentTimeMillis());
                    order.setOrder_id(t.toString());
                    ses.setAttribute("order", order);
                } else {
                    Order order = (Order) ses.getAttribute("order");
                    List<Item> listItems = order.getItems();
                    boolean check = false;

                    for (Item i : listItems) {
                        if (i.getProduct().getProduct_id() == p.getProduct_id()) {
                            if (command.equals("sub") && i.getQuantity() > 1) {
                                i.setQuantity(i.getQuantity() - 1);
                            }
                            if (dao.getProductByProductId(pid).getAmount() > i.getQuantity() && command.equals("plus")) {
                                i.setQuantity(i.getQuantity() + quantity);
                            }
                            if (dao.getProductByProductId(pid).getAmount() > i.getQuantity() && command.equals("addhome")) {
                                i.setQuantity(i.getQuantity() + 1);
                            }
                            if (command.equals("remove")) {
                                listItems.remove(i);
                                ses.setAttribute("order", order);
                                request.getRequestDispatcher("Cart.jsp").forward(request, response);
                            }
      
                            if (dao.getProductByProductId(pid).getAmount() == i.getQuantity()) {
                                request.setAttribute("mess", "Không thể mua thêm vì hết hàng trong kho");
                                request.getRequestDispatcher("Cart.jsp").forward(request, response);

                            }
                            check = true;// product da ton tai                  
                        }
                    }

                    if (check == false) {
                        Item item = new Item();
                        item.setQuantity(quantity);
                        item.setProduct(p);
                        listItems.add(item);
                    }
                    order.setItems(listItems);
                    ses.setAttribute("order", order);
                }
                if (command.equals("addhome")) {
                    response.sendRedirect("Home");
                } else {
                    request.getRequestDispatcher("Cart.jsp").forward(request, response);
                }

            }
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
