/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String[] arr=new String[10];
		arr[0]="Is this the real life? Is this just fantasy?";
		arr[1]="Caught in a landslide, no escape from reality";
		arr[2]="Open your eyes, look up to the skies and see";
		arr[3]="I'm just a poor boy, I need no sympathy";
		arr[4]="Because I'm easy come, easy go";
		arr[5]="Little high, little low";
		arr[6]="Any way the wind blows doesn't really matter to me";
		arr[7]="To me";
		arr[8]="Mama, just killed a man";
		arr[9]="Put a gun against his head, pulled my trigger, now he's dead";
		int loopAmt=0;
		while(loopAmt<(arr.length)){
			System.out.println(arr[loopAmt]);
			loopAmt++;
		}

		
	}
}
