/*
 *	Author:  Anthony Martin
 *  Date: 9/24/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your first number:");
		int num1=sc.nextInt();
		System.out.println("Please enter your second number:");
		int num2=sc.nextInt();
		System.out.println("Please enter your third number:");
		int num3=sc.nextInt();
		int maxnum = 0;
		int minnum = 0;
		if((num1>=num2) && (num1>=num3)){
			maxnum=num1;
		}
		if((num2>=num1) && (num2>=num3)){
			maxnum=num2;
		}
		if((num3>=num2) && (num3>=num1)){
			maxnum=num3;
		};
		
		if((num1<=num2) && (num1<=num3)){
			minnum=num1;
		}
		if((num2<=num1) && (num2<=num3)){
			minnum=num2;
		}
		if((num3<=num2) && (num3<=num1)){
			minnum=num3;
		}
		System.out.println("The largest number is "+maxnum);
		System.out.println("The smallest number is "+minnum);
	}
}
