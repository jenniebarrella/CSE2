// Jennie-rose Barrella
// September 10, 2014
// CSE02
// Lab03
// how many Big Macs, Cost per Big Mac, and percentage tax
import java.util.Scanner;
public class BigMac {
    // main method required for every java program
    public static void main(String[ ] args) {
        // declare instanse of Scanner 
        Scanner myScanner;
        // construct and instance of the scanner 
        // you are creating an instance that will take input from STDIN
        myScanner = new Scanner ( System.in );
        // accept input
        System.out.print("Enter the number of Big Macs (an integer > 0): ");
        // since no ln, will go to next line
        //
        // accept user input
        int nBigMacs = myScanner.nextInt();
        //
        // prompt user for cost of Big Mac and the percent sales tax and then accept input
        System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; // user enters percent, but i want proportion
        //
        // print the output
        double cost$;
        int dollars,        // whole dollar amount of cost
            dimes, pennies; // for storing digits
                            // to the right of the decimal point
                            // for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //  get the whole amount, dropping decimal fraction
        dollars = (int) cost$;
        // get dimes amount e.g.,
        //  (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        // where the % (mod) operator returns the remainder
        // after the division:  583%100 -> 83, 27%5-> 2
        dimes = (int) (cost$*10)%10;
        pennies = (int) (cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs+ " BigMacs, at $"+bigMac$+" per bigMac, with a" +
        " sales tax of "+ (int)(taxRate*100) +"%, is $"+dollars+'.'+dimes+pennies);
        
    } // end of main method
} // end of class
