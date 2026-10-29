/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String Owner;
	int AccountNumber;
	static int nextAccountNumber=(int)(Math.random()*950)+50;
	double Balance;
	boolean isActive;
	

	// -------CONSTRUCTORS-------
	//How to seperate constructors?
	public BankAccount(){
		Owner= "unknown";
		AccountNumber=nextAccountNumber;
		nextAccountNumber+=1;
		Balance=0.0;
		isActive=true;
	}

	public BankAccount(String name){
		Owner=name;
		AccountNumber=nextAccountNumber;
		nextAccountNumber+=1;
		Balance=0;
		isActive=true;
	}

	public BankAccount(double initBalance){
		Owner= "unknown";
		AccountNumber=nextAccountNumber;
		nextAccountNumber+=1;
		Balance=initBalance;
		isActive=true;
	}
	public BankAccount(String name, double initBalance){
		Owner= name;
		AccountNumber=nextAccountNumber;
		nextAccountNumber+=1;
		Balance=initBalance;
		isActive=true;
	}

	// -------METHODS-------
	
	public void displayAccountInfo(){
		System.out.println("Account Owner: "+Owner);
		System.out.println("Account Number: "+AccountNumber);
		System.out.println("Balance: "+Balance);
		System.out.println("Account Activity: "+isActive);
		System.out.println();
	}
	public void setOwner(String name){
		Owner=name;
	}
	public String getOwner(){
		return Owner;
	}
	public double getBalance(){
		return Balance;
	}
	public void checkBalance(){
		System.out.println("Account Balance: "+Balance);
	}
	public void closeAccount(){
		Owner= "unknown";
		AccountNumber=0;
		Balance=0.0;
		isActive=false;
	}
	public boolean isActive(){
		return isActive;
	}
	public void deposit(double depositAmt){
		if(isActive==true){
		Balance+=depositAmt;
		}
		else{
			System.out.println("Account not active. Deposit not made");
		}
	}
	public void withdraw(double withdrawAmt){
		if(withdrawAmt<=Balance&&isActive==true){
			Balance-=withdrawAmt;
		}
		else if(withdrawAmt>Balance){
			System.out.println("Not enough money in account. Withdraw not made");
		}
		else{
			System.out.println("Account not active. Withdraw not made");

		}
	}


}