public class Driver {
    public static void main(String[] args) {
        Product[] P = new Product[6];

        P[0] = new Product("F001", "Beef Steak", 12.99, Category.Meat);
        P[1] = new Product("F002", "Cheddar Cheese", 5.49, Category.Dairy);
        P[2] = new Product("F003", "Apple", 0.99, Category.Fruits);
        P[3] = new Product("F004", "Carrot", 0.79, Category.Vegetables);
        P[4] = new Product("F005", "Chicken Breast", 8.50, Category.Meat);
        P[5] = new Product("F006", "Milk", 2.89, Category.Dairy);

        // Output results
        for (Product x : P) {
            System.out.println(x);
        }
    }
}
