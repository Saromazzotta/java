import java.util.Scanner;
public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4;
        double latte = 4.50;
        double cappucino = 4.25; 


        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


        boolean orderStatus = false;
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        // System.out.println(customer1 + pendingMessage);
        // System.out.println(customer4 + pendingMessage);
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please enter name:");
        String customerName = nameInput.nextLine();
        System.out.println(generalGreeting + customerName);
        
        // using switches to complete assignment
        
        double totalPrice = 0;

        switch (customerName) {
            case "Cindhuri":
                totalPrice += dripCoffee;
                orderStatus = isReadyOrder1;
                break;
            case "Sam":
                totalPrice = latte * 2;
                orderStatus = isReadyOrder2;
                break;
            case "Jimmy":
                totalPrice = latte - dripCoffee;
                orderStatus = isReadyOrder3;
                break;
            case "Noah":
                totalPrice += cappucino;
                orderStatus = isReadyOrder4;
                break;

            default:
                System.out.println("Your coffee is ready");
        }

        System.out.println(orderStatus ? customerName + readyMessage +  displayTotalMessage + totalPrice : customerName + pendingMessage + displayTotalMessage + totalPrice);


        // if (isReadyOrder2) {
        //     System.out.println(customer2 + ", " + displayTotalMessage + latte * 2);
        // }
        // else {
        //     System.out.println(customer2 + ", " + pendingMessage);
        // }
        // System.out.println(customer3 + ", " + displayTotalMessage + (latte-dripCoffee));
    }
}
