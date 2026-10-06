/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		int money=100;
		System.out.println("2. Input a wager less than your total amount of money.");
		Scanner sc=new Scanner(System.in);
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10");
		while(money>0){
		System.out.println("Would you like to play slots? (Yes/yes/Y/y)");
		String play=sc.nxtLine();
		if(play.equalsIgnoreCase("yes")||play.equalsIgnoreCase("y")){
			System.out.println("You have $"+money+". How much would you like to wager?");
			int wager=sc.nextInt();
			while(wager>money){
				System.out.println("You only have $"+88+"! Please enter a smaller number:");
				int wager=sc.nextInt();
			}
			System.out.println("Great! Lets play!!!");
			int roll1=(int)((Math.random()*10)+1)
			int roll2=(int)((Math.random()*10)+1)
			int roll3=(int)((Math.random()*10)+1)
			System.out.println("Your rolls are:");
			System.out.println("_______________________");
			System.out.println(" |"+roll1+"|"+roll2+"|"+roll3+"|");
			System.out.println("_______________________");
			if(roll1==roll2||roll2==roll3||roll1==roll3){
				System.out.println("You won! You're wager has now been doubled!");
				money=money+(wager*2);
				System.out.println("You now have $"+money+".");
			}
			if(roll1==roll2&&roll2==roll3){
				System.out.println("You won! You're wager has now been tripled!");
				money=money+(wager*3);
				System.out.println("You now have $"+money+".");
			}
			else{
				System.out.println("Didn't win this time, better luck next time!");
				money=money-wager;
				System.out.println("You now have $"+money+".");
			}
		
		}
		else{
		System.out.println("Sad to see you go! You still have $"+money+" left. Come again soon! Thanks!");
		}
		}
		System.out.println("You've run out of money! Thanks for coming! Come back soon!");
		
	}
}
