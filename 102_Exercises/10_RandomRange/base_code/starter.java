/*
 *	Author: Anthony Martin
 *  Date: 9/17/2026
 *	Collaborator(s): Triple T
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// I made it inclusive
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer:"); 
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter another integer (bigger than the first):");
		int num2=sc.nextInt();
		sc.nextLine();
		System.out.println("");
		System.out.println("Your range is "+num1+"to "+num2+".");
		System.out.println("Here are 5 numbers generated in that range.");
		int out1=(int)((Math.random()*((num2+1)-num1))+num1);
		int out2=(int)((Math.random()*((num2+1)-num1))+num1);
		int out3=(int)((Math.random()*((num2+1)-num1))+num1);
		int out4=(int)((Math.random()*((num2+1)-num1))+num1);
		int out5=(int)((Math.random()*((num2+1)-num1))+num1);
		System.out.println(out1+","+out2+","+out3+","+out4+","+out5);
	}
}
