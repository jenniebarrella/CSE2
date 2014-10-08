// Jennie-rose Barrella
// Ocotber 1, 2014
// CSE2
// lab06

import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * 
 *  when you attempt to run the program the java.lanc exception divided by 0 comes 
 *  up and tells you that there is a divide by zero error you must change in line 14
 * 
 *  i removed the /0 so that the program could compile and run
 *
 */
