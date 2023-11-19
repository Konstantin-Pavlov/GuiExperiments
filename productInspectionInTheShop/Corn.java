package productInspectionInTheShop;

import java.time.LocalDate;

public class Corn extends Product {

    public Corn(String title, int productExpirationDate, LocalDate producedOn, StoragePlace place) {
        super(title, productExpirationDate, producedOn, place);
    }

}
