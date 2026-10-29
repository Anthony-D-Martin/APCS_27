/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name=new String(name);
		this.age=age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name=nane;
	}
	
	public void setAge(int age){
		this.age=age;
	}

	public boolean isSameName(String name){
		if(this.name.equals(name)){
			return true;
		}
		else{
			return false;
		}
	}
}

