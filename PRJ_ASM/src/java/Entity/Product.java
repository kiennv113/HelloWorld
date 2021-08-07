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
public class Product {

    int product_id;
    int catalog_id;
    String product_name;
    String manufacturer;
    int size;
    int frequency;
    float product_price;
    float discount;
    String img_url;
    String description;
    int amount;

    public Product() {
    }

    public Product(int product_id, int catalog_id, String product_name, String manufacturer, int size, int frequency, float product_price, float discount, String img_url, String description, int amount) {
        this.product_id = product_id;
        this.catalog_id = catalog_id;
        this.product_name = product_name;
        this.manufacturer = manufacturer;
        this.size = size;
        this.frequency = frequency;
        this.product_price = product_price;
        this.discount = discount;
        this.img_url = img_url;
        this.description = description;
        this.amount = amount;
    }



    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    

    public String toTable() {
        return   "<td>" + product_id + "</td>"              
                + "<td>" + product_name + "</td>"
                + "<td>" + product_price + "</td>"
                + "<td>" + discount + "</td>"
                + "<td>" + img_url + "</td>"
                + "<td>" + description + "</td>"
                + "<td>" + amount+ "</td>";
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", catalog_id=" + catalog_id + ", product_name=" + product_name + ", manufacturer=" + manufacturer + ", size=" + size + ", frequency=" + frequency + ", product_price=" + product_price + ", discount=" + discount + ", img_url=" + img_url + ", description=" + description + ", amount=" + amount + '}';
    }

    
}
