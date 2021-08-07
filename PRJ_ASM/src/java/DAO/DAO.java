package DAO;

import DBcontext.DBContext;
import Entity.Account;
import Entity.Category;
import Entity.Contact;
import Entity.Product;
import Entity.Transaction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //get All Product
    public List<Product> getProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_products";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //get All Category
    public List<Category> getCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_category";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductByCategory(String id) {
        List<Product> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_products "
                + "where catalog_id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductByProductId(String id) {
        String sql = "select * from he140687_kiennv_products "
                + "where product_id= ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new Product(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return null;
    }

    // get all user accounts
    public List<Account> getUser() {
        List<Account> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_user where power=1";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Account getUserById(String uid) {
        String sql = "select * from he140687_kiennv_user where user_id=?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            ps.setString(1, uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Account> getAdmin() {
        List<Account> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_user where power=0";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //search function
    public List<Product> searchByName(String txt){
        List<Product> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_products\n"
                + "where product_name like ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getFloat(7),
                        rs.getFloat(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //login function
    public Account login(String user, String pass) {
        String query = "select * from he140687_kiennv_user\n"
                + "where username = ? and password= ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //check account exist
    public Account checkAccount(String user) {
        String query = "select * from he140687_kiennv_user\n"
                + "where username = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
            }
        } catch (Exception e) {
        }
        return null;
    }

    //add Account function
    public void addAccount(String user, String pass) {
        String query = "insert into he140687_kiennv_user\n"
                + "values (?,?,1)";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteProduct(String pid) {
        String query = "delete from he140687_kiennv_products\n"
                + "where product_id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void deleteAccount(String aid) {
        String query = "delete from he140687_kiennv_user\n"
                + "where user_id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, aid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void addProduct(int cid, String pname, String manufacturer, int size, int frequency, float price, float discount, String url, String description, int amount) {
        String query = "insert into he140687_kiennv_products\n"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setInt(1, cid);
            ps.setString(2, pname);
            ps.setString(3, manufacturer);
            ps.setInt(4, size);
            ps.setInt(5, frequency);
            ps.setFloat(6, price);
            ps.setFloat(7, discount);
            ps.setString(8, url);
            ps.setString(9, description);
            ps.setInt(10, amount);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void editProduct(int cid, String pname, String manufacturer, int size, int frequency, float price, float discount, String url, String description, int amount, int pid) {
        String query = "update he140687_kiennv_products\n"
                + "set catalog_id=?, \n"
                + "	product_name= ?, \n"
                + "	manufacturer=?,\n"
                + "	size=?,\n"
                + "	frequency=?,\n"
                + "	product_price=?,\n"
                + "	discount=?,\n"
                + "	img_url=?,\n"
                + "	description=?\n"
                + "	amount=?\n"
                + "where product_id= ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setInt(1, cid);
            ps.setString(2, pname);
            ps.setString(3, manufacturer);
            ps.setInt(4, size);
            ps.setInt(5, frequency);
            ps.setFloat(6, price);
            ps.setFloat(7, discount);
            ps.setString(8, url);
            ps.setString(9, description);
            ps.setInt(10, amount);
            ps.setInt(11, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void upPower(String uid) {
        String query = "update he140687_kiennv_user\n"
                + "set power=0 \n"
                + "where user_id=?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    // get all Contact
    public List<Contact> getContact() {
        List<Contact> list = new ArrayList<>();
        String sql = "select * from he140687_kiennv_contact";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Contact(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getTimestamp(5),
                        rs.getBoolean(6),
                        rs.getString(7),
                        rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    //add contact function
    public void addContact(String topic, String uid, String content, Timestamp date, Boolean status, String respond, String admin_id) {
        String query = "insert into he140687_kiennv_contact\n"
                + "values (?,?,?,?,?,?,?)";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, topic);
            ps.setString(2, uid);
            ps.setString(3, content);
            ps.setTimestamp(4, date);
            ps.setBoolean(5, status);
            ps.setString(6, respond);
            ps.setString(7, admin_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
     
    
    public void repContact(Boolean status, String respond, int admin_id, int contact_id) {
        String query = "update he140687_kiennv_contact\n" +
                        "set status=?,respond=?,admin_id=?\n" +
                        "where contact_id=?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setBoolean(1, status);
            ps.setString(2, respond);
            ps.setInt(3, admin_id);
            ps.setInt(4, contact_id);      
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    

    public void changePass(String id, String newpass) {
        String query = "update he140687_kiennv_user\n"
                + "set password= ? \n"
                + "where user_id= ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, newpass);
            ps.setString(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public Contact getContactById(String cid) {
        String sql = "select * from he140687_kiennv_contact\n"
                + "where contact_id=?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(sql);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Contact(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getTimestamp(5),
                        rs.getBoolean(6),
                        rs.getString(7),
                        rs.getString(8));

            }
        } catch (Exception e) {
        }
        return null;

    }
    public void addTrans(String oid, int uid, Timestamp t, String address, String phone, String amount, String payment ,boolean status){
    String query = "insert into he140687_kiennv_transaction\n" +
                    "values (?,?,?,?,?,?,?,?)";
    try {
            con = new DBContext().connection;
            ps = con.prepareStatement(query);
            ps.setString(1, oid);
            ps.setInt(2, uid);
            ps.setTimestamp(3, t);
            ps.setString(4, address);
            ps.setString(5, phone);
            ps.setString(6, amount);
            ps.setString(7, payment);
            ps.setBoolean(8, status);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    
    }
    public List<Transaction> getTrans(){
         List<Transaction> list = new ArrayList<>();
        String query="select * from he140687_kiennv_transaction";
        try {
          con = new DBContext().connection;
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new  Transaction(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getTimestamp(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getBoolean(9)));

            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        DAO dao = new DAO();
       List<Product> listP = dao.getProduct();
        for (Product product : listP) {
            System.out.println(product.toString());
        }
}
}
