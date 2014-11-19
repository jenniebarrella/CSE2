// Jennie-rose Barrella
// CSE2
// November 13, 2014
// Poker odds

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }

    public static void showHands(){
        
        Scanner myScanner = new Scanner (System.in);
        String answer=""; // set string for eventual repeat question
        
        do {
        String [ ] labels = {"Clubs: ","Diamonds: ", "Hearts: ","Spades: "}; // string for suit catagories
        
        int [ ] deck = new int [52]; // deck array
        int [ ] hand = new int [5]; // hand array as integers
        int [ ] cardSuit = new int [5]; // card suits as integers
        String [ ] cardRank = new String [5]; // string array for hand of cards
        
        for (int n = 0; n<52; n++) { // set array 0-51 for cards in deck
            deck [n] = n;
        }
        
        for (int n = 0; n<5; n++) { // array for hand start all as -1
            hand [n] = -1;
        }
        
        int deckLength = 52; // length of deck of cards
        
        for (int repeat = 0; repeat<5; repeat++) { // switch cards
            int x = (int)(Math.random()*deckLength); // get random number for card number
            hand[repeat] = deck[x]; // set card in hand equal to the random number card in deck
            deck[x] = deck[deckLength-1]; // set place where that card was to last card in deck
            deck[deckLength-1] = -1; //  set last card to -1
            deckLength--; // decrease the deck length
        }
        
        for (int repeat = 0; repeat<5; repeat++) { // find card rankings
            int goToMethod = hand[repeat]%13; // integer for remainder which gives suit
            cardRank[ repeat ] = card(goToMethod); // find the string name of card- method
            if (hand[repeat] <13 && hand[repeat] >=0){ // different values for each suit
                cardSuit[repeat] = 0;}
            if (hand[repeat] <26 && hand[repeat] >12){
                cardSuit[repeat] = 1;}
            if (hand[repeat] <39 && hand[repeat] >25){
                cardSuit[repeat] = 2;}
            if (hand[repeat] <52 && hand[repeat] >38){
                cardSuit[repeat] = 3;}
        }
        
        for (int print = 0; print<4; print++) { // for loop 1-4 b/c 4 suits
            System.out.print(labels[print]); // print string of labels
            for (int n = 0; n<5; n++) { // 5 times b/c 5 cards
                if (cardSuit[n] == print) { // if the card suit is the same as the print int then print card number here
                    System.out.print(cardRank[n]);
                    System.out.print(" ");
                }
            }
            System.out.println(); // next line for next suit
        }
        
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); // go again?
        answer=myScanner.next(); // check input
        System.out.println(); 
        } while (answer.equals("Y") || answer.equals("y")); // do this whole thing when y entered
        return; // back to main method
    }
    
    public static String card(int i){ // assign string values to each int of the deck (avoid suits so only 0-12)
        switch (i) {
            case(0) :
                return "A";
            case(1) :
                return "K";
            case(2) :
                return "Q";
            case(3) :
                return "J";
            case(4) :
                return "10";
            case(5) :
                return "9";
            case(6) :
                return "8";
            case(7) :
                return "7";
            case(8) :
                return "6";
            case(9) :
                return "5";
            case(10) :
                return "4";
            case(11) :
                return "3";
            case(12) :
                return "2";
        }
        return "0";
    }
    
    public static void simulateOdds(){
        
        Scanner myScanner = new Scanner (System.in);
        
        int nodups = 0; // int value for when no duplicates
        
        int A = 0, K = 0, Q = 0, J = 0, one = 0, two = 0, three = 0, four = 0; // int values for every card type
        int five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0;

        int counthands = 0; // counter for while loop
        
        while (counthands<10000){ // simulate 10,000 hands
            
            int [ ] deck = new int [52];  // deck array
            int [ ] hand = new int [5]; // hand array as integers
            String [ ] cardRank = new String [5];  // string array for hand of cards
            
            for (int n = 0; n<52; n++) {  // set array 0-51 for cards in deck
                deck [n] = n;
            }
            
            for (int n = 0; n<5; n++) {  // array for hand start all as -1
                hand [n] = -1;
            }
            
            int deckLength = 52; // length of deck of cards
            
            for (int repeat = 0; repeat<5; repeat++) { // switch cards
                int x = (int)(Math.random()*deckLength); // get random number for card number
                hand[repeat] = deck[x];  // set card in hand equal to the random number card in deck
                deck[x] = deck[deckLength-1];  // set place where that card was to last card in deck
                deck[deckLength-1] = -1;  //  set last card to -1
                deckLength--; // decrease the deck length
            }
            
            for (int repeat = 0; repeat<5; repeat++) { // find card rankings
                hand[repeat] = hand[repeat]%13; // integer for remainder which gives suit
            }
            
            //-----------------------------------------------------------------------//
            int count = 0; // count value to see how many times each card comes up
            boolean dups = exactlyOneDup(hand); // check how many times 1 duplicate
                if (dups == true) { // if one duplicate
                    for (int n = 0; n<5; n++) {  // for loop to check each card
                        if (hand[n] == 0) { // if value n in hand is ace(0)
                            count++; // increase count
                        } 
                        if (count>1) { // if it appears more than once
                            A++; // increase amount of times there is duplicate of this
                            count=0; // set count back to zero so can make it through for loop without A++
                        }
                    } // -same for each of the following for loops- diff card values
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 1) {
                            count++;
                        }
                        if (count>1) {
                            K++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 2) {
                            count++;
                        }
                        if (count>1) {
                            Q++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 3) {
                            count++;
                        }
                        if (count>1) {
                            J++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 10) {
                            count++;
                        }
                        if (count>1) {
                            ten++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 9) {
                            count++;
                        }
                        if (count>1) {
                            nine++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 8) {
                            count++;
                        }
                        if (count>1) {
                            eight++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 7) {
                            count++;
                        }
                        if (count>1) {
                            seven++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 6) {
                            count++;
                        }
                        if (count>1) {
                            six++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 5) {
                            count++;
                        }
                        if (count>1) {
                            five++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 4) {
                            count++;
                        }
                        if (count>1) {
                            four++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 3) {
                            count++;
                        }
                        if (count>1) {
                            three++;
                            count=0;
                        }
                    }
                    count = 0;
                    for (int n = 0; n<5; n++) {
                        if (hand[n] == 2) {
                            count++;
                        }
                        if (count>1) {
                            two++;
                            count=0;
                        }
                    }
                    count = 0;
                }
                
                else { // if no duplicates than increase amount of times none
                    nodups++;    
                }
            counthands++; // increase counthands for while loop
            
        }
        System.out.println("A   "+A); // print how many times each card comes up in 10,000
        System.out.println("K   "+K);
        System.out.println("Q   "+Q);
        System.out.println("J   "+J);
        System.out.println("10  "+ten);
        System.out.println("9   "+nine);
        System.out.println("8   "+eight);
        System.out.println("7   "+seven);
        System.out.println("6   "+six);
        System.out.println("5   "+five);
        System.out.println("4   "+four);
        System.out.println("3   "+three);
        System.out.println("2   "+two);
        
        System.out.println("total not exactly one pair: "+nodups); // how many times no duplicates
        
    
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
        


