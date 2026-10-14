/*
 *	Author:  Anthony Martin
 *  Date: 10/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input base number");
	int base=sc.nextInt();
	System.out.println("Input a power");
	int power=sc.nextInt();
	System.out.println(pow(base,power));
	}
	public static int pow(int base, int power){
	int result=1;
		while(power>0){
			result=result*base;
			power=power-1;
		}
	return result;
	}
}
