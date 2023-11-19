package productInspectionInTheShop;

import java.time.LocalDate;

public class ProductExpirationExample {
    public static void main(String[] args) {
        // Assuming the product was made on April 1, 2022
        LocalDate productionDate = LocalDate.of(2022, 4, 1);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Assuming the product has a shelf life of 1 year
        long shelfLifeInMonths = 12;

        // Calculate the expiration date
        LocalDate expirationDate = productionDate.plusMonths(shelfLifeInMonths);

        // Check if the product is expired
        if (currentDate.isAfter(expirationDate)) {
            System.out.println("The product is expired.");
        } else {
            System.out.println("The product is not expired.");
            System.out.println("Expiration Date: " + expirationDate);
        }
    }
}
