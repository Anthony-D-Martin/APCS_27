/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr=new int[100];
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		ArrayMethods.toStringArray(arr);
		System.out.println("----------------------------");
		System.out.println(ArrayMethods.getArrayAverage(arr));
		System.out.println("----------------------------");
		System.out.println(ArrayMethods.getArrayMax(arr));
		System.out.println("----------------------------");
		System.out.println(ArrayMethods.getArrayMin(arr));


		
	}
}
