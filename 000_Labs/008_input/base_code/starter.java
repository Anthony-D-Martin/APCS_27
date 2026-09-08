/*
 *	Author:  Anthony Martin
 *  Date: 9/8/26
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.


	Scanner sc=new Scanner(System.in);
		System.out.println("What is your name");
		String Name=sc.nextLine();
		System.out.println("What is your age?");
		int Age=sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int Month=sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int Day=sc.nextInt();
		System.out.println("What year were you born?");
		int Year=sc.nextInt();
		System.out.println("If I have a dollar and two quarters, how much money do I have?");
		double Money=sc.nextDouble();

		System.out.println("Your name is "+Name+" and you were born on "+Month+"/"+Day+"/"+Year+".");
		System.out.println("You are "+Age+" years old!!!");
		System.out.println("You have $"+Money+" in your wallet.");

	


	}
}
