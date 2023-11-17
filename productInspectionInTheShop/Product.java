package productInspectionInTheShop;

public abstract class Product {
    private String title;
    private int expirationDate;

    public Product(String title, int expirationDate) {
        this.title = title;
        this.expirationDate = expirationDate;
    }
    public abstract boolean isFresh();
    
}
