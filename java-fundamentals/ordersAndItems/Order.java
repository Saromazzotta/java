import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    ArrayList<Item> items;


    Order(String name, double total, boolean ready) {
        this.name = name;
        this.total = total;
        this.ready = ready;
    }



}
