/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// I did this homework on my phone
		Scanner sc=new Scanner(System.in);
		System.out.println("Dog Name?");
		Dog a=new Dog(sc.nextLine());
		System.out.println("How old is "+a.getName());
		a.setAge(sc.nextInt());
		Dog b=new Dog("Lexi", "Pomeranian");
		System.out.println(b.getName()+" is a "+b.getBreed()+" and is "+b.getAge()+" years old");
		boolean aBark=false;
		if(a.isSleeping()){
			System.out.println(a.getName()+" is sleeping");
		}
		else{
			System.out.println(a.getName()+" is awake");
			a.bark();
			aBark=true;
		}
		if(b.isSleeping()){
			System.out.println(b.getName()+" is sleeping");
			if(aBark==true){
				b.bark();
			}
		}
		else{
			System.out.println(b.getName()+" is awake");
			if(aBark==true){
				b.bark();
			}
		}



	}
}
