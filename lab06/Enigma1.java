// Jennie-rose Barrella
// Ocotber 1, 2014
// CSE2
// lab06

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    System.out.println("You entered "+x+"%");
    
    double proportion1 = (x/100);
    double proportion2 = 1 - proportion1;
    int proportion3 = (int) (proportion2*100);
    
   //print out the proportion remaining for select percentages
   
   if( proportion3== 93) //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    else if( proportion3== 59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    else if( proportion3== 86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    else if( proportion3 == 67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    else if(proportion3 == 40)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
      
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *
 *    1. opposed to having work in the if statements i changed it to a variable
 *    2. the problem most likely arose because the number coming out wasn't exactly equal to the decimal, any amount
 *       of numbers after it would cause the if statement to not work
 *       ex. 93.00000001 is not the same as 93
 *    3. i changed the number to a decimal by dividing by 100
 *    4. i then found what the remaining decimal would be by subtracting from 1
 *    5. then i multiplied that by 100 and changed it to an int to get the number to be exact
 */
