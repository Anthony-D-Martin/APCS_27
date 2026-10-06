/*

 *	Author:  Anthony Martin

 *  Date: 10/5/26

*/



import java.util.Scanner;



class starter {

	public static void main(String args[]) {

		// Your code goes below here

		Scanner sc=new Scanner(System.in);

		System.out.println("What is your name?");

		String name=sc.nextLine();

		System.out.println("How many times do you want to say your name?");

		int printamt=sc.nextInt();

		int printnum=0;

		while(true){
			
			if(printnum>=printamt){

				break;

			}

		System.out.println(name);

		printnum=printnum+1;

		}

		

	}

}


