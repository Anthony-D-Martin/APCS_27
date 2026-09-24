/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the first integer?");
		int x=sc.nextInt();
		System.out.println("What is the second integer?");
		int y=sc.nextInt();
		boolean same=x==y;
		boolean diff=x!=y;
		if(same){
		System.out.println(x+" is the same as "+y+"!");
		}
		if(diff){
		System.out.println(x+" is not the same as "+y+"!");	
		}
}
