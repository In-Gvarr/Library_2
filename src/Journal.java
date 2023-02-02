class Journal extends Publication {
    private int issueNumber;
    private int year;

    public Journal(String catalogNumber, String title, double cost, String shelfLocation, int issueNumber, int year) {
        super(catalogNumber, title, cost, shelfLocation);
        this.issueNumber = issueNumber;
        this.year = year;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Issue number: " + issueNumber);
        System.out.println("Year: " + year);
    }
}