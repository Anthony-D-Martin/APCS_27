package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name="Clifford";
		age=3;
		breed="bug red dog";
	}
	public Dog(String name2){
		name=name2;
		age=1;
		breed="dog dog";
	}
	public Dog(String name2, String breed2){
		name=name2;
		age=1;
		breed=breed2;
	}
	public Dog(String name2, int age2){
		name=name2;
		age=age2;
		breed="dog dog";
	}
	public void setName(String name2){
name=name2;
	}
	public void setAge(int age2){
		age=age2;
	}
	public void setBreed(String breed2){
		breed=breed2;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		if((int)(Math.random()*2+1)==1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name+" barked!");
	}

}
