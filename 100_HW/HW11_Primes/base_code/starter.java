/*
 *	Author: Anthony Martin
 *  Date: 11/3/26
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int checkNum){
		int compNum=2;
		while(compNum<checkNum){
			if(checkNum%compNum==0){
				return false;
			}
			compNum+=1;
		}
		return true;
	}
	public static void printPrimes(int num){
		int loopAmt=0;

		int nextPrintNum=0;

		while(loopAmt<num){

			if(checkPrime(nextPrintNum)){

				System.out.println(nextPrintNum);

			}

			loopAmt+=1;

			nextPrintNum+=1;

		}

	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number and I'll print out every prime number until that number");
		int num=sc.nextInt();
		sc.nextLine();
		printPrimes(num);
	}
}
