/*
 *	Author: Anthony Martin 
 *  Date: 10/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a string");
	String toaster=sc.nextLine();
	toString(toaster);
	System.out.println("Input two more strings");
	String microwave=sc.nextLine();
	String oven=sc.nextLine();
	toStringCombined(microwave,oven);
	}
	public static void toString(String a){
			System.out.println(a);
			return;
		}
	public static void toStringCombined(String x, String y){
		System.out.println(x+" "+y);
		return;
	}
}
