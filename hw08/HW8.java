// Jennie-rose Barrella
// CSE2
// October 24, 2014
// hw08

import java.util.Scanner;
public class HW8{

    //  "Cc" method
    public static char getInput(Scanner myScanner ,String match) { // return char value, scanner input and string to check
        
        while (true) { // true loop so keeps going till reaches return (enters C or c)
            int n = 0; // initialize value to check each seperate letter in string "Cc"
            String trial = myScanner.next(); // variable = to string entered
            if (trial.length() > 1) { // if don't enter one variable
               System.out.print("You should enter exactly one character- ");
               continue; // restart while loop
           }
            while ( n < match.length() ) { // while n is less than the length of "Cc"
                if ( match.charAt(n) == trial.charAt(0) ) { // take the n letter of string match, if the same as input
                    return trial.charAt(0); // return to main method and set input to the letter entered
                }
            n++; // increment n to check "C" and "c"
            }
            System.out.print("You did not enter a character from the list 'Cc'; try again- ");
        }
    }
    
    
    // "yYnN" method
    public static char getInput(Scanner myScanner ,String match, int repeat) { // return char value, scanner input and string to check then int for number of tries(5)
        
        for (int tries = 0; tries < repeat; tries++) { // when the tries is less than repeat(5) do loop, increment tries
            int n = 0;  // initialize value to check each seperate letter in string "yYnN"
            String trial = myScanner.next(); // variable = to string entered
            if (trial.length() > 1) { // if don't enter one variable
               System.out.print("You should enter exactly one character- ");
               continue; // restart for loop
           }
            while ( n < match.length() ) { // while n is less than the length of "yYnN"
                if ( match.charAt(n) == trial.charAt(0) ) {  // take the n letter of string match, if the same as input
                    return trial.charAt(0); // return to main method and set input to the letter entered
                }
            n++; // increment n to check "y", "Y", "N" and "n"
            }
            System.out.print("You did not enter a character from the list 'yYnN'; try again- ");
        }
        System.out.println(" \nYou failed after 5 tries"); // after for loop, after 5 tries
        return ' '; // return this statement because in main method it moves on if this is entered
    }
    
    // numbers method
    public static char getInput(Scanner myScanner, String choose, String match) { // return char value, scanner input, string for choose statement and string to check
        
        while (true) { // true loop so keeps going till reaches return- enters appropriate digit
            System.out.println("Choose a digit"); // print statements because not in main method
            System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' - ");
            int n = 0; // initialize value to check each seperate letter in string of digits
            String trial = myScanner.next(); // variable = to string entered
            if (trial.length() > 1) { // if don't enter one variable
               System.out.println("You should enter exactly one character");
               continue; // restart while loop
           }
            while ( n < match.length() ) { // while n is less than the length of of the digits string
                if ( match.charAt(n) == trial.charAt(0) ) { // take the n letter of string match, if the same as input
                    return trial.charAt(0); // return to main method and set input to the letter entered
                }
            n++; // increment n to for each of the digits 0-9
            }
            System.out.println("You did not enter an acceptable character");
        }
    }
    
    
    public static void main(String []arg){
        
        char input; // declare varibale for input- what setting the result of methods to
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); // prompt user to enter "c" or "C"
        input=getInput(scan,"Cc"); // set input to what returned when plug in scanner value and string "Cc"
        System.out.println("You entered '"+input+"'"); // print
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); // prompt
        
        input=getInput(scan,"yYnN",5); //give up after 5 attempts; set input to what returned when plug in scanner value, string "Cc", and 5 for number of tries
        if(input!=' '){ // if ' ' is not returned then print this, otherwise move on
            System.out.println("You entered '"+input+"'");
        }
        input=getInput(scan,"Choose a digit","0123456789"); // set input to what returned when plug in scanner value, string for choose variable and string of digits
        System.out.println("You entered '"+input+"'"); // print
    }  
}