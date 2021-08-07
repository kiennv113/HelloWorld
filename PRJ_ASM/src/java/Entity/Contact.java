/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Kien Nguyen
 */
public class Contact {
    private String contact_id;
    private String contact_topic;
    private String user_id;
    private String content;
    private Timestamp date;
    private boolean status;
    private String respond;
    private String admin_id;

    public Contact() {
    }

    public Contact(String contact_id, String contact_topic, String user_id, String content, Timestamp date, boolean status, String respond, String admin_id) {
        this.contact_id = contact_id;
        this.contact_topic = contact_topic;
        this.user_id = user_id;
        this.content = content;
        this.date = date;
        this.status = status;
        this.respond = respond;
        this.admin_id = admin_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRespond() {
        return respond;
    }

    public void setRespond(String respond) {
        this.respond = respond;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }
    
    public String getContact_id() {
        return contact_id;
    }

    public void setContact_id(String contact_id) {
        this.contact_id = contact_id;
    }

    public String getContact_topic() {
        return contact_topic;
    }

    public void setContact_topic(String contact_topic) {
        this.contact_topic = contact_topic;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Contact{" + "contact_id=" + contact_id + ", user_id=" + user_id + ", contact_topic=" + contact_topic + ", content=" + content + ", date=" + date + ", status=" + status + ", respond=" + respond + ", admin_id=" + admin_id + '}';
    }

    
    public String toTable(){
        return "<td>"+contact_id+"</td>"+
                "<td>"+user_id+"</td>"+
                "<td>"+contact_topic+"</td>"+
                "<td>"+content+"</td>"+
                 "<td>"+date+"</td>"+
                 "<td>"+status+"</td>"+
                 "<td>"+respond+"</td>"+
                 "<td>"+admin_id+"</td>"   ;
    }
    
}
