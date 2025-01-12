package finalPack;

// The keyword final can be used in 3 places:
// Attributes, Methods, Classes

// Final attributes are declared using the keyword final
// Example: private final int x;
// It is like constant variables.
// It can be initialized only once;
// Etar value ekbar initialized korle ta ar change kora jabe na.
// final attribute 2 vabe initialize kora jai
// 1. During Declaration , 2. Inside Constructor
// eta sudhu ekbar e initialize kora jabe tai amra 2 tar jekono ekta approache e use korte parbo.


class FinalExample {
    // Direct Initialization
    private final String a = "Directly Initialized Final Value";

    // Initialization in the Constructor
     final int b;
	 
	// static blank final variable
	static final int c;
	// eta initialize korte hole static block lagbe constructor or set method diye hobe na.
	
	static{
		c = 555;
	}

    // Constructor for initializing 
    public FinalExample(int value) {
        this.b = value; // Once initialized here, it cannot be changed
    }

    // Method to display the values
    public void displayFinalValues() {
        System.out.println("Direct Final: " + a);
        System.out.println("Constructor Final: " + b);
    }
}

public class Final {
    public static void main(String[] args) {
        // Create an instance of FinalExample
        FinalExample example1 = new FinalExample(42);
        FinalExample example2 = new FinalExample(99);

        // Display final values
        example1.displayFinalValues();
        example2.displayFinalValues();

        System.out.println(example2.c);

        // Uncommenting the following line will cause a compilation error
        // example1.b = 50; // Error: cannot assign a value to final variable
    }
}



// Final Method Example: public final void show(){...}
// It's as like regular methods but it can not be overridden
// Difference between an abstract and final method is that an abstract method must be overridden and a final method can never be overridden 
// Final method Final class er bhitore e thakte hobe eta necessary na eta regular class / abstract class er bhitore o thakte pare
/*
class Parent {
    // Final method: cannot be overridden in child classes
    public final void showMessage() {
        System.out.println("This is a final method in the Parent class.");
    }

    // Regular method: can be overridden
    public void display() {
        System.out.println("This is a regular method in the Parent class.");
    }
}

class Child extends Parent {
    // This method tries to override the final method (will cause a compilation error)
    
   // @Override
   // public void showMessage() {
   //     System.out.println("This is an attempt to override a final method.");
   // }
    

    // Override the regular method
    @Override
    public void display() {
        System.out.println("This is an overridden method in the Child class.");
    }
}

public class Final{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.showMessage(); // Calls the final method in Parent
        parent.display();     // Calls the regular method in Parent

        System.out.println();

        Child child = new Child();
        child.showMessage(); // Calls the inherited final method from Parent
        child.display();     // Calls the overridden method in Child
    }
}
*/

// Final Class Example: public final class MyClass{...}
// Final class regular class er moto e kintu eta inherited kora jai nah.
// The difference between an abstract class and a final class is that, an Abstract class MUST be inherited and a Final class can NEVER be inherited.
// Final class e final method thakte hobe eta necessary nah.
// Final class e kono abstract method thakte parbe nah.

/*
// Final class: cannot be extended
final class FinalClass {
    private String message;

    // Constructor
    public FinalClass(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }

    // A regular method (implicitly final because it's in a final class)
    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}

// Attempt to inherit the final class (uncommenting this will cause a compilation error)

// class ChildClass extends FinalClass {
     // Cannot extend a final class
// }


public class Final {
    public static void main(String[] args) {
        // Create an object of the final class
        FinalClass finalObject = new FinalClass("Hello, this is a final class!");

        // Access methods of the final class
        System.out.println(finalObject.getMessage());
        finalObject.displayMessage();
    }
}
*/

// object creation regular class and final class e possible kintu abstract class e possible na.
// Inheritance regular and abstract class e possible kintu final class e possible nah.
// Having regular method sob gula tei possible.
// Having abstract method sudhu abstract class e possible regular and final class e possible nah.
// Having Final Method sob gula tei possible.
// Body regular and final method er thake abstract method er thake na.
// Overrding regular and abstract method er possible final method er possible na.

