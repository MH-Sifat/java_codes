package inter;

// In java interface is a group of related methods with empty bodies.
// It is a collection of abstract methods.

// Interface is just like an Abstract class but it does not have any regular methods / non abstract methods in it.
// we can not create any object of an interface but we can take object refernence
// It is by default public.
// It may have attributes but this attributes are by default public,static and final all at the same time.
// It does not have any constructor.
// All the methods of an interface are by default public and abstract(abstract methods do not have any body).
// If we want to give body to any method of an interface we have to declare the method as static
// Interface Example : public interface MyInterface{...}
// a regular class , an abstract class and interface can inherit more then one interface.
// so in terms of interface multiple inheritance is possible.
// It can not have any instance variable.
// It can have only static and final variable.

/*

interface Bicycle{
	int a = 45;
	void applyBrake(int a);
	void speedUp(int b);
}

class AvatarCycle implements Bicycle{
	void blowHorn(){
		System.out.println("Pee Pee");
	}
	
	public void applyBrake(int a){
		System.out.println("Appling brake");
	}
	 
	public void speedUp(int b){
		System.out.println("Appling speedUp");
	}
	
}

public class Inter{
	public static void main(String[] args){
		AvatarCycle a1 = new AvatarCycle();
	    a1.applyBrake(1);
// we can not modify properties in interface as they are final
		// a1.a =666;    //error
		System.out.println(a1.a);
		
	}
}

*/

/*

interface Bicycle{
	int a = 45;
	void applyBrake(int a);
	void speedUp(int b);
}

interface HornBicycle{
	void blowHorn1();
	void blowHorn2();
}

// interface er method gula use korar time public use korte hobe na hoy error asbe
class AvatarCycle implements Bicycle,HornBicycle{
	void Horn(){
		System.out.println("Pee Pee");
	}
	
	public void applyBrake(int a){
		System.out.println("Appling brake");
	}
	 
	public void speedUp(int b){
		System.out.println("Appling speedUp");
	}
	
	public void blowHorn1(){
		System.out.println("POOO POOOO");
	}
	
	public void blowHorn2(){
		System.out.println("Dhoom Bachale Dhoom Bachale Dhoom Dhoom");
	}
}

public class Inter{
	public static void main(String[] args){
		AvatarCycle a1 = new AvatarCycle();
	    a1.applyBrake(1);
// we can not modify properties in interface as they are final
		// a1.a =666;    //error
		System.out.println(a1.a);
		a1.blowHorn1();
		a1.blowHorn2();
	}
}
*/

/*
// 1st interface
interface A{
	void msg();
}

// 2nd interface
interface B{
	void msg();
}

// D class 2ta interface ke implements korche D class ey 2 ta interface er sob kichu e use korte parbe. 
class D implements A,B{
	public void msg(){
		System.out.println("Hi");
	}
}

public class Inter{
	public static void main(String[] args){
		D anObj = new D();
		anObj.msg();
	}
}

*/

// Basic Interface Example
/*
// Declaring an Interface
interface Animal {
    // Abstract methods (implicitly public and abstract)
    void eat();
    void sleep();
}

// Implementing the Interface
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in the kennel.");
    }
}

public class Inter{
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Reference of type Animal (interface)
        myDog.eat();
        myDog.sleep();
    }
}
*/


// Interface with Constants
/*
interface Vehicle {
    // Constant
    int MAX_SPEED = 120; // public, static, final by default

    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting. Max speed: " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}

public class Inter {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
*/


// Multiple Interfaces Example
/*
interface Engine {
    void startEngine();
}

interface Horn {
    void soundHorn();
}

class Truck implements Engine, Horn {
    @Override
    public void startEngine() {
        System.out.println("Truck engine started.");
    }

    @Override
    public void soundHorn() {
        System.out.println("Truck horn sounds: Honk Honk!");
    }
}

public class Inter {
    public static void main(String[] args) {
        Truck myTruck = new Truck();
        myTruck.startEngine();
        myTruck.soundHorn();
    }
}

*/


// Static Methods in Interface 
/*
interface Utility {
    static void showMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class Inter {
    public static void main(String[] args) {
        // Call static method from the interface
        Utility.showMessage("Static methods in interfaces are useful!");
    }
}
*/


// Interface Inheritance
/*
interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Cat implements Pet {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void play() {
        System.out.println("Cat plays with a ball.");
    }
}

public class Inter {
    public static void main(String[] args) {
        Pet myCat = new Cat();
        myCat.eat();
        myCat.play();
    }
}
*/

/*

// All of the followings are possible:

// 1 ta interface arekta inheritance ke extends kortase.
interface IAlpha extends IBravo
// 1 ta interface 2 ta interface ke eksathe extends kortase.
interface IAlpha extends IBravo, ICharlie
// 1 ta class 1 ta interface ke implements kortase.
public class Bravo implements IBravo
// 1 ta class 2 ta interface ke eksathe implements kortase
public class Bravo implements IBravo, ICharlie
// 1 ta abstract class 1 ta interface ke implements kortase
public abstract class Alpha implements IAlpha
// 1 class eksathe 1 ta abstract class ke extends kortase and 2 ta interface ke implements kortase
public class Delta extends Alpha implements ICharlie, IDelta


// So, “class - abstract class - interface” any combination is possible here.

*/


// example codes

/*
// interface 
interface animal{
void eat();// abstract 
int speed=50;// final
}
//inheritance 
class dog implements animal{
	public void eat(){
		System.out.println("I can eat");
	}
	public int getSpeed(){
		return speed;
	}	
}

public class Inter{ 
    public static void main(String args[]){
	animal d=new dog();
	d.eat();
	dog a=new dog();
	a.eat();
	System.out.println(a.getSpeed());
	}
}
*/

/*

//multiple inheritance 
interface A{
void play();
}
interface B{
	void play2();
    void walk();
}
class C implements A,B{
	public void play(){
	System.out.println("I am from A");}
	public void play2(){
	System.out.println("I am from B");}
	public void walk(){
		System.out.println("I am from B");}
			
}
public class Inter{
	public static void main(String args[]){
		C o=new C();
		o.play();
		o.play2();
		o.walk();
		B t=new C();
		//t.play();
		t.play2();
	}
}
*/

//nested interface
interface outer{
	void m1();
	interface inner{
     void m2();
	}
}
class my implements outer{
	public void m1(){
      System.out.println("this is from outer");
	}
    public void m2(){
      System.out.println("this is from inner");
	}
}

class my2 implements outer.inner{
    public void m1(){
    System.out.println("this is from outer");
    }
    public void m2(){
    System.out.println("this is from inner");
    }
}

public class Inter{
	public static void main(String args[]){
	my r=new my();
	r.m1();
	r.m2();
	my2 s=new my2();
	s.m1();
    s.m2();
	}
}
	
