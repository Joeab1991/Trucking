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
      int columnWidth = 9;
      int daysPerMonth = 1;
      int monLength = 6;
      int tueLength = 7;
      int wedLength = 9;
      int thrLength = 8;
      int friLength = 8;
      int satLength = 8;
      int sunLength = 6;
        
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

      // creat a table header with column names (Week, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Total/Week)

      System.out.print("Week");
      for (int i = (columnWidth - 4); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(mon);
      for (int i = (columnWidth - monLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(tue);
      for (int i = (columnWidth - tueLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(wed);
      System.out.print(thr);
      for (int i = (columnWidth - thrLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(fri);
      for (int i = (columnWidth - friLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(sat);
      for (int i = (columnWidth - satLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.print(sun);
      for (int i = (columnWidth - sunLength); i > 0; --i) {
         System.out.print(" ");
      }
      System.out.println("Total/Week");

      // create a row with the week number, miles driven each day, and the total miles driven for the week
      for (int i = 1; i <= 5; ++i) {
         System.out.printf("%-9s", i);
         System.out.printf("%-9s", daysPerMonth + "-" + milesMon);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesTue);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesWed);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesThr);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesFri);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesSat);
         daysPerMonth++;
         System.out.printf("%-9s", daysPerMonth + "-" + milesSun);
         daysPerMonth++;
         System.out.printf("%-9s\n", "W" + i + "-" + (milesMon + milesTue + milesWed + milesThr + milesFri + milesSat + milesSun));
         // System.out.printf("%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d%-9d\n", i, milesMon, milesTue, milesWed, milesThr, milesFri, milesSat, milesSun, (milesMon + milesTue + milesWed + milesThr + milesFri + milesSat + milesSun));
         
      }
        
   }
}
