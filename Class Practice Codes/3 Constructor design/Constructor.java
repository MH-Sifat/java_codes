// designing Constructor 
/*
class Constructor{
	int age , id;
	String name;
	Constructor(){
		System.out.println("Dhon: ");
	}
	Constructor(String n , int a,int i){
		name = n;
		age = a ;
		id = i ;
	}
	void display(){
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
		System.out.println("id: " + id);
	}

	public static void main(String[] args){
		Constructor p1 = new Constructor();
		p1.display();
		Constructor p2 = new Constructor("Sifat", 22 , 1);
		p2.display();
	}
}
*/


/*
// This Line Import Math class It contains various static methods for mathematical operations, such as sqrt(), pow(), and sin() 
import java.lang.Math;

public class Constructor{
	public static void main(String[] args){
		double x=5,y;
		// Math.sqrt(x) calculates the square root of x.
		y = Math.sqrt(x);
		System.out.println("y = " + y);
	}
}
*/


/*
public class Constructor{
	private String name; // this is class variable , instance variable
	private int Id; // class variable 
	// class name ar Constructor name same hobe
	
	// default constructor
	Constructor(){
		System.out.print("Default");
	}
	
	Constructor(String n){
		name = n; // reassignment
	}
	
	Constructor(String n,int i){
		name = n;
		Id = i;
	}
	// display function with no specific data type
	void display(){
		System.out.println("Name is :" + name );
		System.out.println("Id is :" + Id);
	}
	
	// main funtion 
	public static void main(String[] args){
		Constructor c1 = new Constructor("Sifat");
		c1.display();
		Constructor c2 = new Constructor();
		c2.display();
		
	}
}
*/



// copy constructor
// optional_modifier constructor_name(constructor_name var_name){
//}
class Constructor{
	       
		int i;
		String n;
		public Constructor(int i, String n){
			this.i=i;// instance variable= local variable
		    this.n=n;
		}
		// copy constructor e data type e sei constructor er name thakbe karon amra ekhne ekta full object pathachi
		public Constructor(Constructor c)
		{
			i=c.i;
			n=c.n;
		}
		
		void display1(){ 
		System.out.println(i+" "+n);
		}
		
		public static void main(String args[]){
			Constructor cp = new Constructor(12,"Kabir");
			Constructor ct = new Constructor(cp);
			cp.display1();
            ct.display1();
			}
}
		

