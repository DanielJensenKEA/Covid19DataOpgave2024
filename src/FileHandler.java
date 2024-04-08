import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
    private ArrayList<Covid19Data> samlingCovData = new ArrayList<>();

    public ArrayList<Covid19Data> loadDataFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        //sc = new Scanner(file);
        sc.nextLine();

        Covid19Data dataSaet = null;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            dataSaet = new Covid19Data(attributes[0], attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]), Integer.parseInt(attributes[5]), attributes[6]);
            samlingCovData.add(dataSaet);
        }
        sc.close();
        return samlingCovData;
    }

    public ArrayList<Covid19Data> getSamlingCovData() {
        return samlingCovData;
    }
}
