<%-- 
    Document   : Cart.jsp
    Created on : Jan 27, 2021, 2:45:11 PM
    Author     : Kien Nguyen
--%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="Entity.Product"%>
<%@page import="DAO.DAO"%>
<%@page import="Entity.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Order"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href ='css/style.css'>
        <style>
            td{
                border:1px solid black;
                text-align: center;
                border-collapse: collapse;
            }
            .mess{
                color: red;
                text-height: 20px;
            }
          
        </style>
  
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>          
            <div class="container2">
                <form method="post" action="trans">    
                    <table>
                        <tr>
                            <th>ID</th>           
                            <th>Image</th>    
                            <th>Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Discount</th>
                            <th>Sum</th>
                        </tr> 

                    <c:forEach items="${sessionScope.order.items}" var="o">
                        <tr> 
                            <td>${o.product.product_id}</td>
                            <td><img src=" ${o.product.img_url}" width="200px"></td>
                            <td>${o.product.product_name}</td>
                            <td>${o.product.product_price}</td>                   
                            <td> <a href="cart?pid=${o.product.product_id}&command=sub">-</a>
                                ${o.quantity}
                                <a href="cart?pid=${o.product.product_id}&command=plus">+</a>

                            </td>
                            <td>${o.product.discount} %</td>                 
                            <td>${o.product.product_price*o.quantity*(100-o.product.discount)/100}</td>
                            <td><a href="cart?pid=${o.product.product_id}&command=remove" >Remove</a> </td>
                            
                        </tr>
                    </c:forEach>  

                </table>    
                <p class="mess">${mess}</p>

                <c:if test="${sessionScope.order.getTotal()==0}"> 
                    <br/>
                    <a type="submit" href="Home" class="btn2"> No thing here, buy now!! </a>       
                </c:if>
                <c:if test="${sessionScope.order.getTotal()!=0}"> 
                    <div class="total">
                        <p>Total </br>                   
                    ${sessionScope.order.getTotal()}
                    </p> </div>    
                    <a type="submit" href="Transaction.jsp" class="btn2"> Buy </a>       
                </c:if>
            </form>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
