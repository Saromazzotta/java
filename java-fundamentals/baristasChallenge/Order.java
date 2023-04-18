import java.util.ArrayList;

public class Order {
    // member variables/attributes
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    // constructor
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    // overloaded constructor
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // GETTERS AND SETTERS

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // METHODS

    // addItem method
    public void addItem(Item item) {
        items.add(item);
    }

    // getStatusMessage
    public String getStatusMessage() {
        if (this.ready == true) {
            return ("Your order is ready.");
        }
        return ("Thank you for waiting. Your order will be ready soon.");
    }

    // getOrderTotal
    public double getOrderTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    // display method
    public void display() {
        System.out.println("customer Name: " + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

}
