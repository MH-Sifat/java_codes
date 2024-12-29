// Inheritance
// Inheritance is used to borrow properties & methods from an existing class
// It allows the child classes to reuse the functionality of the parent class while adding or modifying their own behavior.
// amra multiple parent class create korte parbo nah kintu multiple child class create korte parbo 
// Each Java class has one (and only one) superclass. There is no limit to the number of subclasses a class can have

package inheritance;
// run with this for package : javac -d . Inher.java => java inheritance.Inher

// this keyword is a reference  

/*
// parent or super or base class
// This is an single inheritance code exaple: one parent => one child
class Base{
	int x;
	public void setX(int x){
	    System.out.println("I am in Parent and Setting X now :");
		this.x = x;
	}
	public int getX(){
		return x;
	}
	
	Base(){
	System.out.println("I am a Constructor of parent");
	}
	
}

// child or sub class it's parent class in Base. It has every thing of its parent class and it can use that things.
class Derived extends Base{
	int y;
	public void setY(int y){
	    System.out.println("I am in Child and Setting Y now :");
		this.y = y;
	}
	public int getY(){
		return y;
	}
	Derived(){
	System.out.println("I am a Constructor of child");
	}
}

public class Inher{
	public static void main(String[] args){
// parent class diye object create korechi and x e value diyechi
// Amra child class theke parent er properties gula access korte parbo kintu parent class theke child class er properties gula use korte parbo nah.
		Base b1 = new Base();
		b1.setX(45);
	    System.out.println(b1.getX());
// Amra child class diye object create kore parent class er property gulo use korte pari karon child class parent class er sob kichu extends koreche
// ekhne child class diye ekta object create korechi kintu amra ey object diyei parent er properties gula access korte parbo karon child class parent er sob kichu use korte parbe.
// object create korle default constructor auto call hoy. ekhne 1st e parent er default constructor call hobe karon inheritance e first e parent class run hoy tarpor child class run hoy
		Derived b2 = new Derived();
		b2.setX(50);
	    System.out.println(b2.getX());
		b2.setY(402);
	    System.out.println(b2.getY());
	}
}
*/

// extends keyword
/*
class Animal{
	String name;
	public void eat(){
    System.out.println("I can eat");
    }
}

class cat extends Animal{
	public void display(){
    System.out.println("My name is "+name);
	}
}

public class Inher{
	public static void main(String args[]){
		cat c1=new cat();
		c1.name="Meow";
        c1.display();
    }
}
*/		


// Parent class is Bank11 Class
// child classes - > SIBL - 4%, PBL- 5.3%
// same method
//This is an Hierarchical inheritance code exaple:  one parent => multiple child
/*
class Bank11{
    public float getROI(){
        return 0;
	}
}

class SIBL extends Bank11{
// The getROI() method in SIBL overrides the getROI() method of the parent class.
    public float getROI(){
       return 4;
	}
}
// Method overriding occurs when a child class provides its own implementation of a method that is already defined in its parent class. 
// The overridden method in the child class must have the same name, return type, and parameters as the method in the parent class.
// Method overriding is only possible in a class hierarchy (i.e., when there is inheritance).

class PBL extends Bank11{
    public float getROI(){
	   return 5.3f;
	}
}

public class Inher{
	public static void main(String args[]){
		SIBL s= new SIBL();
		PBL p=new PBL();
		System.out.println("Rate of interest: "+s.getROI()+" %");
		System.out.println("Rate of interest: "+p.getROI()+" %");
		
	}
}
*/

// super keyword is a reference variable to refer immediate parent class
// there are some exaples of how we can use super keyword:
// super cannot be used in the class body to directly access or assign parent variables.
// Always use super inside constructors or methods.

/*
public void someMethod() {
    super.someMethod(); // Call parent method
}

public ChildConstructor() {
    super(); // Calls parent constructor
}

public void setPower(double power) {
    super.power = power; // Access parent variable
}
*/


