/*
 *	Author:Anthony Martin
 *  Date:10/29/26
 * 	Collaborator(s): Scotts Totts Foundation
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight=new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim=new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam=new Employee(2011, "Pam", "Beesly", 2250);
		Employee scrantonStrangler=new Employee(1234, "Toby", "Flenderson", 0.01);
		dwight.raiseSalary(30);
		jim.raiseSalary(31);
		pam.raiseSalary(25);
		scrantonStrangler.raiseSalary(-100);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(dwight.getFirstName()+"'s salary is $"+dwight.getSalary()+" and his annual salary is $"+dwight.getAnnualSalary());
		System.out.println(jim.getFirstName()+"'s salary is $"+jim.getSalary()+" and his annual salary is $"+jim.getAnnualSalary());
		System.out.println(pam.getFirstName()+"'s salary is $"+pam.getSalary()+" and her annual salary is $"+pam.getAnnualSalary());
		System.out.println(scrantonStrangler.getFirstName()+"'s salary is $"+scrantonStrangler.getSalary()+" and his annual salary is $"+scrantonStrangler.getAnnualSalary());
	}
}
