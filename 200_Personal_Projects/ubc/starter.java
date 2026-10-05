/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("Select an exhibit:");
		System.out.println("1. Food");
		System.out.println("2. Drinks");
		String exhibit=sc.nextLine();
	if(exhibit.equalsIgnoreCase("food")){
		System.out.println("Please pick a food place");
		System.out.println("1. Banana");
		System.out.println("2. Potato");
		String place=sc.nextLine();
		if(place.equalsIgnoreCase("banana")){
			System.out.println("🍌");
		}
		else if(place.equalsIgnoreCase("potato")){
			System.out.println("🥔");
		}
		else{
			System.out.println("You didn't choose a place, you exit the exhibit");
		}
	}
	else if(exhibit.equalsIgnoreCase("drinks")){
		System.out.println("Please pick a drink place:");
	}

		
	}
}
