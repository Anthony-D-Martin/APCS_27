/*
 *	Author: Anthony Martin
 *  Date: 9/24/26
 * 	Collaborator: Spamton G Spamton Best Salesman 1997
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

//	- Create a program that takes in two input integers. 
//- First check if each of these integers are odd or even. Output if each are or not.
//- Then check if they're divisible by 3, 4, and 5. Make sure ALL of these are checked.
//- Otherwise if it's not divisible by all 3, 4, and 5, output that it isn't! Only if all 3!

	System.out.println("Input first integer");
	Scanner sc=new Scanner(System.in);
	int int1=sc.nextInt();
	System.out.println("Input second integer");
	int int2=sc.nextInt();
	if(int1%2==0){
		System.out.println(int1+" is even");
	}
	else{
		System.out.println(int1+" is odd");
	}
	if(int2%2==0){
		System.out.println(int2+" is even");
	}
	else{
		System.out.println(int2+" is odd");
	}
	if(int1%3==0){
		System.out.println(int1+" is divisible by 3");
	}
	if(int1%4==0){
		System.out.println(int1+" is divisible by 4");
	}
	if(int1%5==0){
		System.out.println(int1+" is divisible by 5");
	}
	if(int1%5!=0&&int1%4!=0&&int1%3!=0){
		System.out.println(int1+" is not divisible by 3, 4 or 5");
	}
	if(int2%3==0){
		System.out.println(int2+" is divisible by 3");
	}
	if(int2%4==0){
		System.out.println(int2+" is divisible by 4");
	}
	if(int2%5==0){
		System.out.println(int2+" is divisible by 5");
	}
	if(int2%5!=0&&int2%4!=0&&int2%3!=0){
		System.out.println(int2+" is not divisible by 3, 4 or 5");
	}
	}
}
