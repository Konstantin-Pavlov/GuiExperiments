package productInspectionInTheShop;

import java.time.LocalDate;

public abstract class Product {
    private String title;
    private int productExpirationDate; // days
    private LocalDate producedOn; // дата когда продукт был произведен
    private StoragePlace place;

    public Product(String title, int productExpirationDate, LocalDate producedOn, StoragePlace place) {
        this.title = title;
        this.productExpirationDate = productExpirationDate;
        this.producedOn = producedOn;
        this.place = place;
    }

    public boolean isFresh() {
        // Get date of production
        LocalDate productionDate = getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(getProductExpirationDate());

        return currentDate.isBefore(expirationDate);
    }

    public int getProductExpirationDate() {
        return productExpirationDate;
    }

    public LocalDate getProducedOn() {
        return producedOn;
    }

    public String getTitle() {
        return title;
    }

    public StoragePlace getPlace() {
        return place;
    }

    

}
