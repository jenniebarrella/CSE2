// Jennie-rose Barrella
// September 24,2014
// CSE2
// lab05
// 3 different type games Roulette, Craps (dice role) or Picking a card from the deck
// ask user to choose game
// play game



import java.util.Scanner;
public class RandomGames {
    public static void main(String [ ] args) {
        
        // declare scnaner
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        // user input
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick up card : ");
        myScanner.hasNext();
        String choice = myScanner.next();
        
        
        switch (choice) {
            // roulette
            case ("R"): case ("r"):
                int randomNumber = (int) (Math.random() * 37); // 37 options for ball
                if (randomNumber == 37) {
                    int doublezero = randomNumber;
                    doublezero = 00; // no number 37, instead 00
                    System.out.println("Roulette: "+randomNumber);
                }
                else {
                System.out.println("Roulette: "+randomNumber);
                }
                break;
            
            // Craps
            case ("C"): case ("c"):
                int dice1 = (int) (Math.random() *5 + 1);  // dice 1
                int dice2 = (int) (Math.random() *5 + 1);  // dice 2
                int diceTotal = dice1 + dice2;  // dice total
                System.out.println("Craps: "+dice1+" + "+dice2+" = "+diceTotal);
                break;
            
            // Pick a Card 
            case ("P"): case ("p"):
                int cardSuit = (int) (Math.random() *3);
                String cardSuitName = ""; // empty string value for card suit names
                switch (cardSuit) { // card suits
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
                switch (cardNumber) { // card number, picture cards
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
                        System.out.println(cardNumber+" of "+cardSuitName); // regular number
                        return;
                }
            default:
                System.out.println(choice+" is not one of 'R' 'r' 'C' 'c' 'P' 'p'");
                break;
            
        } // end switch  
    } // end main method
} // end class