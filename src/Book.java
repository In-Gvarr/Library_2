class Book extends Publication {
    private String ISBN;

    public Book(String catalogNumber, String title, double cost, String shelfLocation, String ISBN) {
        super(catalogNumber, title, cost, shelfLocation);
        this.ISBN = ISBN;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ISBN: " + ISBN);
    }
}