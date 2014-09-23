// Jennie-rose Barrella
// September, 19,2014
// CSE2

import java.util.Scanner;
public class month {
    public static void main(String[ ] args) {
    
    // declare scanner
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    // decalre variables 
    int month = 0;
    int year = 0;
    int yearDividedByFour = 0;
    
    System.out.print("Enter an int giving the number of the month (1-12): ");
    if (myScanner.hasNextInt()) {
        month = myScanner.nextInt();
        if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            System.out.println("The month has 31 days");
        } // end of if
        
        else if (month==4|| month==6 || month==9 || month==11) {
            System.out.println("The month has 30 days");
        } // end of else if
       
        else if (month==2) {
            System.out.print("Enter an int giving the year: ");
            
            if (myScanner.hasNextInt()) {
                year = myScanner.nextInt();
               
                if (year % 4 == 0) { // if divisible by 4
                    if (year % 100 == 0) { // if divisible by 100
                        if (year % 400 == 0) // if divisible by 400
                            System.out.println("The month has 29 days");
                        else {
                            System.out.println("The month has 28 days");
                        } // end else
                    } // end if  
                    else {
                        System.out.println("The month has 29 days");
                    } // end else
                } // end of if
               
                else {
                    System.out.println("The month has 28 days");
                } // end of else
            } // end of if 
        } // end of else if
        else {
            System.out.println("You did not enter an int between 1 and 12");
            return;
        } // end else
    } // end of int if
    else {
        System.out.println("You did not enter an int");
        return;
    } // end of else
   
   
    } // end main method
} // end class