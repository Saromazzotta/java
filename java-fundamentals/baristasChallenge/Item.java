public class Item {
    private String name;
    private double price;

    // constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // name getter and setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // price getter and setter
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
