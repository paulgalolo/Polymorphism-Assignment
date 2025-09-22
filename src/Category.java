public interface Category {

    // Abstract Methods
    void setCategory(int category);
    String getCategory();

    // Categories
    int UNCLASSIFIED = 0;
    int Meat = 1;
    int Dairy = 2;
    int Fruits = 3;
    int Vegetables = 4;
}