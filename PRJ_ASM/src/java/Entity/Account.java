/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Kien Nguyen
 */
public class Account {

    private int user_id;
    private String username;
    private String password;
    private int power;

    public Account() {
    }

    public Account(int user_id, String username, String password, int power) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.power = power;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toRow() {
        return "<td>" + user_id + "</td>"
                + "<td>" + username + "</td>"
                + "<td>" + power + "</td>";
    }

    @Override
    public String toString() {
        return "Account{" + "user_id=" + user_id + ", username=" + username + ",  power=" + power + '}';
    }

}
