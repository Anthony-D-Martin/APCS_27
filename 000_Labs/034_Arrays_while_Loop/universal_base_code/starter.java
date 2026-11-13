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
		int loopAmt=0;
		while(loopAmt<(arr.length-1)){
			arr[loopAmt]=(int)(Math.random()*100)+1;
			loopAmt++;
		}
		loopAmt=0;
		while(loopAmt<(arr.length-1)){
			System.out.print(arr[loopAmt]+", ");
			loopAmt++;
		}
		System.out.println();



		
	}
}
