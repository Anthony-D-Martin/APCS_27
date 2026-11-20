/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ArrayMethods {
	int example = 0;

	public static void toStringArray(int[] a) {
		for(int i=0; i<a.length-1; i++){
			System.out.print(a[i]+", ");
		}		
		System.out.println(a[a.length-1]);
	}
	public static int getArrayAverage(int[] a){
		int total=0;
		for(int i=0; i<a.length-1; i++){
			total+=a[i];
		}
		return total/a.length+1;	
	}
	public static int getArrayMax(int[] a){
		int max=0;
		for(int i=0; i<a.length-1; i++){
			if(a[i]>max){
				max=a[i];
			}
		}	
		return max;
	}
	public static int getArrayMin(int[] a){
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length-1; i++){
			if(a[i]<min){
				min=a[i];
			}
		}	
		return min;
	}



}

