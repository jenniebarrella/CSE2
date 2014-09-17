// Jennie-rose Barrella
// September 17, 2014
// CSE02
// lab04
// Big Mac Again
// Ask how many Big Macs and if they want fries with that
// print the total cost of the meal
import java.util.Scanner;
public class BigMacAgain {
    // main method
    public static void main(String[ ] args) {
        
        // declare scanner
        Scanner myScanner; // scanner name is myScanner
        myScanner = new Scanner (System.in);
        
        // declare variables
        int bigMac = 0;
        double bigMacCost=0;
        
        // user input for Big Macs
        System.out.print("Enter the number of Big Macs: ");
        if (myScanner.hasNextInt()) {  // is an integer
            bigMac = myScanner.nextInt();
            if (bigMac>=0) {
            bigMacCost = bigMac*2.22;
            System.out.println("You ordered "+bigMac+ " Big Macs for a cost of "+bigMac+"x2.22 = "+bigMacCost); //big mac cost
            } // end of if
            else {
                System.out.println("You did not enter an int > 0");
                return; // end program
            } // end of else
        } // end of if
        else { // not an integer
            System.out.println("You did not enter an int");
            return;    // leaves program i.e.
                          // the program terminates
        } // end of else
        
        // user input for fries
        System.out.print("Do you want an order of fries (Y,y,N,n)? ");
        if (myScanner.hasNext()) {
            String fries = myScanner.next();
            if (fries.equals("Y")) { // ordered fries
                System.out.println("You ordered french fries at the cost of $2.15");
                double MealCost = bigMacCost+2.15;
                System.out.println("The total cost of the meal is "+MealCost);
            } // end of if
            else if (fries.equals("y")) { // ordered fries
                System.out.println("You ordered french fries at the cost of $2.15");
                double MealCost = bigMacCost+2.15;
                System.out.println("The total cost of the meal is "+MealCost);
            } // end of if
            else if (fries.equals("N")) { // didn't order fries
                System.out.println("The total cost of the meal is "+bigMacCost);
            } // end of if
            else if (fries.equals("n")) { // didn't order fries
                System.out.println("The total cost of the meal is "+bigMacCost);
            } // end of if
            else { // didn't enter acceptable value
                System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
                return; // end program
            } // end of else
        }  // end of if      
        else { // didn't enter string value
            System.out.println("You did not enter one of 'y', 'Y', 'N', 'n'");
            return;    // leaves program i.e.
                          // the program terminates
        } // end of else
        
        
    } // end of main method
} // end of class