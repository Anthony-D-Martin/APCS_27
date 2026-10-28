package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor="unknown";
		age=0;
		villain="unknown";
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String person){
		actor=person;
		age=0;
		villain="unknown";
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int howOld){
		actor="unknown";
		age=0;
		villain="unknown";
	}
	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String person, int howOld){
		actor=person;
		age=howOld;
		villain="unknown";
	}
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(String person, int howOld, String meanie){
		actor=person;
		age=howOld;
		villain=meanie;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public String getActor(){
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillain(){
		return villain;
	}
	public void setActor(String newPerson){
		actor=newPerson;
	}
	public void setAge(int newOld){
		age=newOld;
	}
	public void setVillain(String newMeanie){
		villain=newMeanie;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
