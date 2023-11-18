package productInspectionInTheShop;

import java.time.LocalDate;

public abstract class Product {
    private String title;
    private int productExpirationDate; // days
    private LocalDate producedOn; // дата когда продкут был произведен

    public Product(String title, int productExpirationDate, LocalDate producedOn) {
        this.title = title;
        this.productExpirationDate = productExpirationDate;
        this.producedOn = producedOn;
    }

    public abstract boolean isFresh();

    public int getProductExpirationDate() {
        return productExpirationDate;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    

}
