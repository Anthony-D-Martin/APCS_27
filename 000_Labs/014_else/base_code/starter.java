/*
 *	Author:  Anthony Martin
 *  Date: 9/25/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("Guess a number (1-1000)");
		Scanner sc=new Scanner(System.in); 
		int num=sc.nextInt();
		String repeat="";
		sc.nextLine();
		int random=((int)((Math.random())*1000)+1);
		if(num==random){
			System.out.println("You got it!");
		}
		else{
			System.out.println("You didnt guess the number.");
			System.out.println("Try again? (Yes/No)");
			String again=sc.nextLine();
			if(again.equals("Yes")){
				System.out.println("Guess another number (1-1000)");
				int num2=sc.nextInt();
				if(num2==random){
					System.out.println("You got it!");
				}
				else{
					System.out.println("You didnt guess the number");
					System.out.println("The number was "+random);
				}
			}
			if(again.equals("No")){
			System.out.println("The number was "+random);
			}
			}
			
		}
	}
