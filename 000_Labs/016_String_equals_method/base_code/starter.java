/*
 *	Author:  Anthony Martin
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Select your role:");
		System.out.println("Wizard, Warrior or Rogue");
		Scanner sc=new Scanner(System.in);
		String role=sc.nextLine();
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("Role chosen: Wizard");
		}
		else if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("Role chosen: Warrior");
		}
		else if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("Role chosen: Rogue");
		}
		else{
			System.out.println("Invalid role. Please try again");
		}
	}
}
