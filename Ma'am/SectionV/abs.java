//Abstraction in java 
Q1. create an abstract class "Bank" and its abstract method "getROI()"
implement it and use objects to find the rate of interest 
ROI= interest /(principal* noOfYears);
where the principal is 50000 taka and no of years=5
package V;
import java.lang.*;
abstract class shapes{
	abstract void noOfSides();
}
class Rectangle extends shapes{
	// method overriding
	void noOfSides(){
		System.out.println("No of sides of this shape is 4");
	}
}
class Triangle extends shapes{
	// method overriding
	void noOfSides(){
		System.out.println("No of sides of this shape is 3");
	}
}
public class abs{
	public static void main(String args[]){
		shapes r=new Rectangle();
		r.noOfSides();
		shapes t=new Triangle();
		t.noOfSides();
	}
}
