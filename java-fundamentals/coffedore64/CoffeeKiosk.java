import java.util.ArrayList;

public class CoffeeKiosk {
    public ArrayList<Item> menu;
    public ArrayList<Order> orders;

    // CONSTRUCTOR
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }


    // METHODS 
    public void addMenuItem(String item, double price) {
        Item itemNew = new Item(item, price);
        menu.add(itemNew);
        itemNew.setIndex(menu.indexOf(itemNew));
    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }
    
    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();

        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {

            // Get the item object from the menu, and add the item to the order
            order.addItem(menu.get(Integer.parseInt(itemNumber)));
            
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details
        // as the example below. You may use the order's display method.
        order.display();

    }

    
}
