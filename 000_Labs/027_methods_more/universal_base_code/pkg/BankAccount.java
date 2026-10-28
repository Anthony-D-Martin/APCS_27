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
		isActive=false;
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
	public void checkBalance(){
		System.out.println(Balance);
	}
	public void displayAccountInfo(){
		System.out.println(Owner);
		System.out.println(AccountNumber);
		System.out.println(Balance);
		System.out.println(isActive);
	}
}