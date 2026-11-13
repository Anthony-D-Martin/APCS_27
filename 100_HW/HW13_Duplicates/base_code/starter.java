/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] arr=new int[20];
		int loopAmt=0;
		System.out.println("-----------------------------------------------");
		System.out.println("These are the 20 numbers");
		while(loopAmt<(arr.length-1)){
			arr[loopAmt]=(int)(Math.random()*10)+1;
			System.out.print(arr[loopAmt]+" ");
			loopAmt++;
		}
		System.out.println("");
		System.out.println("-----------------------------------------------");
		int target=(int)(Math.random()*10)+1;
		System.out.println("The target number is "+target);
		loopAmt=0;
		int dupeAmt=0;
		while(loopAmt<(arr.length-1)){
			if(target==arr[loopAmt]){
				System.out.println("Duplicate found at index "+loopAmt);
				dupeAmt++;
			}
			loopAmt++;
		}
		System.out.println("Total number of duplicates for "+target+" is "+dupeAmt);
		loopAmt=0;
		int compare=0;
		while(loopAmt<(arr.length-1)){
			compare=arr[loopAmt];
			if(compare==arr[loopAmt+1]){
				System.out.println("Two in a row found at indexes "+loopAmt+" and "+(loopAmt+1)+". The number is "+arr[loopAmt]);
				dupeAmt++;
			}
			loopAmt++;
		}
	}
}
