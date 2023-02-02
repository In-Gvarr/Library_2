import java.util.ArrayList;

public class LibraryCatalog {
    private static ArrayList<Publication> publications = new ArrayList<>();


    public static void main(String[] args) {
        addPublication(new Book("12345", "The Great Gatsby", 10.0, "A1", "978-0-679-60131-0"));
        addPublication(new Journal("67890", "Nature", 15.0, "B2", 1, 2022));
        printPublicationsInfo();
    }

    private static void addPublication(Publication publication) {
        publications.add(publication);
    }

    private static void printPublicationsInfo() {
        for (Publication publication : publications) {
            publication.printInfo();
            System.out.println();
        }
    }
}




