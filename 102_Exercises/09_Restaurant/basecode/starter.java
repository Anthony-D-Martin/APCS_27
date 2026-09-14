/*
 *	Author:  Anthony Martin
 *  Date: 9/14/2026
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("==========================================================");
		System.out.println("                  WELCOME RESTAURANT OWNER!");
		System.out.println("==========================================================");
		System.out.println("What's the name of your restaurant?");
		Scanner sc=new Scanner(System.in);
		String rname=sc.nextLine();
		System.out.println("What's your name?");
		String name=sc.nextLine();
		System.out.println("");
		System.out.println("Great to see you, "+name+"! Let's set up a menu for "+rname+"!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println("");
			System.out.println("--- Item #1 ---");
			System.out.println("Item name: ");
			String i1name=sc.nextLine();
			System.out.println("Price of "+i1name+" ($):");
			double i1price=sc.nextDouble();
				sc.nextLine();
			System.out.println("How name "+i1name+" would you like?");
			int i1count=sc.nextInt();
				sc.nextLine();
			System.out.println("Added "+i1count+"x "+i1name+" to your order! ($"+(i1price*i1count)+")");
		System.out.println("");
			System.out.println("--- Item #2 ---");
			System.out.println("Item name: ");
			String i2name=sc.nextLine();
			System.out.println("Price of "+i2name+" ($):");
			double i2price=sc.nextDouble();
				sc.nextLine();
			System.out.println("How name "+i2name+" would you like?");
			int i2count=sc.nextInt();
				sc.nextLine();
			System.out.println("Added "+i2count+"x "+i2name+" to your order! ($"+(i2price*i2count)+")");
		System.out.println("");
			System.out.println("--- Item #3 ---");
			System.out.println("Item name: ");
			String i3name=sc.nextLine();
			System.out.println("Price of "+i3name+" ($):");
			double i3price=sc.nextDouble();
				sc.nextLine();
			System.out.println("How name "+i3name+" would you like?");
			int i3count=sc.nextInt();
				sc.nextLine();
			System.out.println("Added "+i3count+"x "+i3name+" to your order! ($"+(i3price*i3count)+")");
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		double tip=sc.nextDouble();
		System.out.println(tip);
		System.out.println("");
		System.out.println("==========================================================");
		System.out.println("               "+rname+"- Menu For Today");
		System.out.println("==========================================================");
		System.out.println("Owner: "+name);
		System.out.println("----------------------------------------------------------");
		System.out.println("Item                       Qty                  Price     ");
		System.out.println("----------------------------------------------------------");
		System.out.println(i1name+"                   "+i1count+"             "+i1price);
		System.out.println(i2name+"                   "+i2count+"             "+i2price);
		System.out.println(i3name+"                   "+i3count+"             "+i3price);
		System.out.println("----------------------------------------------------------");
		double subtotal=(i1price*i1count)+(i2price*i2count)+(i3price*i3count);
		System.out.println("Subtotal:               "+subtotal);
		double tax=subtotal*(9.75/100);
		double tipamt=(tip/100)*subtotal;
		double total=tax+subtotal+tipamt;
		System.out.println("Tax (9.75%):            "+tax);
		System.out.println("Tip:                    "+tip);
		System.out.println("Tip Amount:               "+tipamt);
		System.out.println("==========================================================");
		System.out.println("TOTAL:                   $"+total);
		System.out.println("==========================================================");
		System.out.println("");
		System.out.println("Thanks for eating at "+rname);
		System.out.println("Come back soon -- we'll always have a byte for you!");


	}
}
