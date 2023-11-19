package productInspectionInTheShop;

import java.time.LocalDate;
import java.util.Random;

public class Store {

    // todo icebox and chowcase
    Product[] products = new Product[20];

    //  здесь пока просто заполняется один элемент
    public void fillingTheStoreWithGoods() {
        Random random = new Random();
        StoragePlace place;
        for (int i = 0; i < products.length; i++) {
            int numberOfDaysToSubtract = random.nextInt(200) + 1;
            LocalDate productionDate = LocalDate.now().minusDays(numberOfDaysToSubtract);
            int randomProduct = random.nextInt(5);
            if(random.nextBoolean()){
                place = StoragePlace.ICEBOX;
            }
            else{
                place = StoragePlace.SHOWCASE;
            }
            switch (randomProduct) {
                case 0:
                    products[i] = new Milk("Молоко", 60, productionDate, place);
                    break;
                case 1:
                    products[i] = new Salt("Соль", 1000, productionDate, place);// переделать на инф
                    break;
                case 2:
                    products[i] = new Fish("Рыба", 20, productionDate, place);
                    break;
                case 3:
                    products[i] = new Corn("Кукуруза", 150, productionDate, place);
                    break;
                case 4:
                    products[i] = new Stew("Тушёнка", 180, productionDate, place);
                    break;
            }
        }
    }

}
