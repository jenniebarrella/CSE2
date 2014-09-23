// Jennie-rose Barrella
// September, 19,2014
// CSE2

import java.util.Scanner;
public class courseNumber {
    public static void main(String[ ] args) {
    
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
    
        System.out.print("Enter a six digit number giving the course semester: ");
        int number = myScanner.nextInt();
    
        if (number >= 186510 && number <= 201440) {
            int year = number/100;
            int numberNoSemester = year*100;
            int semester = number-numberNoSemester;
            
            if (semester == 10)
                System.out.println("The course was offered in the Spring semester of "+year);
            else if (semester == 20)
                System.out.println("The course was offered in the Summer 1 semester of "+year);
            else if (semester == 30)
                System.out.println("The course was offered in the Summer 2 semester of "+year);
            else if (semester == 40)
                System.out.println("The course was offered in the Fall semester of "+year);
            else {
                System.out.println(semester+" is not a legitimate semester");
            } // end else
        } //  end if
        else {
            System.out.println("The number was outside the range [ 186510, 201440 ]");
            return;
        } // end else
    
    
    } // end main method
} // end class