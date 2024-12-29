// abstraction in java
//Q1.create an abstract class "Bank " and its abstract method is "getROI" .
//implement this method by calculating with this formula: 
//ROI= interest /(principal* noOfYears)

import java.lang.*;
abstract class shapes{
	abstract void noOfSides();
}
class Rectangle extends shapes{
	//method overriding
	void noOfSides(){
		System.out.println("No. of Sides is 4");
	}
}
class triangle extends shapes{
	void noOfSides(){
		System.out.println("No. of Sides is 3");
	}
}
class circle extends shapes{
	void noOfSides(){
		System.out.println("No. of Sides is 0");
	}
}
public class shape{
	public static void main(String args[]){
		
shapes r=new Rectangle();
shapes t=new triangle();
shapes c=new circle();
r.noOfSides();
t.noOfSides();
c.noOfSides();}}

