// Jennie-rose Barrella
// CSE2
// October 8, 2014
// Loop the Loop

import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String [ ] args) {
        
        //declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        // declare initial variables
        int nStars = -1;
        int counter = 1;
        int stars = 0;
        int counter1 = 1;
        
        System.out.println("loop 3:"); // loop 3
        
        while (true) { // large infinte true loop
           
           System.out.print("Enter an int between 1 and 15: ");
           
            while (!myScanner.hasNextInt()) { // forces user to enter int between 1 and 15, repeat till false
                System.out.print("Enter an int between 1 and 15: ");
                myScanner.next(); // clears input
            }
            
            // when user enters int between 1 and 15
            nStars = myScanner.nextInt();
            
            while  ((nStars>=1) && (nStars<=15)) { // while int between these
                while (counter<=nStars) {  // prints the total number entered of stars
                    System.out.print("*"); 
                    counter++;
                }
                System.out.println(""); // next line
                    
                counter = 1; // reset counter
                    
                while (counter<=nStars) { // increasing lines of stars
                    stars++; // amount of stars print in a row
                    while (counter1<=stars) { // prints row of stars
                        System.out.print("*");
                        counter1++;
                    }
                    counter1=1; // reset counter1 for stars
                    System.out.println(""); // go to next line
                    counter++;
                }
                break; // exits while loop once does other 2 while loops that have an end already due to counter increase
            }
        
            System.out.print("Enter 'Y' or 'y' to go again: ");
            String repeat = myScanner.next();
            
            // reset variables in case have to go again
            nStars = 10;
            counter = 1;
            stars = 0;
            counter1 = 1;
            
            if ( (!repeat.equals("Y")) && (!repeat.equals("y")) ) { // breaks if user doesn't enter "y" or "Y"
                break;
            }
            
        }
        
        System.out.println(""); // go to next line
        
        // reset variables
        nStars = 10;
        counter = 1;

        System.out.println("loop 1:"); // loop 1
        while (counter<=nStars) { // prints total number of stars
            System.out.print("*");
            counter++;
        }
        System.out.println(""); // go to next line
        counter = 1; // reset counter
        //
        
        System.out.println(""); // go to next line
        
        // reset variables
        stars = 0;
        counter1 = 1;
        
        System.out.println("loop 2:"); // loop 2
        
        while (counter<=nStars) { // prints rows of stars
            stars++; // amount of stars print in a row
            while (counter1<=stars) {
                System.out.print("*");
                counter1++;
            }
            counter1=1; // reset counter1 for stars
            System.out.println(""); // go to next line
            counter++;
        }
        //
    
    } // end main method
} // end class