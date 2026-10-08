/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess a random number from 1 to 1000");
		int number=(int)((Math.random())*1000)+1;
		int guess=1;
		int guessamt=1;
		while(number!=guess){
		System.out.println("Guess a number:");
		guess=sc.nextInt();
		guessamt=guessamt+1;
		if(number>guess){
			System.out.println("That wasn't it.");
			System.out.println("The number is higher than your previous guess. Try again");
		}
		else if(number<guess){
			System.out.println("That wasn't it.");
			System.out.println("The number is lower than your previous guess. Try again");
		}
		}
		System.out.println("You guessed the number in "+guessamt+" tries!");
	}
}