// This is an MultiLevel inheritance code exaple: one parent => one child => one grand child
/*
class parent{
	public int x;
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
	   return x;
	}
    parent(){
		System.out.println("I am a parent constructor");
	}
	
	parent(int a){
		System.out.println("I am a overload parent constructor with value of " + a);	
	}
}
class child extends parent{
    int y;
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
	
	child(){
// ekhne super keyword use kore parent er constructor ta call or use kora hocche
// child class er constructor theke super e value pathale parent er je constructor e parameter ache oita run korbe default ta run korbe nah
		//super(50);
		System.out.println("I am a child constructor");	
	}

    child(int x,int y){
		super(x);
		System.out.println("I am a overload child constructor with value of " + y);	
	}
}

class GrandChild extends child{
	GrandChild(){
		System.out.println("I am a GrandChild constructor");	
	}
	GrandChild(int x,int y,int z){
		super(x,y);
		System.out.println("I am a overload Grand child constructor with value of " + z);	
	}

}

public class Inher{
	public static void main(String[] args){
	
    	//parent p = new parent();

// child object create korle eta auto parent er default constructor call korbe then child jodi default constructor thake oita o run korbe 
		//child c1 = new child();
		//child c2 = new child(15,25);
		
// Niche line kono default constructor call hobe nah  		
		GrandChild g = new GrandChild(69,45,80);
	}
}
*/


/*
// Inheritance Example for manipulating name and age of 3 family members
class Grandfather {
    int age;
    String name;
    public Grandfather(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Grandfather's Name: " + this.name + ", Age: " + this.age);
    }
}
class Father extends Grandfather {

    public Father(int age, String name) {

        super(age + 30, name+" Grand Father");
        System.out.println("Father's Name: " + name + ", Age: " + age);
    }
}
class Son extends Father {

    public Son(int age, String name) {
        super(age + 25, name+"Father");
        System.out.println("Son's Name: " + name + ", Age: " + age);
    }
}
public class Inher {
    public static void main(String[] args) {
      Son son = new Son(20, "John Wicks ");
    }
}
*/


/*
// Parent class: Vehicle
class Vehicle {
    public int numberOfSeats;
    public double power; // Power of the vehicle

    // Method to calculate the number of passengers based on seats
    public int getNumberOfPassengers() {
        return numberOfSeats;
    }
}

// Child class: Car
class Car extends Vehicle {

	// Method to calculate speed for Car
    public double getSpeed() {
      return 0.2 * power; // 20% of car power
    }
}

// Child class: Bus
class Bus extends Vehicle {
	
	// Method to calculate speed for Bus
    public double getSpeed() {
        return 0.3 * power; // 30% of bus power
     }
}

// Main class
public class Inher {
    public static void main(String[] args) {
        // Creating Car object
        Car car = new Car();
        car.numberOfSeats = 4; // Number of seats in the car
        car.power = 150;       // Power of the car

        // Creating Bus object
        Bus bus = new Bus();
        bus.numberOfSeats = 40; // Number of seats in the bus
        bus.power = 300;        // Power of the bus

        
		// Calculating speed
       // double carSpeed = car.getSpeed();
        // double busSpeed = bus.getSpeed();
		
		
		
        double carSpeed = car.power;
        double busSpeed = bus.power;

        // Printing speeds
        System.out.println("Car Speed: " + carSpeed);
        System.out.println("Bus Speed: " + busSpeed);

        // Comparing and printing the faster vehicle
        if (carSpeed > busSpeed) {
            System.out.println("The Car is faster.");
        } else if (busSpeed > carSpeed) {
            System.out.println("The Bus is faster.");
        } else {
            System.out.println("Both vehicles have the same speed.");
        }

        // Printing the number of passengers
        System.out.println("Car can carry " + car.getNumberOfPassengers() + " passengers.");
        System.out.println("Bus can carry " + bus.getNumberOfPassengers() + " passengers.");
    }
}
	
*/

		