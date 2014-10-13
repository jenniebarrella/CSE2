// Jennie-rose Barrella
// October 10, 2014 
// CSE 2
// hw06
// find the approximate square root of the entered double

import java.util.Scanner; // inport scanner

public class Root { // declare class
    public static void main(String [ ] args) { // declare main method
        
        Scanner myScanner = new Scanner (System.in); // declare scanner input
        
        System.out.print("Enter a double greater than 0: ");  // input statement
        
        if (myScanner.hasNextDouble()) { // make sure user enters double
            
            double x = myScanner.nextDouble(); // set variable equal to input
            
            if (x>0) { // make sure input is positive
                
                // declare variables
                double low = 0;
                double high = 1 + x;
                double middle = 0;
                
                while ( ( high-low ) > 0.0000001*( 1+x ) ) { // while statement to stop when high low difference is very small
                    middle = (high+low)/2; // find the number between high and low
                    if ( (middle*middle) > x) { // if middle number is larger than input, middle is the new high
                        high = middle;
                    }  
                    else { // if the middle number is smaller than input, middle is the new low
                        low = middle;
                    }
            
                } // end while
                
                System.out.println("The square root is "+middle); // final print statement
                
            }
            
            else { 
                System.out.println("you did not enter an appropriate value"); // incorrect input
            }    
            
        }
        
        else {
            System.out.println("you did not enter an appropriate value"); // incorrect input
        }
        
    } // end main method
} // end class