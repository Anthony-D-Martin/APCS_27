/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("What info do we know?");
		System.out.println("1. Nothing");
		System.out.println("2. Owner");
		System.out.println("3. Owner and Initial Deposit");
		int choice=sc.nextInt();
		sc.nextLine();
		String name="";
		double amt=0;
		BankAccount a = new BankAccount();
		if(choice==1){
			a= new BankAccount();
		}
		else if(choice==2){
			System.out.println("What is the name of the owner of this account?");
			name=sc.nextLine();
			a= new BankAccount(name);
		}
		else if(choice==3){
			System.out.println("What is the name of the owner of this account?");
			name=sc.nextLine();
			System.out.println("How much are you depositing?");
			amt=sc.nextInt();
			sc.nextLine();
			a=new BankAccount(name, amt);

		}
		else{
			System.out.println("Incorrect");
		}
		a.displayAccountInfo();
		System.out.println("Would you like to check the balance of this account? (yes/no)");
		String tobalanceornottobalancethatisthequestion=sc.nextLine();
		if(tobalanceornottobalancethatisthequestion.equals("yes")){
			a.checkBalance();
		}
		else if(tobalanceornottobalancethatisthequestion.equals("no")){
			System.out.println("Bye");
		}
	}
}
