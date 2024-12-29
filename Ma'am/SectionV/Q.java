//Q1. create an abstract class "Bank" and its abstract method "getROI()"
//implement it and use objects to find the rate of interest 
//ROI= interest /(principal* noOfYears);
//where the principal is 50000 taka and no of years=5

//solution
abstract class bank1{
	protected double principal=50000;
	protected int noOfYears=5;
	abstract double getROI();
	public void show(){
System.out.println("The rate of interest is: "+getROI());
}
}
class SonaliBank extends bank1{
	double interest=1000;
	double getROI(){
	return (interest)/(super.principal* super.noOfYears);
	} //super.show();
	
		
}
class AgraniBank extends bank1{
	double interest=2000;
	double getROI(){
	return (interest)/(super.principal* super.noOfYears);}
	//super.show();
	
}
public class Q{
	public static void main(String args[]){
		bank1 s=new SonaliBank();
		s.getROI();
	s.show();}
}
	