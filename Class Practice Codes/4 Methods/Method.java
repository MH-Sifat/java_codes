// this is how to write methods

/*
public class Method{  
   public static void main(String [] args){  
   // creating an object of class 
      Method obj = new Method();    
	  // passing values to the methods
      System.out.println("The sum is: "+obj.add(12, 13)); 
      System.out.println("The division is: "+obj.div(120, 13)); 
      System.out.println("The remainder is: "+obj.rem(1200, 12));
    }  
	
    int s; //local variable
    float d;
    float r; 

	// methods for +,/,%
	// method return values
    public int add(int a, int b){  
       s = a+b;  
       return s;  
	}
    public float div(int a, int b){  
       d = a/b; 
       return d;
    }
     public float rem(int a, int b){  
       r=a%b; 
       return r;
    }
	
}
*/


/*
//Q:
//create an instance method to return the value of quotient 
//and remainder .
//add a condition if denominator is 0 -> division is not possible.

//Ans:
public class Method {
    
    // Method to calculate division and remainder
    public void divisionAndRemainder(int numerator, int denominator) {
        // Check if the denominator is zero
        if (denominator == 0) {
            System.out.println("Division is not possible (denominator is 0).");
        } 
		else {
            // Perform division and calculate remainder
            int quotient = numerator / denominator;
            int remainder = numerator % denominator;
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }

    // Main method to test the divisionAndRemainder method
    public static void main(String[] args) {
        Method mathOps = new Method();
        
        // Test cases
        mathOps.divisionAndRemainder(10, 2);  // Output: Quotient: 5, Remainder: 0
        mathOps.divisionAndRemainder(10, 0);  // Output: Division is not possible (denominator is 0).
        mathOps.divisionAndRemainder(10, 3);  // Output: Quotient: 3, Remainder: 1
    }
}
*/



/*
//method overloading 
// syntax : use the same name of method multiple times inside a class.
public class Method{
	public static int area(int side){
		return side*side;
	}
	public static int area(int side1, int side2){
		return side1*side2;
	}
	public static void main(String args[]){
		System.out.println("Area 1 is:" +area(4));
		System.out.println("Area 1 is:" +area(5,7));
		
		
    }
}
*/



// static method
//static methods: they can be called or invoked directly from classname

class Method{
	public int add(int a, int b){
	return a+b;}
	
	public static int multiply(int a, int b){
	return a*b;}
	
	public static void main(String args[]){
		
	int result;
		
	Method t1 = new Method();
	result = t1.add(23,4);
	System.out.println(result);
	int result2 = Method.multiply(5,4);
	System.out.println(result2);
	
}
}
