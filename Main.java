import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int milesMon = 0;
        int milesTue = 0;
        int milesWed = 0;
        int milesThr = 0;
        int milesFri = 0;
        int milesSat = 0;
        int milesSun = 0;
        String mon = "Monday";
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thr = "Thursday";
        String fri = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";
        
        System.out.println("Spring 2024 - CS1083 - Section 003 - Project 1 - Trucking - written by Joe Beltran");  
        
        for (int i = 7; i > 0; --i) {
            if (i == 7) {
                System.out.println("Enter average miles driven on " + mon);
                milesMon = scnr.nextInt();

            }
            else if (i == 6) {
                System.out.println("Enter average miles driven on " + tue);
                milesTue = scnr.nextInt();
            }
            else if (i == 5) {
                System.out.println("Enter average miles driven on " + wed);
                milesWed = scnr.nextInt();
            }
            else if (i == 4) {
                System.out.println("Enter average miles driven on " + thr);
                milesThr = scnr.nextInt();
            }
            else if (i == 3) {
                System.out.println("Enter average miles driven on " + fri);
                milesFri = scnr.nextInt();
            }
            else if (i == 2) {
                System.out.println("Enter average miles driven on " + sat);
                milesSat = scnr.nextInt();
            }
            else if (i == 1) {
                System.out.println("Enter average miles driven on " + sun);
                milesSun = scnr.nextInt();
            }
        }
        
        
        System.out.println("Miles driven on " + mon + ": " + milesMon);
        System.out.println("Miles driven on " + tue + ": " + milesTue);
        System.out.println("Miles driven on " + wed + ": " + milesWed);
        System.out.println("Miles driven on " + thr + ": " + milesThr);
        System.out.println("Miles driven on " + fri + ": " + milesFri);
        System.out.println("Miles driven on " + sat + ": " + milesSat);
        System.out.println("Miles driven on " + sun + ": " + milesSun);
        System.out.println("Total miles driven: " + (milesMon + milesTue + milesWed + milesThr + milesFri + milesSat + milesSun));
    }
}
