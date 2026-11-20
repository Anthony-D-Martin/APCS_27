/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	Wizard[] spells=new Wizard[100];
	Warrior[] swords=new Warrior[100];
	for(int i=0; i<100; i++){
		spells[i]=new Wizard();
		swords[i]=new Warrior();
	}
	int deathCountWiz=0;
	int deathCountWar=0;
	while(deathCountWar<100||deathCountWiz<100){
		spells[deathCountWiz].attack(swords[deathCountWar]);
		if(swords[deathCountWar].isDead()){
			deathCountWar++;
			System.out.println("This Warrior has fallen");
		}
		if(deathCountWar==100){
			System.out.println("The war is over. The Wizards have won with "+(100-deathCountWiz)+" fighters left");
			break;
		}
		swords[deathCountWar].attack(spells[deathCountWiz]);
		if(spells[deathCountWiz].isDead()){
			deathCountWiz++;
			System.out.println("This Wizard has fallen");
		}
		if(deathCountWiz==100){
			System.out.println("The war is over. The Warriors have won with "+(100-deathCountWar)+" fighters left");
			break;
		}
	}
	
	
	}
}
