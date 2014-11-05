// Jennie-rose Barrella
// November 5th, 2014
// lab11
// Arrays

import java.util.Scanner;
public class Arrays {
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        int [ ] hold; // declaration
        final int arraySize = 10; // size of array
        hold = new int [arraySize]; // allocate the space for the array
        
        int min = hold[0];
        int max = hold[0];
        int sum = 0;
        
        System.out.println("Please enter 10 ints: ");
        for (int input = 0; input<arraySize; input++) {
            
            hold[input] = myScanner.nextInt();
            
            if (input==0){
                min = hold[input];
                max = hold[input];
            }
            
            if (input>0){
                if ( hold[input] < min ) {
                    min = hold[input];
                }
                if ( hold[input] > max ) {
                    max = hold[input];
                }
            }
            
            sum = hold[input]+sum;
            
        }
        
        int [ ] hold2 = hold;
        
        System.out.println("The min is: "+min); 
        System.out.println("The max is: "+max); 
        System.out.println("The sum is: "+sum); 
        
        for (int input = 0; input<arraySize; input++) { 
            System.out.println(hold[input]+"   "+hold2[9-input]);
        }  
        
    }
}