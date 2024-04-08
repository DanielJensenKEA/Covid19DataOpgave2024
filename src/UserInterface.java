import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    FileHandler fh = new FileHandler();
    private final int SENTINEL = 9;

    public void programmeStart() {
        Scanner sc = new Scanner(System.in);
        int userInput = -1;
        try {

            while (userInput != SENTINEL) {
                displayMenu();

                userInput = sc.nextInt();
                sc.nextLine(); // scannerbug

                switch (userInput) {
                    case 1: {
                        System.out.println("Displaying data...\n");
                        Thread.sleep(500);
                        displayData();
                        break;
                    }
                    case 2: {
                        System.out.println("Loading data...\n");
                        Thread.sleep(500);
                        loadDataFH();
                        break;
                    }
                    case 3: {
                        System.out.println("Sorting data by region...\n");
                        Thread.sleep(500);
                        sortListRegion();
                        break;
                    }
                    case 4: {
                        System.out.println("Sorting data by agegroup...\n");
                        Thread.sleep(500);
                        sortListAge();
                        break;
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error."+e.getMessage());
        }

    }

    public void displayMenu() {
        System.out.println("--------------------");
        System.out.println("1.Display data");
        System.out.println("2. Load from '11_noegletal_pr_region_pr_aldersgruppe.csv'");
        System.out.println("3.Sort list of data. REGION");
        System.out.println("4.Sort list of data. AGEGROUP");
    }

    public void displayData() {
        System.out.println("\nUsorterede liste af data: ");
        for(Covid19Data data:fh.getSamlingCovData()) {
            System.out.println(data);
        }
    }

    public void loadDataFH() throws FileNotFoundException {
        fh.loadDataFromFile();
    }

    public void sortListRegion() {
        Collections.sort(fh.getSamlingCovData(), new RegionComparator());
        System.out.println("\n Samling af data sortereret efter region...");
        for(Covid19Data data:fh.getSamlingCovData()) {
            System.out.println(data);
        }
    }

    public void sortListAge() {
        Collections.sort(fh.getSamlingCovData(), new AgeComparator());
        System.out.println("\n Samling af data sorteret efter aldersgruppe...");
        for(Covid19Data data: fh.getSamlingCovData()) {
            System.out.println(data);
        }
    }
}
