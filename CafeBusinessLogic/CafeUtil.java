import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        return getStreakGoal(10);
    }

    // Ninja: Overload method
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double totalCost = 0;
        for(int i = 0; i < prices.length; i++) {
            totalCost += prices[i];
        }
        return totalCost;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format("%d %s", i, menuItems.get(i)));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println(String.format("Hello, %s!", username));
        System.out.println(String.format("There are %d people in front of you.", customers.size()));
        customers.add(username);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for(int i = 1; i < maxQuantity + 1; i++) {
            double cost = (price * i) - (.50 * (i-1));
            System.out.println(String.format("%d - $%.2f", i, cost));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if(menuItems.size() != prices.size()) {
            return false;
        }
        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(String.format("%d %s -- $%.2f", i, menuItems.get(i), prices.get(i)));
        }
        return true;
    }
}