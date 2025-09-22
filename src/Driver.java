// Driver.java
// Paul Galolo
// COMP 1231 Assignment 1

// This program creates an array of products with different names, prices, and categories.
// It prints all products, sets a password for the first product to lock and unlock it,
// attempts a price update, and displays the updated record.
// Finally, it identifies and prints the two lowest-priced products,
// demonstrating product management and simple comparison logic.
public class Driver {
    public static void main(String[] args) {

        Product p = new Product();
        Product[] P = new Product[6];

        P[0] = new Product("XXXX", "Xbox Series X", 560.23, Category.UNCLASSIFIED);
        P[1] = new Product("F002", "Cheddar Cheese", 5.49, Category.Dairy);
        P[2] = new Product("F003", "Apple", 14.56, Category.Fruits);
        P[3] = new Product("F004", "Carrot", 12.24, Category.Vegetables);
        P[4] = new Product("F005", "Chicken Breast", 10.99, Category.Meat);
        P[5] = new Product("F006", "Milk", 10.01, Category.Dairy);

        /* TEST CODES */

        // Output Array
        for (Product x : P) {
            System.out.println(x);
        }

        // Setup password
        P[0].setPassword("XYZ");

        // Lock the product
        P[0].Lock("XYZ");

        // First Product Record
        System.out.println(P[0].toString());

        // Unlocking the Product
        // Input wrong password to show error message
        P[0].Unlock("XYZ");

        // Unlock the first product using wrong password
        P[0].setPrice(19.98);

        // Updated Record
        System.out.println(P[0].toString());

        // Outputting two cheapest items
        Product productInstance = new Product();
        Product[] lowest = productInstance.compareTo(P);

        System.out.println("\nTwo lowest-priced products:");
        System.out.println(lowest[0]);
        System.out.println(lowest[1]);
    }
}
