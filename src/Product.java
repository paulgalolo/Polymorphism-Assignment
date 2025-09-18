public class Product implements Category, PasswordLockeable {
    private String productCode;
    private String description;
    private double price;
    private int category;
    private String password;
    private boolean productIsLocked;

    // Parameterized Constructor
    public Product(String productCode, String Description, double price, int category) {
        setProductCode(productCode);
        setPrice(price);
        setDescription(Description);
        setCategory(category);
    }

    // Default Constructor
    public Product() {

    }

    // Product Accessor and Mutator
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        if (!isLocked()) {
            this.productCode = productCode;
        } else
            System.out.print("Error");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!isLocked()) {
            this.description = description;
        } else
            System.out.print("Error");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (!isLocked()) {
            this.price = price;
            System.out.print("Success!");
        } else
            System.out.print("Error");
    }

    public void setPassword(String password) { // Only mutator
        this.password = password;
    }

    public boolean isProductIsLocked() {
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

    // "PasswordLockable" methods via interface
    @Override
    public void setPassword() {

    }

    @Override
    public void Unlock() {
        this.productIsLocked = false;
    }

    @Override
    public void Lock() {
        this.productIsLocked = true;
    }

    @Override
    public boolean isLocked() {
        return isProductIsLocked();
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