import java.util.Objects;

public class Product implements Category, PasswordLockeable, Comparable {
    private String productCode;
    private String description;
    private double price;
    private int category;
    private String password;
    private boolean productIsLocked;

    // Parameterized Constructor
    public Product(String productCode, String Description, double price, int category) {
        setProductCode(productCode);
        this.price = price;
        setDescription(Description);
        setCategory(category);
    }

    // Default Constructor
    public Product() {

    }

    /*  Product Accessor and Mutator */

    // Accessor for Product Code
    public String getProductCode() {
        return productCode;
    }

    // Mutator for Product Code
    public void setProductCode(String productCode) {
        if (!isLocked()) {
            this.productCode = productCode;
        } else
            System.out.println("Record LOCKED, Unable to update");
    }

    // Accessor for description
    public String getDescription() {
        return description;
    }

    // Mutator for Description
    public void setDescription(String description) {
        if (!isLocked()) {
            this.description = description;
        } else
            System.out.println("Record LOCKED, Unable to update");
    }

    // Accessor for Price
    public double getPrice() {
        return price;
    }

    // Mutator for Price
    public void setPrice(double price) {
        if (!isLocked()) {
            this.price = price;
            System.out.println("Update Success");
        } else
            System.out.println("Record LOCKED, Unable to update");
    }

    // Accessor to check if product is locked
    public boolean isProductLocked() {
        return productIsLocked;
    }

    // Convert Category
    public String convertCategory(int category) {
        switch (category) {
            case 1:
                return "Meat";
            case 2:
                return "Dairy";
            case 3:
                return "Fruits";
            case 4:
                return "Vegetables";
            default:
                return "UNCLASSIFIED";
        }
    }

    // "Category" methods via interface
    @Override
    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String getCategory() {
        return convertCategory(this.category);
    }

    /* PasswordLockable methods via interface */

    // Lets user set up the password
    @Override
    public void setPassword(String setPassword) {
        this.password = setPassword;
        System.out.println("Password has been set up");
    }

    // Unlocks the product
    @Override
    public void Unlock(String passwordUnlock) {
        if (Objects.equals(this.password, passwordUnlock)) {
            this.productIsLocked = false;
            System.out.println("Product is Unlocked");
        } else
            System.out.println("Wrong password");
    }

    // Locks the product
    @Override
    public void Lock(String passwordLock) {
        if (Objects.equals(this.password, passwordLock)) {
            this.productIsLocked = true;
            System.out.println("Product is Locked");
        } else
            System.out.println("Wrong password");
    }

    // Returns a value of true and false depending on if Product is locked or not
    @Override
    public boolean isLocked() {
        return isProductLocked();
    }

    // Method to find the two cheapest items in the array
    @Override
    public Product[] compareTo(Product[] P) {
        Product firstMin = null;
        Product secondMin = null;

        for (Product p : P) {
            if (firstMin == null || p.getPrice() < firstMin.getPrice()) {
                secondMin = firstMin;
                firstMin = p;
            } else if (secondMin == null || (p.getPrice() < secondMin.getPrice()) && p.getPrice() != firstMin.getPrice()) {
                secondMin = p;
            }
        }
        return new Product[]{firstMin, secondMin};
    }

    // ToString() method
    @Override
    public String toString() {
        return "Code: " + getProductCode() +
                " Price: " + getPrice() +
                " Description: " + getDescription() +
                " Category: " + getCategory();
    }
}