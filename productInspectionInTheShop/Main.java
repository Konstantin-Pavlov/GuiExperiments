package productInspectionInTheShop;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.fillingTheStoreWithGoods();
        System.out.println(store.products[0].isFresh());
    }

}
