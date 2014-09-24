// Jennie-rose Barrella
// September, 19,2014
// CSE2
// hw04
// enter int for thousands of income
// print income, tax percentage and tax on income

import java.util.Scanner;
public class IncomeTax {
    public static void main(String[] args) {
        // declare scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        // declare variables
        int incomeThousands=0;
        double incomeTax=0;
        double incomeTaxPercent=0;
        double tax=0;
        int income=0; 
        int taxint=0;
        
        // if statements
        System.out.print("Enter an int giving the number of thousands of income: ");
        if (myScanner.hasNextInt()) {
            income = myScanner.nextInt();
            
            if (income<0) {
                System.out.println("You did not enter a postive int");
                return; // ends program
            }
            
            else if (income<20) {
                incomeTaxPercent = 5.0;
                incomeThousands = income*1000;
                incomeTax = incomeTaxPercent/100;
                tax = incomeThousands*incomeTax;
                taxint = (int)tax;
                System.out.println("The tax rate on $"+incomeThousands+" is "+incomeTaxPercent+"%, and the tax is $"+taxint);
            }
                
            else if (income<40 & income>=20) {
                incomeTaxPercent = 7.0;
                incomeThousands = income*1000;
                incomeTax = incomeTaxPercent/100;
                tax = incomeThousands*incomeTax;
                taxint = (int)tax;
                System.out.println("The tax rate on $"+incomeThousands+" is "+incomeTaxPercent+"%, and the tax is $"+taxint);
            }
                
            else if (income<78 & income>=40) {
                incomeTaxPercent = 12.0;
                incomeThousands = income*1000;
                incomeTax = incomeTaxPercent/100;
                tax = incomeThousands*incomeTax;
                taxint = (int)tax;
                System.out.println("The tax rate on $"+incomeThousands+" is "+incomeTaxPercent+"%, and the tax is $"+taxint);
            }
                
            else if (income>=78) {
                incomeTaxPercent = 14.0;
                incomeThousands = income*1000;
                incomeTax = incomeTaxPercent/100;
                tax = incomeThousands*incomeTax;
                taxint = (int)tax;
                System.out.println("The tax rate on $"+incomeThousands+" is "+incomeTaxPercent+"%, and the tax is $"+taxint);
            }
        
        } // end Int if statement
        
        else {
           System.out.println("You did not enter an int"); 
           return; // ends program
        }
        
    } // end main method
} // end class