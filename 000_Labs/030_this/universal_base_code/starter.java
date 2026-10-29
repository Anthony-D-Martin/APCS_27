/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		
		PooleDwarf a=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf b=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf c=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf d=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf e=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf f=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		PooleDwarf g=new PooleDwarf(randName(), ((int)(Math.random()*20)+21));
		int dupe=0;
		if(a.isSameName(b.getName())){
			dupe+=1;
		}
		if(a.isSameName(c.getName())){
			dupe+=1;
		}
		if(a.isSameName(d.getName())){
			dupe+=1;
		}
		if(a.isSameName(e.getName())){
			dupe+=1;
		}
		if(a.isSameName(f.getName())){
			dupe+=1;
		}
		if(a.isSameName(g.getName())){
			dupe+=1;
		}
		System.out.println("There are "+dupe+" duplicates of "+a.getName());
	}
	}

