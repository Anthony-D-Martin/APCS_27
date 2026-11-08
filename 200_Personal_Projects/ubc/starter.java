/*
 *	Author:  Anthony Martin
 *  Vegas Casino Simulator 
 * -Add more games
 *      -poker? (hard tho)
 *      -Slolitare? (Seems imposssible honestly)
 *      -Uno
 * -Make split in blackjack?
 * -Maybe secret cheat code for money or easier bj dealer/see rps comp outcome??
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		while(true){
            if(Gamble.getMoney()<=0){
                System.out.println("You have no more money. Goodbye");
                break;
            }
		System.out.println("Welcome to the Casino. Currently, we have Rock Paper Scissors, Roulette, Slots and Blackjack open.");
        System.out.println("Which game would you like to play? Or, stop playing.");
		System.out.println("You have $"+Gamble.getMoney()+" to gamble with.");
		String gameChoice=sc.nextLine();
		if(gameChoice.equalsIgnoreCase("blackjack")||gameChoice.equalsIgnoreCase("b")){
			Gamble.blackjack();
		}
		else if(gameChoice.equalsIgnoreCase("Rock Paper Scissors")||gameChoice.equalsIgnoreCase("rps")||gameChoice.equalsIgnoreCase("r p s")){
			Gamble.RockPaperScissors();
		}
        else if(gameChoice.equalsIgnoreCase("roulette")||gameChoice.equalsIgnoreCase("r")||gameChoice.equalsIgnoreCase("roulette wheel")){
            Gamble.rouletteWheel();
        }
		else if(gameChoice.equalsIgnoreCase("slots")||gameChoice.equalsIgnoreCase("sl")){
			Gamble.slots();
		}
		else if(gameChoice.equalsIgnoreCase("end")||gameChoice.equalsIgnoreCase("e")||gameChoice.equalsIgnoreCase("stop")||gameChoice.equalsIgnoreCase("s")){
			System.out.println("Thanks for playing!");
			break;
		}
		else{
			System.out.println("That game doesn't exist here. Try again next time");
		}
		}
	}	
	}
	

