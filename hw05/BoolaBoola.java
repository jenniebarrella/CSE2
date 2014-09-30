// Jennie-rose Barrella
// September 24,2014
// CSE 2
// hw05 Boola Boola

// generate three random true/false values
// ask user if the 3 values combined with either "and" or "or" is true or false


import java.util.Scanner;
public class BoolaBoola {
    public static void main(String [] args) {
      
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
    
        // variables
        // Math.random can return 0 or 1
        // half the time is 0
        // == 0 is if it is 0 it is true
        // == 1 is if it is 1 it is false
        boolean variable1 = (int) (Math.random() *2) == 0;
        boolean variable2 = (int) (Math.random() *2) == 0;
        boolean variable3 = (int) (Math.random() *2) == 0;
        
        int Random = (int) (Math.random() *3); // for the 4 different ways the && and || statements can be arranged
        switch (Random) {
        
            case 0: // 2 &&
                System.out.printf("%b && %b && %b: ", variable1, variable2, variable3);
                System.out.print("is this true or false? ");
                if (myScanner.hasNextBoolean()) {
                    boolean answer = myScanner.nextBoolean(); // user guess (true or false)
                    if (variable1 && variable2 && variable3 == answer) {
                        System.out.println("correct");
                    }
                    else {
                        System.out.println("wrong try again");
                    }
                }
                else {
                   System.out.println("incorrect input"); 
                }    
                break;
        
            case 1: // && and ||
                System.out.printf("%b && %b || %b: ", variable1, variable2, variable3);
                System.out.print("is this true or false? ");
                if (myScanner.hasNextBoolean()) {
                    boolean answer1 = myScanner.nextBoolean();  // user guess
                    if (variable1 && variable2 || variable3 == answer1) {
                        System.out.println("correct");
                    }
                    else { 
                        System.out.println("wrong try again");
                    }
                }
                else {
                   System.out.println("incorrect input"); 
                }    
                break;
        
            case 2: // || and &&
                System.out.printf("%b || %b && %b: ", variable1, variable2, variable3);
                System.out.print("is this true or false? ");
                if (myScanner.hasNextBoolean()) {
                    boolean answer2 = myScanner.nextBoolean(); // user guess
                    if (variable1 || variable2 && variable3 == answer2) {
                      System.out.println("correct");
                    }
                    else {
                        System.out.println("wrong try again");                 
                    }
                }
                else {
                   System.out.println("incorrect input"); 
                }    
                break;
        
            case 3: // || and ||
                System.out.printf("%b || %b || %b: ", variable1, variable2, variable3);
                System.out.print("is this true or false? ");
                if (myScanner.hasNextBoolean()) {
                    boolean answer3 = myScanner.nextBoolean(); // user guess
                    if (variable1 || variable2 || variable3 == answer3) {
                        System.out.println("correct");
                    }
                    else {
                        System.out.println("wrong try again");
                    }
                }
                else {
                   System.out.println("incorrect input"); 
                }    
                break;    
        
        } // end switch
    } // end main method
} // end class