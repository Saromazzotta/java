import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    // public int getStreakGoal() {
    //     for (int i = 0; i < 11; i++) {
    //         return int i+i;
    //     }
    // }

    public int getStreakGoal() {
        return (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        int i;

        for (i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }
    
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i) + " " + i);
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %s people in front you" + " ", customers.size());
        customers.add(userName);
        System.out.println(userName);
    }
}
