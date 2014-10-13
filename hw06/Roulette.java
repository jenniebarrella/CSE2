// Jennie-rose Barrella
// October 10, 2014 
// CSE 2
// hw06
// roulette wheel 
// there are 38 places the roulette wheel could go
// you play 100 games with $1 each, each time you win you get $36
// simulate you play to 100 games 1000 times
// how many times do you walk away with nothing
// how many times do you make a profit
// what is the total you make in the 100,000 games

public class Roulette {
    public static void main(String [] args) {
        
        // decalre all variables outside while statement so scope good
        int counterSpin = 0;
        int counterSimulation = 0;
        int myNumber = 0;
        int winningNumber = 0;
        int loser = 0;
        int profit = 0;
        int winner = 0;
        int winnings = 0;
        
        // simulation
        while (counterSimulation<1000) {
            
            // each 100 games
            while (counterSpin < 100) {
                myNumber = (int) (Math.random()*38); // random number you choose
                winningNumber = (int) (Math.random()*38); // random number it lands on
                
                if (myNumber == winningNumber) { // if you win
                    winner++; // increase amount of times you won
                }
                
                else { // if you loose
                    loser++; // increase amount of times you lost
                }
                
                counterSpin++; // increase counter to repeat while statement
            }
            
            winnings+= winner; // add up amount of times won for each simulation of the 100 games
            if (winner>3) { // amount of times you made a profit on the 100 games
                profit++;
            }
            
            
            // reset variables
            
            counterSpin = 0; // reset counterSpin so can redo 100 games
            winner = 0; // reset winner so can get correect profit again
            counterSimulation++; // increase counter to repeat while statement
        }    
        
        int totalWinnings = winnings*36; // amount of times you won times the money you get each time
        
        // print statements
        System.out.println("You walked away with nothing "+loser+" times");
        System.out.println("You made a profit "+profit+" times");
        System.out.println("You made a total of $"+totalWinnings);
        
    } // end main method
} // end class