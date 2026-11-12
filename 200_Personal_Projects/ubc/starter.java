/*
 *	Author:  Anthony Martin
 *  Vegas Casino Simulator 
 * -Add more games
 *      -poker? (hard tho)
 *      -Slolitare? (Seems imposssible honestly)
 *      -Uno
 * -Make split in blackjack?
 * -Maybe secret cheat code for easier bj dealer/see rps comp outcome??
 * -Maybe pay $$$ to predict next deal/hand/spin using arrays to have preset values for the next few spins/hands/deals
 * BUG: cardtostring requires a return if nothing runs but shouldnt need it bc it has to run from one of those
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {	
	public static void main(String args[]) {
		// int tempCard=0;
		// int tempSuit=0;
		// int abc=100;
		// while(abc>0){
		// tempCard=Gamble.card();
		// tempSuit=Gamble.suit();
		// System.out.println(tempCard+", "+tempSuit);
		// System.out.println(Gamble.cardToString(tempCard)+" of "+Gamble.suitToString(tempSuit));	
		// tempCard=0;
		// tempSuit=0;	
		// abc--;
		// }
		Scanner sc=new Scanner(System.in);
		while(true){
            if(Gamble.getMoney()<=0){
                System.out.println("You have no more money. Goodbye");
                break;
            }
		System.out.println("Welcome to the Casino. Currently, we have Rock Paper Scissors, Roulette, Slots and Blackjack open.");
		System.out.println("Note: Games are crude replicas, never been to a real casino.");
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
		else if(gameChoice.equals("getmoney")){
			Gamble.moreCash(sc.nextInt());
			sc.nextLine();
		}
		else if(gameChoice.equalsIgnoreCase("slots")||gameChoice.equalsIgnoreCase("s")){
			Gamble.slots();
		}
		else if(gameChoice.equalsIgnoreCase("end")||gameChoice.equalsIgnoreCase("e")||gameChoice.equalsIgnoreCase("stop")||gameChoice.equalsIgnoreCase("st")){
			System.out.println("Thanks for playing!");
			break;
		}
		else{
			System.out.println("That game doesn't exist here. Try again next time");
		}
		}
	}	
	}
	

