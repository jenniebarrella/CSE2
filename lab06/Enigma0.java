// Jennie-rose Barrella
// Ocotber 1, 2014
// CSE2
// lab06

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0 {
  public static void main(String [] args){
    
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int k=4,p=6,q=7,r=8,n;
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    
    else{
      n=4;
      System.out.println("You entered "+n);
    }
    
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *   Errors:
 *   1. the main method was not decalred properly, switched it to main(String [] args)
 *   2. the varible n was used in the if statements but not declared first
 *      i moved the statement that declared all the variables to before the if statement
 *      i then had to remove the "int" before the n varibales in the if and else statement so as not to decalre it as an int twice 
 */
