// Jennie-rose Barrella
// Spetember 10, 2014
// CSE02
// hw03
import java.util.Scanner;
public class Root {
    // main method
    public static void main(String[] args) {
        
        // declare variables
        double guess=0;
        double guess2=0;
        double guess3=0;
        double guess4=0;
        double cube=0;
        
        // input data
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.println("enter a double and I print it's cube root");
        x = scan.nextInt();
        
        // calculations
        guess = x/3;
        guess2 = (guess*guess*guess+x)/(3*guess*guess);
        guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        cube = (guess4*guess4*guess4);
        
        // print results
        System.out.println("The cube root is"+guess4+":");
        System.out.println(guess4+"*"+guess4+"*"+guess4+"="+cube);
        
    }
}