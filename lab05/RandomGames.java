// Jennie-rose Barrella
// September 24,2014
// CSE2
// lab05
import java.util.Scanner;
public class RandomGames {
    public static void main(String [ ] args) {
        
        // declare scnaner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick up card : ");
        myScanner.hasNext();
        String choice = myScanner.next();
        
        
        switch (choice) {
            case ("R"): case ("r"):
                int randomNumber = (int) (Math.random() * 37);
                if (randomNumber == 37) {
                    int doublezero = randomNumber;
                    doublezero = 00;
                    System.out.println("Roulette: "+randomNumber);
                }
                else {
                System.out.println("Roulette: "+randomNumber);
                }
                break;
            case ("C"): case ("c"):
                int dice1 = (int) (Math.random() *5 + 1); 
                int dice2 = (int) (Math.random() *5 + 1);
                int diceTotal = dice1 + dice2;
                System.out.println("Craps: "+dice1+" + "+dice2+" = "+diceTotal);
                break;
            case ("P"): case ("p"):
                int cardSuit = (int) (Math.random() *3);
                String cardSuitName = "";
                switch (cardSuit) {
                    case 0:
                        cardSuitName = "Hearts";
                        break;
                    case 1:
                        cardSuitName = "Diamonds";
                        break;
                    case 2:
                        cardSuitName = "Spades";
                        break;
                    case 3:
                        cardSuitName = "Clubs";
                        break;    
                }
                int cardNumber = (int) (Math.random() * 11);
                switch (cardNumber) {
                    case 0:
                        System.out.printf("Jack of %s \n", cardSuitName);
                        return;
                    case 10:
                        System.out.printf("Queen of %s \n", cardSuitName);
                        return;
                    case 11:
                        System.out.printf("King of %s \n", cardSuitName);
                        return;
                    case 1:
                        System.out.printf("Ace of %s \n", cardSuitName);
                        return;
                    default:
                        System.out.println(cardNumber+" of "+cardSuitName);
                        return;
                }
            default:
                System.out.println(choice+" is not one of 'R' 'r' 'C' 'c' 'P' 'p'");
                break;
            
        } // end switch  
    } // end main method
} // end class