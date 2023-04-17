import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {
        
        //Menu items
        Item item1 = new Item("mocha", 3.99);
        Item item2 = new Item("latte", 5.99);
        Item item3 = new Item("drip coffee", 2.99);
        Item item4 = new Item("capuccino", 4.99);

        // Order variables -- order1, order2, etc
        Order order1 = new Order("Cindhuri", item1.price, true);
        Order order2 = new Order("Jimmy", item2.price, true);
        Order order3 = new Order("Noah", item4.price, true);
        Order order4 = new Order("Sam", item2.price + item2.price + item2.price, true);

        // Application Simulations
        // Use this example code to test various orders' updates

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
