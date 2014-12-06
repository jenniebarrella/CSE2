// Jennie-rose Barrella
// Final Homework assignment

import java.util.Scanner;
public class PokerHands {
    public static void main (String [ ] args) {
        
        Scanner myScanner = new Scanner (System.in);
        String answer=""; // set space for answer
        
        do{
            int [] hand = new int [5]; // array for poker hand
            int i=0; // start for while loop
            while (i<5){ // keep trying till they get it right
                int card = 0; // start card number
                System.out.print("Enter a suit- ");
                if (myScanner.hasNext()){
                    String suit = myScanner.next();
                    switch (suit) { // add numbers to change to out of 52 depending on suit
                        case("c") :
                            card = 0;
                            break;
                        case("d") :
                            card = 13;
                            break;
                        case("h") :
                            card = 26;
                            break;
                        case("s") :
                            card = 39;
                            break;
                        default : // random default to prompt quit if dont enter correct 
                            card = 2000;
                            break;
                    }
                }
                
                if (card == 2000) { // make them try again
                    System.out.println("You did not enter an appropriate value - try again");
                    continue; // skip all and go back to top of while
                }
                
                System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                if (myScanner.hasNextInt()) { // if enter integer
                    int newCard = myScanner.nextInt();
                    if (newCard <= 1 || newCard > 10) { // must enter between 1 and 10
                        System.out.println("You did not enter an appropriate value - try again");
                        continue; // back to top
                    }
                    card += newCard-1; // suit value plus what they enter
                    int wrong = 0;
                    for (int p=0; p<i; p++){ // check through every card already chosen
                        if (hand[p] == card) {
                            System.out.println("You already picked this card try again");
                            wrong++;
                        } 
                    }
                    
                    if (wrong==1){
                        continue; // quit out if picked
                    }
                    hand[i] = card; // otherwise this is your card!
                    i++;
                    continue;
                }
                if (myScanner.hasNext()) { // if enter a string for letter cards
                    String cardString = myScanner.next();
                    switch (cardString) {
                        case("a") : // add based on suit
                            card += 0;
                            break;
                        case("k") :
                            card += 12;
                            break;
                        case("q") :
                            card += 11;
                            break;
                        case("j") :
                            card += 10;
                            break;
                        default :
                            card = 2000;
                            break;
                    }
                }
                    
                if (card == 2000) { // quit if no good
                    System.out.println("You did not enter an appropriate value - try again");
                    continue;
                }
                
                int wrong = 0;
                for (int p=0; p<i; p++){ // check through each
                    if (hand[p] == card) {
                        System.out.println("You already picked this card try again");
                        wrong++;
                    } 
                }
                if (wrong==1){
                    continue; // quit if picked
                }    
                hand[i] = card; // this is card
                i++;
                
            }
            
            System.out.println();
            showOneHand(hand); // go to his method
            
            int [] checkRanks = {0,0,0,0,0,0,0,0,0,0,0,0,0}; // allot space for this, all zeros in case dont fill
            for (int n=0; n<5; n++) { // for each card
                int k = hand[n]%13; // get back number by %13 - checl to see how many of each
                checkRanks[k] +=1;
            }
            //declare variables
            int pair = 0;
            int three = 0;
            int four = 0;
            int [] straight = {0,0,0,0,0};
            int count = 0;
            for (int n=0; n<13; n++) { // to see 2 kind 3 kind 4 kind
                if (checkRanks[n] == 2){
                    pair++;
                }
                if (checkRanks[n] == 3){
                    three++;
                }
                if (checkRanks[n] == 4){
                    four++;
                }
            }
            
            //declare variables
            int clubs = 0;
            int diamonds = 0;
            int hearts = 0;
            int spades = 0;
            for (int n=0; n<5; n++) { // each card check for suit
                if (hand[n] < 13) {
                    clubs++;
                    continue;
                }
                if (hand[n] < 26) {
                    diamonds++;
                    continue;
                }
                if (hand[n] < 39) {
                    hearts++;
                    continue;
                }
                else{
                    spades++;
                }
            }
            int flush = 0; // if all the same
            if (clubs == 5 || diamonds == 5 || hearts == 5 || spades == 5) {
                flush++; // increase flush count- all five means flush
            }
            
            for (int n=0; n<5; n++) { // sort the cards - check againstt card n
                for (int t=0; t<5; t++) { // each card
                    int k = hand[t]; // temp for this card
                    int one = k%13; // card number
                    int two = hand[n]%13; // card number
                    if (one==0){ // if ace must be 13 so sorting works
                        one=13;
                    }
                    if (two==0){
                        two=13;
                    }
                    if (one < two) { // if first less than one checking against
                        hand[t] = hand [n]; // switch them
                        hand[n] = k;
                    }
                }
            }
            //for (int n=0; n<5; n++){
            //System.out.println(hand[n]%13);}
            
            int straightCheck = 0;
            int royalCheck = 0;
            for (int n=1; n<5; n++) {
                int one = hand[n]%13; // card number
                int two = hand[n-1]%13; // card before number
                if (two==0){
                    two=13;
                }
                if (one+1 == two) { // if this one is one more than the card before
                    straightCheck++;
                }
                if (two==13) { 
                    royalCheck++;
                }
            }
            
            //for (int n=0; n<5; n++){
            //System.out.println(hand[n]%13);}
            
            //print
            if (pair==2) {
                System.out.println("This hand has Two Pairs");
                //return;
            }
            else if (pair==1) {
                if (three == 1) {
                    System.out.println("This is a Full House");
                    //return;
                }
                else {
                    System.out.println("This hand has One Pair");
                    //return;
                }
            }
            else if (three==1) {
                System.out.println("This is Three of a Kind");
                //return;
            }
            else if (four==1) {
                System.out.println("This is Four of a Kind");
                //return;
            }
            else if (flush==1) {
                if (straightCheck==4){
                    if (royalCheck>0){
                        System.out.println("This is a Royal Flush"); // if all of them
                        //return;
                    }
                    else {
                    System.out.println("This is a Straight Flush"); // if straight and flush
                    //return; 
                    }
                }
                else {
                System.out.println("This is a Flush");
                //return;
                }
            }
            else if (straightCheck==4){
                System.out.println("This is a Straight");
                //return;
            }
            else {
                System.out.println("This is a High Card");
            }
            
            System.out.println();
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=myScanner.next(); //  answer to continue
        }while(answer.equals("Y") || answer.equals("y"));
        
    } // end main method
    
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    	String face[]={"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","J ","Q ","K "};
    	String out="";
    	for(int s=0;s<4;s++){
      	    out+=suit[s];
          	for(int rank=0;rank<13;rank++)
            	for(int card=0;card<5;card++)
             	if(hand[card]/13==s && hand[card]%13==rank)
              	out+=face[rank];
          	out+='\n';
    	}
    	System.out.println(out);
    }
  
} // end class