// Jennie-rose Barrella
// CSE2
// November 11,2014
// Playing Poker
// find the amount of duplicates in the entered array

import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); 
      for(int j=0;j<10;j++){ // collect input for 10 ints
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){ // go to method
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num); // go to method
      if(exactlyOneDup(num)){ //  go to method
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next(); //  answer to continue
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", "; // print commas
      }
      out+=num[j];
    }
    out+="} "; // end statement
    return out;
  }

  public static boolean hasDups(int [ ] num) {
    for (int i =0; i<num.length; i++) { // big for loop to go through each number in array
      for (int n = i+1; n<num.length; n++) { // for loop to go through each number in array while i stays constant
        if (num[i] == num[n]) { // compare each number to the set number i
          return true; // if they are ever the same return true
        }
      }
    }
  return false; // if make it through then return false
  }
  
  public static boolean exactlyOneDup(int [ ] num) {
    int count = 0;
    for (int i =0; i<num.length; i++) { // big for loop to go through each number in array
      for (int n = i+1; n<num.length; n++) { // for loop to go through each number in array while i stays constant
        if (num[i] == num[n]) { // compare each number to the set number i
          count++; // if they are the same increase the count by one
        }
      }
    }
    if (count == 1) { // if were only the same one time return true
      return true;
    }
    return false; // otherwise return false
  }
}
  
