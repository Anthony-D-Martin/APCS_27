/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Gamble {
	private static int money=1000;
		public static int deal(){
			int card=(int)((Math.random())*12)+1;
		if(card>=10||card>=12){
			return 10;
		}
		else{
			return card;
		}
	}

	public static String getObject(){
        int compRawHand=((int)(Math.random()*3)+1);
        String compHand="";
        if(compRawHand==1){
            compHand="Rock";
        }
        else if(compRawHand==2){
            compHand="Paper";
        }
        else if(compRawHand==3){
            compHand="Scissors";
        }
        return compHand;
    }
    public static int compare2(String a, String b){
        int outcome=0;
        if(a.equals(b)){
            outcome=0;
        }
        else if(a.equals("Rock")&&b.equals("Scissors")){
            outcome=1;
        }
        else if(a.equals("Paper")&&b.equals("Rock")){
            outcome=1;
        }
        else if(a.equals("Scissors")&&b.equals("Paper")){
            outcome=1;
        }
        else{
            outcome=2;
        }
        return outcome;
    }
    public static void RockPaperScissors(){
        Scanner sc=new Scanner(System.in);
        String play="";
        String rawHand="";
        String hand="";
        boolean validHand=false;
        int bet1=0;
        String compFinalHand="";
        int bet1Choice=0;
        String p1Hand="";
        String p2Hand="";
        int gameAmt=0;
        int dupeAmt=0;
        int p1WinAmt=0;
        int p2WinAmt=0;
        int netWinAmt=0;
    while(money>0){
        play="";
        rawHand="";
        hand="";
        validHand=false;
        bet1=0;
        compFinalHand="";
        bet1Choice=0;
        p1Hand="";
        p2Hand="";
        gameAmt=0;
        dupeAmt=0;
        p1WinAmt=0;
        p2WinAmt=0;
        netWinAmt=0;
        System.out.println("Would you like to play, or would you like to bet on bots? (me/bots/stop)");
        play=sc.nextLine();
        if(play.equalsIgnoreCase("me")||play.equalsIgnoreCase("m")){
            System.out.println("How much do you want to bet? You have $"+money);
            bet1=sc.nextInt();
            sc.nextLine();
            while(bet1<0||bet1>money){
                System.out.println("Not enough money. Try again");
                bet1=0;
                System.out.println("How much do you want to bet? You have $"+money);
                bet1=sc.nextInt();
                sc.nextLine();
            }
            money-=bet1;
            System.out.println("What hand do you throw?");
            rawHand=sc.nextLine();
            if(rawHand.equalsIgnoreCase("rock")||rawHand.equalsIgnoreCase("r")){
                validHand=true;
                hand="Rock";
            }
            else if(rawHand.equalsIgnoreCase("paper")||rawHand.equalsIgnoreCase("p")){
                validHand=true;
                hand="Paper";
            }
            else if(rawHand.equalsIgnoreCase("scissors")||rawHand.equalsIgnoreCase("s")){
                validHand=true;
                hand="Scissors";
            }
            else{
                System.out.println("Not valid hand. Try again");
                while(validHand==false){
                    System.out.println("What hand do you throw?");
                    rawHand=sc.nextLine();
                    if(rawHand.equalsIgnoreCase("rock")||rawHand.equalsIgnoreCase("r")){
                        validHand=true;
                        hand="Rock";
                    }
                    else if(rawHand.equalsIgnoreCase("paper")||rawHand.equalsIgnoreCase("p")){
                    validHand=true;
                    hand="Paper";
                    }
                    else if(rawHand.equalsIgnoreCase("scissors")||rawHand.equalsIgnoreCase("s")){
                          validHand=true;
                          hand="Scissors";
                      }
                    else{
                       System.out.println("Not valid hand. Try again");
                    }
                
                }
            }
        System.out.println("You threw a "+hand);
        compFinalHand=getObject();
        System.out.println("The computer threw a "+compFinalHand);
       if((compare2(hand, compFinalHand))==1){
            System.out.println("You won, doubling your money");
            money+=bet1*2;
            System.out.println("You now have "+money);
        }
        else if((compare2(hand, compFinalHand))==2){
            System.out.println("You lost");
            System.out.println("You now have "+money);
        } 
        else{
            System.out.println("You tied, you've been refunded");
            money+=bet1;
            System.out.println("You still have "+money);
        }
        }
        if(play.equalsIgnoreCase("bots")||play.equalsIgnoreCase("b")){
            System.out.println("Who would you like to bet on? Player 1 or 2?");
            bet1Choice=sc.nextInt();
            sc.nextLine();
            while(bet1Choice!=1&&bet1Choice!=2){
                System.out.println("That player doesn't exist. Try again.");
                System.out.println("Who would you like to bet on? Player 1 or 2?");
                bet1Choice=sc.nextInt();
                sc.nextLine();
            }
            System.out.println("How much do you want to bet on Player "+bet1Choice+"? You have $"+money);
            bet1=sc.nextInt();
            sc.nextLine();
            while(bet1<0||bet1>money){
                System.out.println("Not enough money. Try again");
                bet1=0;
                System.out.println("How much do you want to bet on Player "+bet1Choice+"? You have $"+money);
                bet1=sc.nextInt();
                sc.nextLine();
            }
            System.out.println("How many games would you like to bet on?");
            gameAmt=sc.nextInt();
            sc.nextLine();
            while(gameAmt<0){
                System.out.println("Can't be negative. Try again");
                gameAmt=0;
                System.out.println("How many games would you like to bet on?");
                gameAmt=sc.nextInt();
                sc.nextLine();
            }
            
            while(gameAmt>0&&money>0){
                money-=bet1;
            p1Hand=getObject();
            System.out.println("Player 1 threw a "+p1Hand);
            p2Hand=getObject();
            System.out.println("Player 2 threw a "+p1Hand);
            if(bet1Choice==1){
            if((compare2(p1Hand, p2Hand))==1){
                System.out.println("Your choice won, doubling your money");
                p1WinAmt+=1;
                money+=bet1*2;
              System.out.println("You now have $"+money);
            }
            else if((compare2(p1Hand, p2Hand))==2){
                System.out.println("Your choice lost");
                p2WinAmt+=1;
                System.out.println("You now have $"+money);
            } 
            else{
                System.out.println("The players tied, you've been refunded");
                dupeAmt+=1;
                money+=bet1;
                System.out.println("You still have $"+money);
            }
        }
        else{
            if((compare2(p1Hand, p2Hand))==1){
                System.out.println("Your choice won, doubling your money");
                p2WinAmt+=1;
                money+=bet1*2;
              System.out.println("You now have $"+money);
            }
            else if((compare2(p1Hand, p2Hand))==2){
                System.out.println("Your choice lost");
                p1WinAmt+=1;
                System.out.println("You now have $"+money);
            } 
            else{
                System.out.println("The players tied, you've been refunded");
                dupeAmt+=1;
                money+=bet1;
                System.out.println("You still have $"+money);
            }      
        }
        gameAmt-=1;

            }
            System.out.println("Player 1 won "+p1WinAmt+" times");
        System.out.println("Player 2 won "+p2WinAmt+" times");
        System.out.println("There were "+dupeAmt+" ties");
        
        if(bet1Choice==1){
            netWinAmt=p1WinAmt-p2WinAmt;
            if(netWinAmt>0){
                System.out.println("Net gain of of "+netWinAmt+" games resulting in $"+(netWinAmt*bet1));
            }
            else{
                System.out.println("Net loss of of "+netWinAmt+" games resulting in $"+(netWinAmt*bet1));
            }
        }
        else{
            netWinAmt=p2WinAmt-p1WinAmt;
            if(netWinAmt>0){
                System.out.println("Net gain of of "+netWinAmt+" games resulting in $"+(netWinAmt*bet1));
            }
            else{
                System.out.println("Net loss of of "+netWinAmt+" games resulting in -$"+(netWinAmt*bet1));
            }
        }
        System.out.println("You now have $"+money);
        

        }
        if(play.equalsIgnoreCase("stop")||play.equalsIgnoreCase("s")){
            break;
        }
          }
    }
	public static void blackjack(){
		//blackjack
		Scanner sc=new Scanner(System.in);
		int inHand1;
		int inHand2;
		int bet;
		String ace1;
		String ace2;
		String HitOrStay;
		int newHand;
		int inDealerHand1;
		int inDealerHand2;
		int dealerHand;
		int dealerHit;
		boolean risky;
		boolean playAgain=true;
		String playAgainRaw="";
		while (money>0&&playAgain==true){
		bet=0;
		inHand1=0;
		inHand2=0;
		ace1="";
		ace2="";
		HitOrStay="";
		newHand=0;
		inDealerHand1=deal();
		inDealerHand2=deal();
		dealerHit=0;
		risky=false;
		dealerHand=inDealerHand1+inDealerHand2;
		System.out.println("You have $"+money+". How much would you like to bet?");
		bet=sc.nextInt();
		sc.nextLine();
		while(bet>money||bet<0){
		System.out.println("You don't have that much broke boi. Try again");
		bet=sc.nextInt();
		sc.nextLine();
		}
		money-=bet;
		System.out.println("Blackjack but dum");
		inHand1=deal();
		inHand2=deal();
		
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
		System.out.println("The dealer was dealt a "+inDealerHand1+" and a "+inDealerHand2+" with a total of "+dealerHand+".");		
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
			money+=bet*2;
		}
		else if(hand==dealerHand&&hand<22){
			System.out.println("The dealer had a "+dealerHand+" and you had a "+hand+",tying the game. Come back soon!");
			money+=bet;
		}
		else{
			System.out.println("The dealer had a "+dealerHand+" and you had a "+hand+". Haha you're broke now");
		}
		if(money>0){System.out.println("Would you like to play again?");
		playAgainRaw=sc.nextLine();
		if(playAgainRaw.equalsIgnoreCase("yes")||playAgainRaw.equalsIgnoreCase("y")){
			playAgain=true;
		}
		else{
			playAgain=false;
		}
        }
	}
    }
    
    public static int wheelSpinAm(){
        int spin=(int)(Math.random()*38)+1;
        if(spin<=18){
            // Red
            return 1;
        }
        else if(spin>=18&&spin<=36){
            // Black
            return 2;
        }
        else{
            // Green
            return 3;
        }
    }
    public static int wheelSpinEu(){
        int spin=(int)(Math.random()*37)+1;
        if(spin<=18){
            // Red
            return 1;
        }
        else if(spin>=18&&spin<=36){
            // Black
            return 2;
        }
        else{
            // Green
            return 3;
        }
    }
    public static void rouletteWheel(){
    Scanner sc=new Scanner(System.in);
    String rouletteType="";
    String bet2ColorChoice="";
    String bet2ColorString="";
    int bet2=0;
    int spin1Raw=0;
    String spin1="";
    String playAgainRaw2="";
    boolean playAgain2=true;
    while(playAgain2==true&&money>0){
        System.out.println("Would you like to play European Roulette or American Roulette? Or, stop playing");
        rouletteType=sc.nextLine();
        if(rouletteType.equalsIgnoreCase("european")||rouletteType.equalsIgnoreCase("european roulette")||rouletteType.equalsIgnoreCase("eu")||rouletteType.equalsIgnoreCase("e")){
            System.out.println("Which color would you like to bet on? Red, Black or Green.");
            bet2ColorChoice=sc.nextLine();
            while(!(bet2ColorChoice.equalsIgnoreCase("R")||bet2ColorChoice.equalsIgnoreCase("Red")||bet2ColorChoice.equalsIgnoreCase("B")||bet2ColorChoice.equalsIgnoreCase("Black")||bet2ColorChoice.equalsIgnoreCase("G")||bet2ColorChoice.equalsIgnoreCase("Green"))){
                System.out.println("That color does't exist. Try again.");
                System.out.println("Which color would you like to bet on? Red, Black or Green.");
                bet2ColorChoice=sc.nextLine();
            }
            if(bet2ColorChoice.equalsIgnoreCase("R")||bet2ColorChoice.equalsIgnoreCase("Red")){
                bet2ColorString="Red";
            }
            else if(bet2ColorChoice.equalsIgnoreCase("B")||bet2ColorChoice.equalsIgnoreCase("Black")){
                bet2ColorString="Black";
            }
            else{
                bet2ColorString="Green";
            }
            System.out.println("How much do you want to bet on "+bet2ColorString+"? You have $"+money);
            bet2=sc.nextInt();
            sc.nextLine();
            while(bet2<0||bet2>money){
                System.out.println("Not enough money. Try again");
                bet2=0;
                System.out.println("How much do you want to bet on "+bet2ColorString+"? You have $"+money);
                bet2=sc.nextInt();
                sc.nextLine();
            }
            money-=bet2;
            spin1Raw=wheelSpinAm();
            if(spin1Raw==1){
                spin1="Red";
            }
            else if(spin1Raw==2){
                spin1="Black";
            }
            else{
                spin1="Green";
            }
            System.out.println("The wheel landed on "+spin1);
            if(bet2ColorString.equals(spin1)&&!(spin1.equals("Green"))){
                money+=bet2*2;
                System.out.println("You won! Congrats. You now have $"+money);
            }
            else if(bet2ColorString.equals("Green")&&spin1.equals("Green")){
                money+=bet2*8;
                System.out.println("You hit the jackpot!!! You now have $"+money+"!");
            }
            else{
                System.out.println("You lost... You now have $"+money);
            }
            if(money>0){
            System.out.println("Would you like to play again?");
		    playAgainRaw2=sc.nextLine();
		    if(playAgainRaw2.equalsIgnoreCase("yes")||playAgainRaw2.equalsIgnoreCase("y")){
			    playAgain2=true;
		    }
		    else{
		    	playAgain2=false;
		    }
          }            


        }  
        else if(rouletteType.equalsIgnoreCase("american")||rouletteType.equalsIgnoreCase("american roulette")||rouletteType.equalsIgnoreCase("a")){
        System.out.println("Which color would you like to bet on? Red, Black or Green.");
            bet2ColorChoice=sc.nextLine();
            while(!(bet2ColorChoice.equalsIgnoreCase("R")||bet2ColorChoice.equalsIgnoreCase("Red")||bet2ColorChoice.equalsIgnoreCase("B")||bet2ColorChoice.equalsIgnoreCase("Black")||bet2ColorChoice.equalsIgnoreCase("G")||bet2ColorChoice.equalsIgnoreCase("Green"))){
                System.out.println("That color does't exist. Try again.");
                System.out.println("Which color would you like to bet on? Red, Black or Green.");
                bet2ColorChoice=sc.nextLine();
            }
            if(bet2ColorChoice.equalsIgnoreCase("R")||bet2ColorChoice.equalsIgnoreCase("Red")){
                bet2ColorString="Red";
            }
            else if(bet2ColorChoice.equalsIgnoreCase("B")||bet2ColorChoice.equalsIgnoreCase("Black")){
                bet2ColorString="Black";
            }
            else{
                bet2ColorString="Green";
            }
            System.out.println("How much do you want to bet on "+bet2ColorString+"? You have $"+money);
            bet2=sc.nextInt();
            sc.nextLine();
            while(bet2<0||bet2>money){
                System.out.println("Not enough money. Try again");
                bet2=0;
                System.out.println("How much do you want to bet on "+bet2ColorString+"? You have $"+money);
                bet2=sc.nextInt();
                sc.nextLine();
            }
            money-=bet2;
            spin1Raw=wheelSpinAm();
            if(spin1Raw==1){
                spin1="Red";
            }
            else if(spin1Raw==2){
                spin1="Black";
            }
            else{
                spin1="Green";
            }
            System.out.println("The wheel landed on "+spin1);
            if(bet2ColorString.equals(spin1)&&!(spin1.equals("Green"))){
                money+=bet2*2;
                System.out.println("You won! Congrats. You now have $"+money);
            }
            else if(bet2ColorString.equals("Green")&&spin1.equals("Green")){
                money+=bet2*8;
                System.out.println("You hit the jackpot!!! You now have $"+money+"!");
            }
            else{
                System.out.println("You lost... You now have $"+money);
            }
            if(money>0){
            System.out.println("Would you like to play again?");
		    playAgainRaw2=sc.nextLine();
		    if(playAgainRaw2.equalsIgnoreCase("yes")||playAgainRaw2.equalsIgnoreCase("y")){
			    playAgain2=true;
		    }
		    else{
		    	playAgain2=false;
		    }
          }            
        }
        else if(rouletteType.equalsIgnoreCase("stop")||rouletteType.equalsIgnoreCase("s")){
            break;
        }
        else{
            System.out.println("Invalid type. Try again");
        }
    }
    }
    public static void slots(){
		Scanner sc=new Scanner(System.in);
		while(money>0){
			System.out.println("Would you like to play slots?");
			String play=sc.nextLine();
				if(play.equalsIgnoreCase("yes")||play.equalsIgnoreCase("y")){
				System.out.println("You have $"+money+". How much would you like to wager?");
				int wager=sc.nextInt();
				sc.nextLine();
				while(wager>money){
					System.out.println("You only have $"+money+"! Please enter a smaller number:");
					wager=sc.nextInt();
					sc.nextLine();
				}
				money=money-wager;
				System.out.println("Great! Lets play!!!");
				int roll1=(int)((Math.random()*10)+1);
				int roll2=(int)((Math.random()*10)+1);
				int roll3=(int)((Math.random()*10)+1);
				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				System.out.println(" |"+roll1+"|"+roll2+"|"+roll3+"|");
				System.out.println("_______________________");
				if(roll1==roll2&&roll2==roll3){
					System.out.println("You won! You're wager has now been tripled!");
					money += wager * 3;
					System.out.println("You now have $"+money+".");
				}
				else if(roll1!=roll2&&roll2!=roll3&&roll1!=roll3){
					System.out.println("Didn't win this time, better luck next time!");
					System.out.println("You now have $"+money+".");
					
				}
				else{
					System.out.println("You won! You're wager has now been doubled!");
					money += wager * 2;
					System.out.println("You now have $"+money+".");
				}
				
		}
		else{
		break;
		}
		}
    }
	public static int getMoney(){
		return money;
	}

}