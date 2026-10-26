/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int deal(){
		while(money>0){
			int card=(int)((Math.random())*12)+1;
		if(card>=10||card>=12){
			return 10;
		}
		else{
			return card;
		}
	}
	public static void main(String args[]) {
		//blackjack
		Scanner sc=new Scanner(System.in);
		String ace1="";
		String ace2="";
		System.out.println("Blackjack but dum");
		int inHand1=deal();
		int inHand2=deal();
		
		if(inHand1==1){
			System.out.println("You were handed a "+inHand1+" and a "+inHand2+".");
			System.out.println("use ace as 1 or 11?");
			ace1=sc.nextLine();
			if(ace1.equals("1")){
				inHand1=1;
			}
			else if(ace1.equals("11")){
				inHand1=11;
			}
		}
		if(inHand2==1){
			System.out.println("You were handed a "+inHand1+" and a "+inHand2+".");
			System.out.println("use ace as 1 or 11?");
			ace2=sc.nextLine();
			if(ace2.equals("1")){
				inHand2=1;
			}
			else if(ace2.equals("11")){
				inHand2=11;
			}
		}
		int hand=inHand1+inHand2;
		System.out.println("You got handed a "+inHand1+" and a "+inHand2+" adding up to "+hand+". Hit or Stay?");
		String HitOrStay="";
		int newHand=0;
		while(hand<21){
			HitOrStay=sc.nextLine();
			if(HitOrStay.equalsIgnoreCase("Hit")||HitOrStay.equalsIgnoreCase("H")){
				newHand=deal();
				if(newHand==1){
					System.out.println("use ace as 1 or 11?");
					ace2=sc.nextLine();
					if(ace1.equals("1")){
						newHand=1;
					}
					else if(ace1.equals("11")){
						newHand=11;
					}
				}
				hand=hand+newHand;
				System.out.println("You got handed a "+newHand+" bringing your total to "+hand+".");
				newHand=0;
			}
			else if(hand>21){
				System.out.println("You busted");
			}
			else if(HitOrStay.equalsIgnoreCase("Stay")||HitOrStay.equalsIgnoreCase("S")){
				System.out.println("You stayed on "+hand);
				break;
			}
		
			else if(hand==21){
				System.out.println("You got it!");
				break;
			}
			else{
				System.out.println("incorrect");
				break;
			}
			
		}
		int inDealerHand1=deal();
		int inDealerHand2=deal();
		int dealerHand=inDealerHand1+inDealerHand2;
		System.out.println("The dealer was dealt a "+inDealerHand1+" and a "+inDealerHand2+" with a total of "+dealerHand+".");
		int dealerHit=0;
		boolean risky;
		if(((int)(Math.random()*2))==1){
			risky=true;
			System.out.println("The dealer is feeling risky today.");
		}
		else{
			risky=false;
			System.out.println("The dealer is feeling normal today.");
		}
		
		if(risky==true){
			while(dealerHand<17||dealerHand<hand&&!(hand>21)){
			System.out.println("The dealer hit");
			dealerHit=deal();
			dealerHand=dealerHand+dealerHit;
			System.out.println("The dealer got a "+dealerHit+" bringing their total to "+dealerHand+".");
			dealerHit=0;
			}
		}
		else{
			while(dealerHand<17){
			System.out.println("The dealer hit");
			dealerHit=deal();
			dealerHand=dealerHand+dealerHit;
			System.out.println("The dealer got a "+dealerHit+" bringing their total to "+dealerHand+".");
			dealerHit=0;
			}
		}
		if(hand>dealerHand&&hand<22||dealerHand>21&&hand<=21){
			System.out.println("The dealer had a "+dealerHand+" and you had a "+hand+". Congrats!");
		}
		else if(hand==dealerHand&&hand<22){
			System.out.println("The dealer had a "+dealerHand+" and you had a "+hand+",tying the game. Come back soon!");
		}
		else{
			System.out.println("The dealer had a "+dealerHand+" and you had a "+hand+". Haha you're broke now");
		}
		
	}	
	}

}
