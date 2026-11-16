/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		
	}

	public static void printArray(String[] arr){
		int loopAmt=0;
		while(loopAmt<arr.length){
			System.out.println(arr[loopAmt]);
			loopAmt++;
		}
	}

	public static void leftShift(String [] arr){
		int loopAmt=0;
		String store=arr[0];
		arr[0]="";
		while(loopAmt<(arr.length-1)){
			arr[loopAmt]=arr[loopAmt+1];
			loopAmt++;
		}
		arr[(arr.length-1)]=store;
	}

	public static void leftShift(String [] arr, int num){
		int loopAmt=0;
		while(loopAmt<num){
			leftShift(arr);
			loopAmt++;
		}
	}
}
