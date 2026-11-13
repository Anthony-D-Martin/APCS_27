/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr=new int[1000];
		for(int loopAmt=0; loopAmt<(arr.length-1); loopAmt++){
			arr[loopAmt]=(int)(Math.random()*100)+1;
		}
		for(int anotherLoopAmt=0; anotherLoopAmt<(arr.length-1); anotherLoopAmt++){
			System.out.print(arr[anotherLoopAmt]+", ");
		}
		System.out.println();


		
	}
}
