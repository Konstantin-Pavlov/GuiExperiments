package productInspectionInTheShop;

import java.time.LocalDate;

public class Salt extends Product {

    public Salt(String title, int productExpirationDate, LocalDate producedOn, StoragePlace place) {
        super(title, productExpirationDate, producedOn, place);
    }

}
