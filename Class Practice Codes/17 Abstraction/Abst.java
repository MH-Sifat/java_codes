// Abstraction
// It means ‘Hiding the Details’.
// It is a process where implementation is hidden and its functionality is shown to user.
// We can hide the details of a class or a method. Abstract Class , Abstract  Method
// In programming, this concept of hiding the details is known as abstraction.

// Abstract class :
// An abstract class is a class that we can not instantiate (can not create object).
// However, We can use Object Reference of an abstract class.
// The keyword abstract is used to denote abstract class.
// example: public abstract class MyClass{. . .}
// An abstract class may have attributes.
// An abstract class may have constructors but we can not call the constructors using the new keyword.
// However, super( ), super(…), this( ), this(….) can be used to call constructors of an abstract class.
// An abstract class may have regular methods.
// An abstract class may have abstract methods.
// It is not necessary that an abstract class must have an abstract method.
// So,it possible to have both regular methods and abstract methods in any number combination in a abstract class.
// An abstract class MUST have a child class.
// This child class may be a regular class or may be another abstract class.
// If the child class is another abstract class, that child class will have another child class which has to be a regular class.
// So, at least one regular class will inherit the abstract class/classes in one way or the other.

// Abstract Method :
// An abstract method is like a regular method but it does not have any body.
// An abstract method is denoted with the keyword abstract.
// Eample: 	public abstract void show( );
// As, an abstract method does not have any body, it does not have the {…} . Instead, it has a  ;  .
// An abstract method must be inside an abstract class.
// As, an abstract class must have a child class, that child class should override/implement (give body to) all the abstract methods (if any) of that abstract class.
// If it does not override/implement one/any of the abstract methods, the child class will have to be declared as another abstract class.


package abstraction;

/*
// abstract class 
abstract class MobileUser{
	// abstract method
	abstract void sendMsg();
}

class Jhon extends MobileUser{
	void sendMsg(){
		System.out.println("Hello, BabaYaga!");
	}
}

class BabaYaga extends MobileUser{
	void sendMsg(){
		System.out.println("Hello, Jhon!!!");
	}
}

public class Abst{
	public static void main(String[] args){
// parent class ekta abstract class tai eta diye object create kora jabe nah kintu eta referance e use kora jabe
		MobileUser x;
// parent er referance use kore 2 ta child class er object create korechi ekhne. 
		x = new Jhon();
		x.sendMsg();
		
		x = new BabaYaga();
		x.sendMsg();
	
	}
}
*/

// example

/*
abstract class Parent{
	public Parent(){
		System.out.println("Perent class Constructor of Base");
	}
	public void sayHi(){
		System.out.println("Hiiii");
	}
	
	abstract public void greet();
	abstract public void greet_2();

}

class Child extends Parent{
	public void greet(){
		System.out.println("Good Morning");
	}
	public void greet_2(){
		System.out.println("Good Afternoon");
	}
}

abstract class Child_2 extends Parent{
	public void th(){
		System.out.println("I'm good");
	}
}

// abstract class emon ekta class jetar help e onno class create hobe
public class Abst{
	public static void main(String[] args){
		Parent p1 = new Parent(); // error karon eta abstract class
		Parent p2 = new Child(); // correct 
		Child c1 = new Child();  // correct
		Child_2 c2 = new Child_2();  // error karon eta abstract class
	}
}
*/

// example

/*
abstract class Vehicle {
    abstract void startEngine(); // Abstract method
    void fuelUp() { // Non-abstract method
        System.out.println("Filling fuel.");
    }
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}

class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine starts with a kick.");
    }
}

public class Abst {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.startEngine(); // Output: Car engine starts with a key.
        car.fuelUp();      // Output: Filling fuel.

        Vehicle bike = new Bike();
        bike.startEngine(); // Output: Bike engine starts with a kick.
        bike.fuelUp();      // Output: Filling fuel.
    }
}
*/


/*
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
*/

/*

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

public class Abst{
	public static void main(String args[]){
		bank1 s=new SonaliBank();
		s.getROI();
		s.show();
	}
}
	
*/


 
// Abstract class Shape
abstract class Shape {
    // Protected fields to allow child classes access
    protected double dim1, dim2;

    // Default constructor
    public Shape() {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    // Parameterized constructor
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Getter for dim1
    public double getDim1() {
        return dim1;
    }

    // Getter for dim2
    public double getDim2() {
        return dim2;
    }

    // Abstract method to be implemented by child classes
    public abstract void displayArea();
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    // Default constructor
    public Rectangle() {
        super();
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        super(length, width); // Using super to call parent constructor
    }

    // Setter for dimensions
    public void setDimensions(double length, double width) {
        this.dim1 = length;
        this.dim2 = width;
    }

    // Getter for length (dim1) and width (dim2) are inherited from Shape

    // Overriding displayArea
    @Override
    public void displayArea() {
        double area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}

// Triangle class inheriting Shape
class Triangle extends Shape {
    // Default constructor
    public Triangle() {
        super();
    }

    // Parameterized constructor
    public Triangle(double base, double height) {
        super(base, height); // Using super to call parent constructor
    }

    // Setter for dimensions
    public void setDimensions(double base, double height) {
        this.dim1 = base;
        this.dim2 = height;
    }

    // Overriding displayArea
    @Override
    public void displayArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}

// Circle class inheriting Shape
class Circle extends Shape {
    // Default constructor
    public Circle() {
        super();
    }

    // Parameterized constructor
    public Circle(double radius) {
        super(radius, 0); // Using super; dim2 is unused
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.dim1 = radius;
    }

    // Getter for radius (dim1) is inherited from Shape

    // Overriding displayArea
    @Override
    public void displayArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}

// Main class to demonstrate polymorphism and usage
public class Abst{
    public static void main(String[] args) {
        // Creating instances of each shape using polymorphism
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 6);
        Shape circle = new Circle(7);

        // Displaying areas
        rectangle.displayArea();
        triangle.displayArea();
        circle.displayArea();
    }
}

