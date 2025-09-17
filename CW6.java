public class CW6 {
    public static void main(String[] args) {
        int[] stock = {20, 15, 30, 0, 25}; 
        int total = 0;

        for (int quantity : stock) {
            if (quantity == 0) {
                System.out.println("Out of stock");
                break;
            }
            total += quantity; 
        }

        System.out.println("Total stock: " + total);

        if (total < 50) {
            System.out.println("Low Stock");
        } else if (total <= 100) {
            System.out.println("Moderate Stock");
        } else {
            System.out.println("Good Stock");
        }
    }
}
