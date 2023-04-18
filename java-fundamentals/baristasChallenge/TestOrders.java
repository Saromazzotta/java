import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {
        
        //Menu items
        Item item1 = new Item("mocha", 2.99);
        Item item2 = new Item("capuccino", 3.99);
        Item item3 = new Item("coffee", 1.99);
        Item item4 = new Item("latte", 5.99);
        
        // 2 unspecified orders
        Order order1 = new Order();
        Order order2 = new Order();

        // 3 named orders
        Order order3 = new Order("Saro");
        Order order4 = new Order("Sal");
        Order order5 = new Order("Sabrina");

        // Add 2 items to every order
        order1.addItem(item1);
        order1.addItem(item3);

        order2.addItem(item4);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item2);

        order4.addItem(item2);
        order4.addItem(item1);

        order5.addItem(item1);
        order5.addItem(item1);

        // Test status
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        // Test order total 
        System.out.println(order5.getOrderTotal());
        order5.display();
    }
}
