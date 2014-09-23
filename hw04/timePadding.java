// Jennie-rose Barrella
// September, 19,2014
// CSE2

import java.util.Scanner;
public class timePadding {
    public static void main(String[ ] args) {
    
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter the time in seconds: ");
        int seconds = myScanner.nextInt();
    
        int secondsDivide60 = seconds/60;
        int secondsnew = seconds - (secondsDivide60*60);
    
        int hour = secondsDivide60/60;
    
        int minute = secondsDivide60 - (60*hour);
        
        if (minute<10 && secondsnew<10) {
            System.out.printf("The time is %d:0%d:0% \n", hour, minute, secondsnew);
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
    