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
		BaseClass test = new BaseClass();
		int[] random=new int[(int)(Math.random()*150)+51];
		System.out.println("Integer amount is "+(random.length-1));
		int compare=Integer.MAX_VALUE;
		int loopAmt=0;
		while(loopAmt<random.length-1){
		random[loopAmt]=(int)((Math.random()*100)+1);
		loopAmt++;
		}
		loopAmt=0;
		while(loopAmt<random.length-1){
			if(random[loopAmt]<compare){
				compare=random[loopAmt];
			}
			loopAmt++;
		}
		System.out.println("Minimum is "+compare);
		loopAmt=0;
		compare=0;
		while(loopAmt<random.length-1){
			if(random[loopAmt]>compare){
				compare=random[loopAmt];
			}
			loopAmt++;
		}
		System.out.println("Maximum is "+compare);	
		loopAmt=0;
		double total=0;
		while(loopAmt<random.length-1){
			total+=random[loopAmt];
			loopAmt++;
		}
		System.out.println("Average is "+total/(random.length-1));
	}
}
