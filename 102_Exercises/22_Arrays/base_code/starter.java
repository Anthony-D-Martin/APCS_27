/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] pirate=new int[1001];
		 int a=0;
		while (pirate.length>a){
			pirate[a]=a*3+3;
			System.out.print(pirate[a]+", ");
			a++;
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		int [] swashbuckler=new int[1001];
		int b=0;
		while(b<swashbuckler.length){
			swashbuckler[b]=1000-b;
			System.out.print(swashbuckler[b]+", ");
			b++;
		}
		System.out.println();
	}
}
