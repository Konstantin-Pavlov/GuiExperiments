package productInspectionInTheShop;

import java.time.LocalDate;
import java.util.Random;

public class Store {

    // todo icebox and chowcase
    Product[] products = new Product[20];

    public void fillingTheStoreWithGoods() {
        Random random = new Random();
        int numberOfDaysToSubtract = random.nextInt(201);
        // LocalDate newDate = currentDate.minusDays(numberOfDaysToSubtract);
        LocalDate productionDate = LocalDate.now().minusDays(numberOfDaysToSubtract);
        products[0] = new Milk("Молоко", numberOfDaysToSubtract, productionDate);
    }

}
