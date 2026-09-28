/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		System.out.println("Guess a number (1-1000)");
		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt();
		int BorS;
		String repeat="";
		sc.nextLine();
		int random=((int)((Math.random())*1000)+1);
		if(num==random){
			System.out.println("You got it!");
		}
		else if(num<random){
				System.out.println("You didnt guess the number. The number is higher than your guess");
							System.out.println("Try again? (Yes/No)");
			String again=sc.nextLine();
			if(again.equals("Yes")){
				System.out.println("Guess another number (1-1000)");
				int num2=sc.nextInt();
				if(num2==random){
					System.out.println("You got it!");
				}
				else{
					System.out.println("You didn't guess the number");
					System.out.println("The number was "+random);
				}
			}
			if(again.equals("No")){
			System.out.println("The number was "+random);
			}
		}
		else if(num>random){
		System.out.println("You didn't guess the number. The number is lower than your guess");
			System.out.println("Try again? (Yes/No)");
			String again=sc.nextLine();
			if(again.equals("Yes")){
				System.out.println("Guess another number (1-1000)");
				int num2=sc.nextInt();
				if(num2==random){
					System.out.println("You got it!");
				}
				else{
					System.out.println("You didn't guess the number");
					System.out.println("The number was "+random);
			}
			
				}
			if(again.equals("No")){
			System.out.println("The number was "+random);
			}
			}
			
	}
}