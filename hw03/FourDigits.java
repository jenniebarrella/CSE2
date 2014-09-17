// Jennie-rose Barrella
// Spetember 10, 2014
// CSE02
// hw03
// print out the four digits afer the decimal place
import java.util.Scanner;
public class FourDigits {
    // main method
    public static void main(String[ ] args) {
        
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        // input data
        System.out.println("enter a double and i display the four digits to the right of the decimal point");
        double x = myScanner.nextDouble();
        
        // calculations
        int y = (int)x; // change to int
        double newx = x-y; // get rid of numbers before decimal
        double x10000 = (newx*10000); // change to non decimal
        double brandnewx = x10000 + .3;
        int betterx = (int)brandnewx; // change to int
        
        // individual values
        // need to do individually to get 0's to appear
        // %10 takes last number before the decimal
        // divide to get number you want there
        int value1 = (int)(betterx/1000)%10;
        int value2 = (int)(betterx/100)%10;
        int value3= (int)(betterx/10)%10;
        int value4 = (int)betterx%10;
        
        // print results
        System.out.println("the four digits are "+value1+value2+value3+value4);
    }
}