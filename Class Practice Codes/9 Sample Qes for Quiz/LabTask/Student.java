/*
Problem 2: Input and Output
Write a Java program that takes user input for a student's name, age, and grade. After gathering the inputs, display them in a formatted output.
Instructions:
- Use `Scanner` for input.
- Print the student's details in a readable format.
Example:
Enter name: John Doe
Enter age: 20
Enter grade: A
Output:
Student Details:
Name: John Doe
Age: 20
Grade: A
*/

import java.util.Scanner;

public class Student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		String name = sc.nextLine();
		System.out.print("Enter Age:");
		int age = sc.nextInt();
		System.out.print("Enter Grade:");
		//char grade = sc.next().charAt(0);
		//String grade = sc.next();
		sc.nextLine();
		String grade = sc.nextLine();
		
		System.out.println("Student Details:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);

	}
}



/*
Problem 3: Methods
Create a class `Calculator` with methods for performing basic arithmetic operations:
- `add(int a, int b)`: returns the sum of two integers
- `subtract(int a, int b)`: returns the difference between two integers
- `multiply(int a, int b)`: returns the product of two integers
- `divide(int a, int b)`: returns the quotient of two integers
Test each method with example data and print the results. Make a static method 'Remainder(int a, int b): returns the remainder of two integars.
Invoke all the methods in your test class.
*/
/*
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a / b;
    }

    // Static method to get the remainder of two integers
    public static int remainder(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return a % b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing each method
        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int product = calculator.multiply(10, 5);
        int quotient = calculator.divide(10, 5);
        int remainder = Calculator.remainder(10, 5);

        // Printing results
        System.out.println("Addition (10 + 5): " + sum);
        System.out.println("Subtraction (10 - 5): " + difference);
        System.out.println("Multiplication (10 * 5): " + product);
        System.out.println("Division (10 / 5): " + quotient);
        System.out.println("Remainder (10 % 5): " + remainder);
    }
}
*/


/*
Problem 4: Constructors
Define a class `Employee` with the following attributes:
- `employee_Id`: an integer representing the employee ID
- `name`: a String representing the employee's name
- `salary`: a double representing the employee's salary
Add two constructors:
- A parameterized constructor to initialize `employee_Id`, `name`, and `salary`
- A default constructor that sets default values
Create an instance of `Employee` using each constructor and print the employee details.
*/

/*
class Employee {
    // Attributes of the Employee class
    int employee_Id;
    String name;
    double salary;

    // Parameterized constructor to initialize employee details
    public Employee(int employee_Id, String name, double salary) {
        this.employee_Id = employee_Id;
        this.name = name;
        this.salary = salary;
    }

    // Default constructor to set default values
    public Employee() {
        this.employee_Id = 0;
        this.name = "Unknown";
        this.salary = 0.0;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employee_Id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println(); // Blank line for readability
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee instance using the parameterized constructor
        Employee employee1 = new Employee(101, "Alice Johnson", 75000.00);
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        // Creating an Employee instance using the default constructor
        Employee employee2 = new Employee();
        System.out.println("Employee 2 Details:");
        employee2.displayDetails();
    }
}
*/