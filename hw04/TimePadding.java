// Jennie-rose Barrella
// September, 19,2014
// CSE2
// hw04
// enter int for number of seconds
// display time in hours:minutes:seconds
// be sure to include 0's so always 2 places in minutes and seconds

import java.util.Scanner;
public class TimePadding {
    public static void main(String[ ] args) {
    
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter the time in seconds: ");
        int seconds = myScanner.nextInt();
    
        int secondsDivide60 = seconds/60;
        int secondsnew = seconds - (secondsDivide60*60); // seconds
    
        int hour = secondsDivide60/60; // hours
    
        int minute = secondsDivide60 - (60*hour); // minutes
        
        // to display 0's
        if (minute<10 && secondsnew<10) {
            System.out.printf("The time is %d:0%d:0%d \n", hour, minute, secondsnew);
        }
        else if (minute<10 && secondsnew>=10) {
            System.out.printf("The time is %d:0%d:%d \n", hour, minute, secondsnew);
        }
        else if (minute>=10 && secondsnew<10) {
            System.out.printf("The time is %d:%d:0%d \n", hour, minute, secondsnew);
        }
        else {
            System.out.printf("The time is %d:%d:%d \n", hour, minute, secondsnew);
        }
    } // end main method
} // end class    
    