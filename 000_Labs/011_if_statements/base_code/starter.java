/*
 *	Author:  Anthony Martin
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc=new Scanner(System.in);
		int x=4;
		int y=3;
		System.out.println("The first number is "+x);
		System.out.println("The second number is "+y);
		boolean same=x==y;
		boolean diff=x!=y;
		if(same){
		System.out.println(x+" is the same as "+y+"!");
		}
		if(diff){
		System.out.println(x+" is not the same as "+y+"!");	
		}
}
