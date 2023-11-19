package productInspectionInTheShop;

public enum StoragePlace {
    ICEBOX("Icebox"), SHOWCASE("Showcase");

    private String place;

    StoragePlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    
}
