
package Entity;

import java.sql.Timestamp;

/**
 *
 * @author Kien Nguyen
 */
public class Transaction {
    private int transaction_id;
    private String order_id;
    private int user_id;  
    private Timestamp date;
    private String address;
    private String phone;
    private String amount;
    private String payment;
    private Boolean status;

    public Transaction() {
    }

    public Transaction(int transaction_id, String order_id, int user_id, Timestamp date, String address, String phone, String amount, String payment, Boolean status) {
        this.transaction_id = transaction_id;
        this.order_id = order_id;
        this.user_id = user_id;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.amount = amount;
        this.payment = payment;
        this.status = status;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    
    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }   

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    @Override
    public String toString() {
        return "Transaction{" + "transaction_id=" + transaction_id + ", order_id=" + order_id + ", user_id=" + user_id + ", date=" + date + ", address=" + address + ", phone=" + phone + ", amount=" + amount + ", payment=" + payment + ", status=" + status + '}';
    }
    
   
}
