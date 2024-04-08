import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        try {
            ui.programmeStart();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }



        //FileHandler fh = new FileHandler();
        /*
        try {


            ArrayList<Covid19Data> samlingCovData = fh.loadAllWinners();
            System.out.println("Usorterede");
            for (Covid19Data winner : samlingCovData) {
                System.out.println(winner);
            }


            Collections.sort(samlingCovData, new RegionComparator());
            System.out.println("\nSorteret på Region");
            for(Covid19Data winner : samlingCovData) {
                System.out.println(winner);
            }

            Collections.sort(samlingCovData, new AgeComparator());
            System.out.println("\nSorteret på Aldersgruppe");
            for(Covid19Data winner : samlingCovData) {
                System.out.println(winner);
            }


        } catch (Exception e) {
            System.out.println("Error, "+e.getMessage());
        }
        */
    }
}
