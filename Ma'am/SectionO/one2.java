//Create association between the following classes to calculate area
//Area and Circle 
// calculate area 
class Area{
int square(int n){
return n*n;	}
}
class Circle{
	Area a;// a object of Area class
	static double PI=3.1416;
	double area(int radius){
		a=new Area();
		int r=a.square(radius);
		return PI*r;	
	}	
}
public class one2{
	public static void main(String args[]){
		Circle c=new Circle();
		double result=c.area(5);
		System.out.println(result);
		
	}
}