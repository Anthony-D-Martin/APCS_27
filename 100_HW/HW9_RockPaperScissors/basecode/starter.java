/*
 *	Author:
 *  Date:
 *	Collaborator(s):
 * I made it gamble-able
*/

import java.util.Scanner;

class starter {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String play="";
        int money=1000;
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
        System.out.println("Would you like to play? (yes/no/done)");
        play=sc.nextLine();
        if(play.equalsIgnoreCase("yes")||play.equalsIgnoreCase("y")){
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
        if(play.equalsIgnoreCase("no")||play.equalsIgnoreCase("n")){
            System.out.println("Who would you like to bet on? Player 1 or 2?");
            bet1Choice=sc.nextInt();
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
            money-=bet1;
            while(gameAmt>0){
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
        System.out.println("Player 1 won "+p1WinAmt+" times");
        System.out.println("Player 2 won "+p2WinAmt+" times");
        System.out.println("There were "+dupeAmt+" ties");
            }

        }
        if(play.equalsIgnoreCase("done")||play.equalsIgnoreCase("d")){
            break;
        }
          }
}
}
