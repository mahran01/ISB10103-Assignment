import java.util.*;

public class Main {
    
    public static void main(String args[]) {
        
        /*
         * ------------------------------------------------------------
         *  Task 1 - Initiate all arrays
         * ------------------------------------------------------------
         */
        
        String[] codes = {"BS01", "BS02", "BS03", "BS04"};
        String[] products = {"Lipstick", "Compact Powder", "UV Sun Protection", "Lotion"};
        double[] pricesSetA = {200.00, 200.00, 300.00, 100.00};
        double[] pricesSetB = {250.00, 400.00, 500.00, 350.00};
        
        /*
         * ------------------------------------------------------------
         *  Task 2 - Display
         * ------------------------------------------------------------
         */
        
        // Print the header
        System.out.println("                          Beauty Salon                          ");
        System.out.println("                             Gombak                             ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Code  Products           Price (Set A)  Price (Set B)           ");
        System.out.println("----------------------------------------------------------------");
        
        // Print the body
        for (int i = 0; i < codes.length; i++) {

            System.out.format("%-4s  %-17s  %-13.2f  %-13.2f\n", codes[i], products[i], pricesSetA[i], pricesSetB[i]);
        }
        
        /*
         * ------------------------------------------------------------
         *  Task 3 - Calculate and display total price
         * ------------------------------------------------------------
         */
        
        // Initialize total for price (set A) and price (set B)
        double totalPricesSetA = 0.0, totalPricesSetB = 0.0;

        // Add all prices from set A to its total
        for (double priceSetA : pricesSetA) {
        
            totalPricesSetA += priceSetA;
        }
        
        // Add all prices from set B to its total
        for (double priceSetB : pricesSetB) {
        
            totalPricesSetB += priceSetB;
        }
        
        // Print empty line for readability reason
        System.out.println();
        
        // Print both total
        System.out.format("Total Price (Set A): RM %.2f\n", totalPricesSetA);
        System.out.format("Total Price (Set B): RM %.2f\n", totalPricesSetB);
        
        /*
         * ------------------------------------------------------------
         *  Task 4 - Sort Price (Set B)
         * ------------------------------------------------------------
         */
        
        // Sort Price (Set B) in ascending order
        Arrays.sort(pricesSetB);
        
        // Reverse Price (Set B) arrangement to make it appear as descending order
        for (int i = 0; i < pricesSetB.length / 2; i++) {

            double tmp = pricesSetB[i];
            pricesSetB[i] = pricesSetB[pricesSetB.length - 1 - i];
            pricesSetB[pricesSetB.length - 1 - i] = tmp;
        }
        
    }
}
