/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] arr=new int[10];
		int loopAmtReversed=9;
		int loopAmt=0;
		while(loopAmt<(arr.length)){
			arr[loopAmt]=loopAmtReversed;
			System.out.println(arr[loopAmt]);
			loopAmt++;
			loopAmtReversed--;
		}


		
	}
}
