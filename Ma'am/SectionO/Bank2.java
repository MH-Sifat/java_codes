// abstraction in java
//Q1.create an abstract class "Bank " and its abstract method is "getROI" .
//implement this method by calculating with this formula: 
//ROI= interest /(principal* noOfYears)
import java.lang.*;
abstract class bank{

public double principal=50000;
public int noOfYears=5;
public abstract double getROI();
public void show(){
System.out.println("The Rate of interest is"+getROI());}
}
class SonaliBank extends bank{
public double interest=1000;
	// method overriding
	public double getROI(){
		return (interest)/(super.principal*super.noOfYears);
		
	} 
	
}
class AgraniBank extends bank{
public double interest=2000;
	// method overriding
		public double getROI(){
		return (interest)/(super.principal*super.noOfYears);
		
	} 
}
public class Bank2{
	public static void main(String args[]){
		bank s=new SonaliBank();
		s.getROI();
		s.show();
		bank a=new AgraniBank();
		a.getROI();
		a.show();
		
	}
}