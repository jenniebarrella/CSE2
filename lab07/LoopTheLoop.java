// Jennie-rose Barrella
// CSE2
// October 8, 2014
// Loop the Loop
// use loops to print the number of stars indicated by input
// then print stars starting with 1 on each line till in the indiacted number


import java.util.Scanner;
public class LoopTheLoop {
    public static void main(String [ ] args) {
        
        //declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        // declare initial variables
        int nStars = 20; // starts nStars at number outside range to get into first while statement
        int counter = 1;
        int stars = 0;
        int counter1 = 1;
        
        System.out.println("loop 3:"); // loop 3
        
        while (true) { // large infinte true loop
        
            while ((nStars < 1) || (nStars > 15) ) { // starts here and repeats if enter number outside range
                System.out.print("Enter an int between 1 and 15: "); // prompts input
                while (!myScanner.hasNextInt()) { // forces user to enter int, repeats till int entered
                    System.out.print("Enter an int between 1 and 15: "); // if doesn't enter int asks again
                    myScanner.next(); // clears input
                }
                myScanner.hasNext();
                nStars = myScanner.nextInt(); // changes value of nStars to whatever entered and repeats if not good input
            }
            
            // when user enters int between 1 and 15
            
            while  ( (nStars>=1) && (nStars<=15) ) { // while int between 1 and 15
                while (counter<=nStars) {  // prints the total number entered of stars
                    System.out.print("*"); // prints stars on same line till exits loop
                    counter++; // increases counter by 1 so can eventaully exit loop
                }
                System.out.println(""); // next line
                    
                counter = 1; // reset counter
                
                // prints different amount of stars in each row    
                while (counter<=nStars) { // increasing lines of stars
                    stars++; // amount of stars to print in row, increases by 1 each time
                    while (counter1<=stars) { // prints row of stars
                        System.out.print("*"); // prints stars on same line till exits loop
                        counter1++;  // increases counter by 1 so can eventaully exit loop
                    }
                    counter1=1; // reset counter1 for stars
                    System.out.println(""); // go to next line
                    counter++; // increase counter so will eventually stop while loop
                }
                break; // exits while loop once finishes other 2 while loops that have an end already due to counter increase
            }
        
            System.out.print("Enter 'Y' or 'y' to go again: ");
            String repeat = myScanner.next();
            
            // reset variables in case have to go again
            nStars = 20;
            counter = 1;
            stars = 0;
            counter1 = 1;
            
            if ( (!repeat.equals("Y")) && (!repeat.equals("y")) ) { // breaks if user doesn't enter "y" or "Y"
                break;
            }
            
        }
        // end loop 3
        System.out.println(""); // go to next line
        
        // reset variables
        nStars = 10;
        counter = 1;

        System.out.println("loop 1:"); // loop 1
        while (counter<=nStars) { // prints total number of stars
            System.out.print("*"); // prints stars on same line till exits loop
            counter++; // increase counter so can exit evenually
        }
        System.out.println(""); // go to next line
        counter = 1; // reset counter
        // end loop 1
        
        System.out.println(""); // go to next line
        
        // reset variables
        stars = 0;
        counter1 = 1;
        
        System.out.println("loop 2:"); // loop 2
        
        while (counter<=nStars) { // prints rows of stars
            stars++; // amount of stars print in a row, increases by 1 each time
            while (counter1<=stars) { // prints row of stars
                System.out.print("*");  // prints stars on same line till exits loop
                counter1++;  // increases counter by 1 so can eventaully exit loop
            }
            counter1=1; // reset counter1 for stars
            System.out.println(""); // go to next line
            counter++;  // increases counter by 1 so can eventaully exit loop
        }
        // end loop 2
    
    } // end main method
} // end class