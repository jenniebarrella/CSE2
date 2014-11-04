// Jennie-rose Barrella
// CSE2
// October 31, 2014 - HALLOWEEN
// hw09

import java.util.Scanner;
public class BlockedAgain{
    public static final Scanner myScanner = new Scanner (System.in);
    
    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    } // end main method
    
    
    // problem A
    public static int getInt() {
        System.out.print("Enter an integer between 1 and 9: "); // request input
        while (true) { // while true loop - so waits for correct input
            boolean goodInt = checkInt( ); // set boolean equal to checkInt method result, dont plug in just go there
            if (goodInt == false) { // if myScanner does not return int 
                System.out.print("You did not enter an int value, try again: ");
                myScanner.next(); // clear scanner so can get to "int input =" with new input
                continue; // restart while true loop
            }
            int input = myScanner.nextInt(); // declare int input to the int entered
            boolean goodRange = checkRange( input ); // boolean equal to the check range method
            if (goodRange == false) { // if returns false
                System.out.print("You did not enter an appropriate int value, try again: ");
                continue; // restart
            }
            return input; // go back to main method with input set as m
        }
        
    }
    
    public static boolean checkInt( ) { // check int entered
        if (myScanner.hasNextInt()) { // if int entered return true boolean
            return true;
        }
        else {
            return false;
        }
    }
    
    public static boolean checkRange( int input ) { // check range
        if ( input >= 1 && input <= 9) { // if input is between 1 and 9 return true boolean
            return true;
        }
        else {
            return false;
        }
    }
    
    // problem b
    public static int allBlocks( int x) { // take m (input from other methods) and set as x
        line(x); // plug in x to line method
        return x; // go back to main method
    }
    
    public static int line( int x ) { // print appropriate lines of method block
        int out = 1; // set initial out print value
        while (out<=x) { // while this value is less the user input
            for (int row=1; row <= out; row++) { // for statement to print correct rows
                int block = block(x, out); // go to block statement each time to print row, plug in input and current out value - redo for loop for each out value
            }
            for (int blank=1; blank <= (x-out); blank++) { // print blanks to center dashes
                System.out.print(" ");
            }
                    
            for(int dash=1; dash <= ((out*2)-1); dash++) { // print dashes same as numbers
                System.out.print("-");
            }    
                    
            System.out.println(""); // next line
            out++; // increment printed number so the while statement keeps going and prints new numbers
        }
        return x; // back to method allBlocks
    } 
    
    public static int block (int x, int out) { // print in each row- need to use the input value and the incrementing out value from line method
        for (int blank=1; blank <= (x-out); blank++) { // print blanks to get pyramid
            System.out.print(" ");
        }
                    
        for (int start=1; start <= ((out*2)-1); start++) { // print correct number, amount of times to print = out*2-1
            System.out.print(out); // print the number
        }
                
        System.out.println(""); // go to next line
        return x; // back to line method
    }
    
    
} // end class
