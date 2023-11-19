package productInspectionInTheShop;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.fillingTheStoreWithGoods();
        System.out.printf("%50s %n%n", "Inspection result");
        System.out.printf("|%-10s | %-15s | %-15s | %-5s | %5s |%n",
                "Product", "Produced on", "Storage place", "S. life days", "Fresh");
        drawLine();
        for (int i = 0; i < store.products.length; i++) {
            // System.out.println(store.products[i].getTitle());
            // System.out.println(store.products[i].isFresh());
            // System.out.printf("%-10s %-5d %-10.2f\n", name, age, salary);
            System.out.printf("|%-10s | %-15s | %-15s | %-12d | %5s |%n",
                    store.products[i].getTitle(),
                    store.products[i].getProducedOn(),
                    store.products[i].getPlace(),
                    store.products[i].getProductExpirationDate(),
                    store.products[i].isFresh());

        }
        drawLine();

        // StoragePlace place = StoragePlace.ICEBOX.ICEBOX;
        // System.out.println(place.getPlace());
    }

    private static void drawLine() {
        for (int i = 0; i < 72; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
