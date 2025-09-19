import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GroceryStore {

    static String[] items = {"Rice", "Sugar", "Oil", "Soap", "Milk"};
    static int[] prices = {50, 40, 100, 25, 30};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] quantities = new int[items.length];

        System.out.println("Welcome to the Grocery Store!");
        System.out.println("Available items and prices (per unit):");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - Rs." + prices[i]);
        }

        try {
            for (int i = 0; i < items.length; i++) {
                System.out.print("Enter quantity for " + items[i] + ": ");
                quantities[i] = Integer.parseInt(scanner.nextLine());
            }

            double totalAmount = calculateTotal(quantities);
            System.out.println("\nTotal cost: Rs." + totalAmount);

            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Purchase Date & Time: " + now.format(formatter));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values for quantities.");
        }

        scanner.close();
    }

    public static double calculateTotal(int[] quantities) {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += quantities[i] * prices[i];
        }

        if (total > 500) {
            System.out.println("You are eligible for a 10% discount!");
            total *= 0.9;
        }

        return total;
    }
}
