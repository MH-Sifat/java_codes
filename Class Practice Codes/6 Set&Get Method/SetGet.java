//setter and getter methods 
// a new way of reassigning
/*
// THIS LINE java.util.* Imports all utility classes in java.util, like ArrayList, Scanner, and Date.
import java.util.*;
// This Line java.lang.* Imports fundamental classes in java.lang, such as String, Math, System, and Object, though it’s unnecessary as it’s automatically imported by default
import java.lang.*;

public class SetGet{
	private double length;
	private double width;
	private double height;
	
	// Set Method
	// Set Method use kore value assign kori
	public void setLength(double l){
	this.length=l;
	}
	public void setWidth(double w){
	this.width=w;
	}
	public void setHeight(double h){
	this.height=h;
	}
	// Get Method
	// Get Method use kore value reutrn kori
	public double getLength(){
	return length;
	}
	public double getWidth(){
	return width;
	}
	public double getHeight(){
	return height;
	}
	
	public static void main(String args[]){
		SetGet b = new SetGet();
		
		b.setLength(2.50);
		b.setWidth(5.34);
		b.setHeight(6.20);
		
		System.out.println("Length is:"+b.getLength());
		System.out.println("Width is:"+b.getWidth());
        System.out.println("height is:"+b.getHeight());
		}
}
*/	


/*	
class Person{
	private String name;
	private int age;
	
	public void setName(String n){
		this.name = n;
	}
	public void setAge(int a){
		if(a > 0){
			this.age = a;
		}
		else{
			System.out.println("Invalid Age!");
		}
	}
	
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void display(){
		System.out.println("Name: " + getName());
		System.out.println("Age : " + getAge());
	}
}

public class SetGet{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.setName("Sifat");
		p1.setAge(40);
		p1.display();
		
		System.out.println("");
				
		p1.setName("Sifat");
		p1.setAge(0);
		p1.display();
	}
}
	
*/
