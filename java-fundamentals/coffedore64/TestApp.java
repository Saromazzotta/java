public class TestApp {
    public static void main(String[] args) {

        CoffeeKiosk app1 = new CoffeeKiosk();
        app1.addMenuItem("banana", 2.00);
        app1.addMenuItem("coffee", 1.50);
        app1.addMenuItem("latte", 4.50);
        app1.addMenuItem("capuccino", 3.00);
        app1.addMenuItem("muffin", 4.00);

        app1.newOrder();
    }
}
