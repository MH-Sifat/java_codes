// static valriable declaration
// static dataType variableName
/*
class Student{
	int rollnm;// instance variables
	String name; // instance variables
	static String university="AIUB";// static variable or class variable
	Student(int r, String n){
		rollnm=r;//local variables
		name=n;
		}
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll: "+rollnm);
	    System.out.println("UNI: "+university);
	}
}
public class TestStatic{
	public static void main(String args[]){
		Student s1= new Student(12,"Sifat");
		Student s2= new Student(13,"Mehedi");
		s1.display();
        s2.display();
		}
}
*/

/*
// static method

class StaticMethod{
	public int add(int a, int b){
		return a+b;
	}
	//static method declared
	public static int mul(int a,int b){
		return a*b;
	}
}

public class TestStatic{
	public static void main(String[] args){
		int result1, result2;
		// mul is an static method tai eta direct className.MethodName diye use kora hoyeche alada object er proyojon hoy nai
		result1 = StaticMethod.mul(5,7);
		System.out.println("Result 1 : " + result1);
		
		StaticMethod s1 = new StaticMethod();
		result2 = s1.add(15,50);
		System.out.println("Result 2 : " + result2);
	}
}
	
// static block


/*	
public class TestStatic{
	static int id;
	static String name;
	
	// this is how we write static block 
	// static block use kore amra uporer static variable gula ke initialize korte parbo
	static{
		id = 1554;
		name = "Sifat";
	}
	
	static void display(){
		System.out.println("ID:" + id);
		System.out.println("name:" + name);
	}
	
	// main method e static use kora hoy jate eta call korte kono object create korte nah hoy
	public static void main(String[] args){
		// display method static kora tai object create korte hoy nai
		TestStatic.display();
	}
}
*/

// static block

/*
public class TestStatic{
	
	// static block main method er o age call hoy
	static{
	   System.out.println("Static method");

	}

	
	public static void main(String[] args){
		System.out.println("Main method");
	}
}
*/


// static block
/*
public class TestStatic{
	//default constructor
public TestStatic(){
System.out.println("Inside Default Constructor");
}
//static block
static{
	int a=20;
	System.out.println(a);
	System.out.println("Inside the static block: -1");
}

static{
	int b=200;
	System.out.println(b);
	System.out.println("Inside the static block: -2");
}

//user defined method 
public void demo(){
System.out.println("Inside demo method");
}

public static void main(String args[]){
	TestStatic s1=new TestStatic();// creating an object  and call a default constructor
	s1.demo();//invoking the method through object
	
}
}
*/


// static block
public class TestStatic {
 static int staticVariable;
  
    static {
        // Initialize static variable
        staticVariable = 100;
        System.out.println("Static block executed.");
        System.out.println("Static variable initialized to: " + staticVariable);
    } 
	
	public TestStatic() {
        System.out.println("Constructor executed.");
    }
	
 public static void main(String[] args) {
       System.out.println("Main method started.");

       TestStatic obj1 = new TestStatic();
       TestStatic obj2 = new TestStatic();
       System.out.println("Static variable after creating objects: " + TestStatic.staticVariable);
		//classname.static variable name
    }
}
