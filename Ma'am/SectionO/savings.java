// Polymorphism and association use.
//person and account class if you have multiple accounts for one person
// use display() for implementing polymorphism
package O;
import java.util.*;
import java.lang.*;
class savings extends Account{
	private double rate;
	public void setRate(double r){this.rate=r;}
	public double getRate(){return this.rate;}
	//method overriding 
	public void display(){
		
super.display();
System.out.println("Rate : "+getRate());}}
//javac -d . poly.java