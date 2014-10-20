// Jennie-rose Barrella
// October 18,2014
// CSE2
// hw07 NumberStack

import java.util.Scanner;
public class NumberStack {
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.print("Enter an integer between 1 and 9: ");
        
        if ( !myScanner.hasNextInt() ) { // if statement to exit program if int not entered
            int out = 1;
            System.out.println("You did not enter and int value");
            return;
        }
        
        int out = 1; // decalre printed variable
        int n = myScanner.nextInt(); // declare scanner variable
        
        if (n>=1 && n<=9) { // if statement to guarantee correct integer
            
            // for loops
            
            System.out.println("For Loops:"); 
                
            for(int big=1; big<=n; big++) { // big for loop to keep repeating for all numbers till n
                
                for (int row=1; row <= out; row++) { // loop to print correct number of rows
                    
                    for (int blank=1; blank <= (n-out); blank++) { // print blanks to get pyramid
                        System.out.print(" ");
                    }
                    
                    for (int start=1; start <= ((out*2)-1); start++) { // print correct number, amount of times to print = out*2-1
                        System.out.print(out);
                    }
                
                    System.out.println(""); // go to next line
                
                }
                
                for (int blank=1; blank <= (n-out); blank++) { // print blanks to center dashes
                        System.out.print(" ");
                }
                
                for(int dash=1; dash <= ((out*2)-1); dash++) { // print dashes same as numbers
                    System.out.print("-");
                }    
                
                System.out.println(""); // next line
                out++; // increment printed number so that big loop prints next number
            }   
            
            System.out.println("");
            
            // while loops
            
            System.out.println("While Loops:");
            
            int big = 1; // declare big value - redeclare because of scope
            out = 1; // reset out value
            
            while (big <= n) { // big loop to keep printing till n
                
                int row = 1; // delare row
                
                while ( row <= out) { // print same amount of rows as number printing
                    
                    int blank = 1; // declare blank
                    while (blank <= (n-out)) { // print blanks, the number printed less than the number inputed
                        System.out.print(" ");
                        blank++; // increment blank
                    }
                    
                    int start = 1; // declare start
                    while (start <= ((out*2)-1)) { // print number
                        System.out.print(out);
                        start++;  // increment start
                    }
                    
                    System.out.println(""); // next line
                    row++; // increment row
                }
                
                int blank = 1; // declare blank in new scope
                while (blank <= (n-out)) { // print blanks
                    System.out.print(" ");
                    blank++; // increment
                }
                
                int dash = 1; // declare dash
                while (dash <= ((out*2)-1)) {  // print dashes just like printed number
                    System.out.print("-");
                    dash++; // increment
                }
                
                System.out.println(""); // next line
                out++; // increment out so next time prints next number
                big++; // next time through big loop
            }
            
            System.out.println("");
            
            // do-while loops
            
            System.out.println("Do-while Loops:");
            
            big = 1; // reset variables
            out = 1;
            
            do {
                
                int row = 1; // declare used in next do-while loop
                do { // row do loop
                    
                    int blank = 1; // declare
                    do { // blank do loop
                        if (n-out==0){ // if the out and n ar the same then dont need to put in blanks
                            break; // exit this do-while
                        }
                        System.out.print(" "); // print blanks
                        blank++;    // increment
                    } while (blank <= (n-out)); // blanks correspond to difference between input and printed number
                    
                    int start = 1; // declare
                    do { // print do loop
                        System.out.print(out); // print number
                        start++;    // increment
                    } while (start <= ((out*2)-1)); // print number this many times
                    
                    System.out.println(""); // new line
                    row++; // increment row for the large do loop
                    
                } while ( row <= out); // keep going till amount of rows = number printed
                
                int blank = 1; // declare
                do { // blanks
                    if (n-out==0){ // again dont do blanks if input and print are the same
                            break; // escape this loop
                    }
                    System.out.print(" ");
                    blank++;    // increment
                } while (blank <= (n-out)); // blanks correspond to difference between input and printed number
                
                int dash = 1; // declare
                do { // print dashes same as number printed
                    System.out.print("-");
                    dash++;    
                } while (dash <= ((out*2)-1)); // same amount as how many times printed the number
                
                System.out.println("");
                out++; // increment number to print
                big++; // next time through big loop
                
            }while (big <= n); // do big loop while "big" which starts at one is less than or equal to input
            
            
        }
        
        else { // if didnt enter a good int
            System.out.println("You did not enter an appropriate integer");
        }
        
    } // end main method
} // end class