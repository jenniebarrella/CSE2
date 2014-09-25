// Jennie-rose Barrella
// September 24,2014
// CSE2
// hw05 Burger King

import java.util.Scanner;
public class BurgerKing {
    public static void main(String [] args) {
        
        // declare Scanner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        // user input
        System.out.println("Enter a letter to indicate a choice of: ");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        myScanner.hasNext();
        String food = myScanner.next();
        
        if (food.length()>1) {
            System.out.println("a single character expected");
            return;
        }
        
        switch (food) {
           
            // burger
            case("B"): case("b"):
                System.out.println("Enter a letter to indicate a choice of: ");
                System.out.println("All the fixins (A or a)");
                System.out.println("Cheese (C or c)");
                System.out.println("Nothing (N or n)");
                myScanner.hasNext();
                String toppings = myScanner.next();
                String toppingsName = "";
                
                if (toppings.length()>1) {
                    System.out.println("a single character expected");
                    return;
                }
                
                switch (toppings) {
                    case("C"): case("c"):
                        toppingsName = "with cheese";
                        break;
                    case("N"): case("n"):
                        toppingsName = "";
                        break;
                    case("A"): case("a"):
                        toppingsName = "with all the fixins'";
                        break;
                    default:
                        System.out.println("You did not enter an appropriate letter");
                        return;
                }
                System.out.println("You ordered a burger "+toppingsName);
                return;
                
            // soda
            case("S"): case("s"):
                System.out.println("Enter a letter to indicate a choice of: ");
                System.out.println("Pepsi (P or p)");
                System.out.println("Coke (C or c)");
                System.out.println("Sprite (S or s)");
                System.out.println("Mountain Dew (M or m)");
                myScanner.hasNext();
                String soda = myScanner.next();
                String sodaName = "";
                
                if (soda.length()>1) {
                    System.out.println("a single character expected");
                    return;
                }
                
                switch (soda) {
                    case("P"): case("p"):
                        sodaName = "Pepsi";
                        break;
                    case("C"): case("c"):
                        sodaName = "Coke";
                        break;
                    case("S"): case("s"):
                        sodaName = "Sprite";
                        break;
                    case("M"): case("m"):
                        sodaName = "Mountain Dew";    
                        break;
                    default:
                        System.out.println("You did not enter an appropriate letter");
                        return;
                }
                System.out.println("You ordered a "+sodaName);
                return;
            
            //  Fries
            case("F"): case("f"):  
                System.out.println("Do you want a small (S or s) or large (L or l) order of fries?");
                myScanner.hasNext();
                String fries = myScanner.next();
                String frySize = "";
                
                if (fries.length()>1) {
                    System.out.println("a single character expected");
                    return;
                }
        
                switch (fries) {
                    case("S"): case("s"):
                        frySize = "small";
                        break;
                    case("L"): case("l"):
                        frySize = "large";
                        break;
                    default:
                        System.out.println("You did not enter an appropriate letter");
                        return;
                }
                System.out.println("You ordered a "+frySize+" fries");
                return;
                
            // no good input 
            default:
                System.out.println("You did not enter an appropriate letter");
                return;
                    
        } // end switch
    } // end main method
} // end class