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
		
		//Name
			System.out.println("What is your name?");
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
		//Title
			System.out.println("What is your title? Ex: Slayer of Dragons");
			String title=sc.nextLine();
		//Role	
			System.out.print("I love to learn coding remotely."); 
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
		//Skill points
			System.out.println("You have 20 skill points to spend in the folowing: Strength, Dexterity, Intelligence and Charisma. Spend them wisely.");
			int totalpts=20;
			System.out.print("Strength (1-10)");
			int strpts=sc.nextInt();
			if(strpts>10||strpts>totalpts){
				System.out.println("Please enter a smaller value");
				System.out.print("Strength (1-10)");
				int strpts=sc.nextInt();
			}
			else{
				int totalpts=totalpts-strpts;
			System.out.println("");
			System.out.println("You have "+totalpts+" left to spend");
			}
			System.out.print("Dexterity (1-10)");
			int dexpts=sc.nextInt();
			if(dexpts>10||dexpts>totalpts){
				System.out.println("Please enter a smaller value");
				System.out.print("Dexterity (1-10)");
				int dexpts=sc.nextInt();
			}
			else{
				int totalpts=totalpts-dexpts;
			}
			System.out.println("");
			System.out.println("You have "+totalpts+" left to spend");
			System.out.print("Intelligence (1-10)");
			int intlpts=sc.nextInt();
			int totalpts=totalpts-intlpts;
			System.out.println("");
			System.out.println("You have "+totalpts+" left to spend");
			System.out.print("Charisma (1-10)");
			int charpts=sc.nextInt();
			int totalpts=totalpts-charpts;
			System.out.println("");
			if(totalpts>=1){
				System.out.println("You have "+totalpts+" points left for next time");
			}
		//End
			System.out.println("--------------------------------------------------");
			System.out.println("You are "+name+" , the "+title+" of CVHS");
			System.out.println("You're a "+role+" with the following stats:");
			System.out.println("Strength - "+strpts);
			System.out.println("Dexterity - "+dexpts);
			System.out.println("Intelligence - "+intlpts);
			System.out.println("Charisma - "+charpts);
			System.out.println("");
			System.out.println("Good luck on your quest "+name+"!");


	}
}
