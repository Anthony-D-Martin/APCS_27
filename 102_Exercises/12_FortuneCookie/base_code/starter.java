/*
 *	Author: Anthony Martin
 *  Date: 9/24/26
 *	Collaborator(s): Triple T
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println("");
		System.out.println("Password: ");
		int password=sc.nextInt();
		if(password==67){
			System.out.println("Password correct");
		}		
		if(password!=67){
			System.out.println("Password incorrect");
		}
		int random=(int)(((Math.random())*10)+1);
		if (random==1){
			System.out.println("You will expreience no errors when running your next line of code");
		}
		if (random==2){
			System.out.println("Hamurger");
		}
		if (random==3){
			System.out.println("Do or do not, there  is no try");
		}
		if (random==4){
			System.out.println("Do not put off until tommorrow what can be done today");
		}
		if (random==5){
			System.out.println("Good things will come your way");
		}
		if (random==6){
			System.out.println("You can do anything you put your mind to");
		}
		if (random==7){
			System.out.println("You will soon find great wealth");
		}
		if (random==8){
			System.out.println("The person next to you owes you $20");
		}
		if (random==9){
			System.out.println("You will gain great wisdom from your next cookie");
		}
		if (random==10){
			System.out.println("You will become very happy when you eat this cookie");
		}

	}
}
		

		