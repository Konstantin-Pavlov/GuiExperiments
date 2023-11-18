package productInspectionInTheShop;

import java.time.LocalDate;

public class Milk extends Product {

    public Milk(String title, int productExpirationDate, LocalDate producedOn) {
        super(title, productExpirationDate, producedOn);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isFresh() {
        // Get date of production
        LocalDate productionDate = super.getProducedOn();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusDays(super.getProductExpirationDate());

        return currentDate.isBefore(expirationDate);

    }

}
