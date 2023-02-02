
class Publication {
    private String catalogNumber;
    private String title;
    private double cost;
    private String shelfLocation;

    public Publication(String catalogNumber, String title, double cost, String shelfLocation) {
        this.catalogNumber = catalogNumber;
        this.title = title;
        this.cost = cost;
        this.shelfLocation = shelfLocation;
    }

    public void printInfo() {
        System.out.println("Catalog number: " + catalogNumber);
        System.out.println("Title: " + title);
        System.out.println("Cost: " + cost);
        System.out.println("Shelf location: " + shelfLocation);
    }
}