
package Entity;

import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Kien Nguyen
 */
public class Order {
    private String order_id;  
    private List<Item> items;

    public Order() {
    }

    public Order(String order_id, List<Item> items) {
        this.order_id = order_id;
        this.items = items;
    }
    
    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getTotal() {
        float t=0;
        for (Item i : items) {
            t+=i.getProduct().product_price*(100-i.getProduct().getDiscount())/100*i.getQuantity();
        }
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(t);
        return format;
    }

    
}
