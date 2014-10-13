// Jennie-rose Barrella
// October 10, 2014 
// CSE 2
// hw06

import java.util.Scanner;

public class Root {
    public static void main(String [ ] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter a double greater than 0: ");
        
        if (myScanner.hasNextDouble()) {
            
            double x = myScanner.nextDouble();
            
            if (x>0) {
                
                double low = 0;
                double high = 1 + x;
                double middle = 0;
                
                while ( ( high-low ) > 0.0000001*( 1+x ) ) {
                    middle = (high+low)/2;
                    if ( (middle*middle) > x) {
                        high = middle;
                    }  
                    else {
                        low = middle;
                    }
            
                }
                
                System.out.println("The square root is "+middle);
                
            }
            
            else { 
                System.out.println("you did not enter an appropriate value");
            }    
            
        }
        
        else {
            System.out.println("you did not enter an appropriate value");
        }
        
    } // end main method
} // end class