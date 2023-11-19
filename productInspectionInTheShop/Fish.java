package productInspectionInTheShop;

import java.time.LocalDate;

public class Fish extends Product {

    public Fish(String title, int productExpirationDate, LocalDate producedOn, StoragePlace place) {
        super(title, productExpirationDate, producedOn, place);
    }

}
