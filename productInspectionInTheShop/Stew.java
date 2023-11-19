package productInspectionInTheShop;

import java.time.LocalDate;

public class Stew extends Product {

    public Stew(String title, int productExpirationDate, LocalDate producedOn, StoragePlace place) {
        super(title, productExpirationDate, producedOn, place);
    }

}
