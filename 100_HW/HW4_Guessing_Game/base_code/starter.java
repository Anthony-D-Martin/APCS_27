/*
 *	Author: Anthony Martin
 *  Date: 9/24/26
 * 	Collaborator: Flowery
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int question=(int)((Math.random())*3)+1;
		//line above don't work, idk why
		Scanner sc=new Scanner(System.in);
		if(question==1){
			System.out.println("Input your first guess.");
			System.out.println("Hint: it's used to hold things together");
			String guess1=sc.nextLine();
			if(guess1.equals("Paperclip")||guess1.equals("paperclip")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. Try again");
				System.out.println("Hint: you can find it in an office");
				String guess2=sc.nextLine();
				if(guess2.equals("Paperclip")||guess2.equals("paperclip")){
					System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. It was a paperclip");
			}

		}
		}
		if(question==2){
			System.out.println("Input your first guess.");
			System.out.println("Hint: it's made of metal and glass");
			String guess1=sc.nextLine();
			if(guess1.equals("telescope")||guess1.equals("Telescope")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. Try again");
				System.out.println("Hint: people use it to make things look bigger");
				String guess2=sc.nextLine();
				if(guess2.equals("Telescope")||guess2.equals("telescope")){
					System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. It was a telescope");
			}
		}
		}
		if(question==3){
			System.out.println("Input your first guess.");
			System.out.println("Hint: it's made of rubber");
			String guess1=sc.nextLine();
			if(guess1.equals("Rubber Duck")||guess1.equals("rubber duck")||guess1.equals("rubber Duck")||guess1.equals("Rubber duck")){
				System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. Try again");
				System.out.println("Hint: it's found in bathtubs");
				String guess2=sc.nextLine();
				if(guess2.equals("Rubber Duck")||guess2.equals("rubber duck")||guess2.equals("rubber Duck")||guess2.equals("Rubber duck")){
					System.out.println("You got it right!");
			}
			else{
				System.out.println("You didn't get it. It was a rubber duck");
			}
		}
	}
	}	
}
