// Polymorphism
// It means Different Forms of the Same Thing.
// In other words ‘One Name, Different Forms’.
// In Programming the polymorphic behavior might be with methods, Constructors and Objects.
// There are two type of polymorphism => 1.Compile Time / static , 2.Run Time / dynamic polymorphism
// 1. Compile Time / static polymorphism are => method overloading , constructor overloading
// 2. Run Time / dynamic polymorphism are => method overriding

package polymorphism;

/*
// There are some conditions of method overloading. If and only If these conditions are met, 
// we can say that there are method overloading among those methods. These conditions are:
// 1. Methods MUST be in same class.
// 2. Method Name MUST be same.
// 3. Method Parameter MUST be different.
// 4. Method Return Type may or may not be same.

// It's an example of method overloading
class Overload{
// ekhne sob method er name same kintu parameter different
	void add(){
		System.out.println("Nothing!");
	}
	void add(int a){
		System.out.println(a);
	}
	void add(int a,int b){
		System.out.println(a + " " + b);
	}
	double add(double a,double b){		
		return a+b;
	}
}
public class Poly{
	public static void main(String[] args){
		Overload o = new Overload();
		o.add(5,7);
		o.add();
		o.add(4);
		System.out.println(o.add(3.24,6.24));
	}
}
*/


/*
// Method overriding happens among methods. There are some conditions of method overriding.
// If and only If these conditions are met, we can say that there are method overriding among those methods. These conditions are:
// 1. Methods MUST be in two different classes.
// 2. There MUST be inheritance between the two classes.
// 3. Method Name MUST be same.
// 4. Method Parameter MUST be same.
// 5. Method Return Type MUST be same.

class Person{
	String name;
	int age;
	// overridden method
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class teacher extends Person{
	String profession;
	// override method
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Profession: " + profession);
	}
}
		
	
public class Poly{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "Jack";
		p.age = 22;
		p.display();
		System.out.println();
		teacher t = new teacher();
	    t.name = "Mack";
	    t.age = 82;
		t.profession = "teacher";
		t.display();
		System.out.println();
		
// ekhne super class er refernce diye amra sub class er ekta object create korechi
// A Person reference is used to hold a teacher object (Person t2 = new teacher();).
		Person t2 = new teacher();
	// t2 holo teacher class er object
	    t2.name = "Nizam";
	    t2.age = 42;
// Since t2 is declared as a Person reference, it cannot access attributes specific to the teacher class.
		t2.profession = "Teacher";
	    t2.display();
// At runtime, the display() method of the teacher class is executed because of the overridden method. This is runtime polymorphism.
		
	}
}

// In the code, t2 is an object of the Teacher class, but it is referenced using a Person type.
// The new Teacher() part creates an object of the Teacher class.
// This object has all the properties (name, age, profession) and methods of the Teacher class.
// t2 is declared as a reference of type Person.
// A Person reference can only access attributes and methods defined in the Person class (and overridden methods in the subclass).

*/


/*

// Constructor Overloading
// There are some conditions of constructor overloading. If and only If these conditions are met, 
// we can say that there is constructor overloading in that class. These conditions are:
// 1. Constructors MUST be of same class.
// 2. Constructor Parameter MUST be different.
// Example of constructor overloading
class Cons{
	Cons(){
		System.out.println("Default");
	}
	
	Cons(int a){
		System.out.println("a: " + a);
	}
	
	Cons(int a, int b){
		System.out.print("a: " + a);
		System.out.print(" ,b: " + b);
	}
}

public class Poly{
	public static void main(String[] args){
		Cons a = new Cons();
		Cons b = new Cons(5);
		Cons c = new Cons(4,6);
		
	}
}
*/

/*

// Polymorphic Behaviour of Objects
// className objectName = newKeywordForMemoryAllocaton  constructorCallForObjectCreation
// Box b = new Box();
// Box b => ( Object Reference Declaration )
// b = new Box(); => ( Object Creation )
// Box b = new Box(); => ( Object Creation )
// new Box(); => ( Anonymous Object )
// Anonymous Object is an object without any name
// So, Anonymous object can be used if and only if the object is required for just one time.


// According to the Polymorphic Behavior of Objects, An Object Reference of Parent Class can hold an Object of a Child Class.

class Person{
}

class Employe extends Person{
}

class Faculty extends Employe{
}

class Student extends Person{
}

public class Poly{
	public static void main(String[] args){
// we can write like this
		Person p = new Person( );
        Employee e = new Employee( );
        Faculty f = new Faculty( );
        Student s = new Student( );

// According to polymorphic behavior of objects we can also write like this
        Person p1 = new Employee( );
        Person p2 = new Faculty( );
        Person p3 = new Student( );
        Employee e1 = new Faculty( );
// But we can not write the following statements:
        Employee e2 = new Student( );
        Student s2 = new Faculty( );
	}
}
*/	

/*
// Parent class: Animal
class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class: Dog
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class: Cat
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        // Parent class reference holding parent class object
        Animal animal = new Animal();
        animal.sound(); // Output: Animals make sounds

        // Parent class reference holding child class object (polymorphic behavior)
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks

        Animal cat = new Cat();
        cat.sound(); // Output: Cat meows

        // Example of runtime decision
        Animal randomAnimal;

        // Assigning Dog to the reference dynamically
        randomAnimal = new Dog();
        randomAnimal.sound(); // Output: Dog barks

        // Assigning Cat to the reference dynamically
        randomAnimal = new Cat();
        randomAnimal.sound(); // Output: Cat meows
    }
}
*/

/
	
// Parent Class: Account
class Account {
    private String accountNo;
    private double balance;

    // Default Constructor
    public Account() {}

    // Parameterized Constructor
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Setters
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getters
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }
}

// Child Class: SavingsAccount (Inherits from Account)
class SavingsAccount extends Account {
    private double interestRate;

    // Default Constructor
    public SavingsAccount() {}

    // Parameterized Constructor
    public SavingsAccount(String accountNo, double balance, double interestRate) {
        super(accountNo, balance); // Calling parent class constructor
        this.interestRate = interestRate;
    }

    // Setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter
    public double getInterestRate() {
        return interestRate;
    }
}

// Child Class: FixedAccount (Inherits from Account)
class FixedAccount extends Account {
    private int tenureYear;

    // Default Constructor
    public FixedAccount() {}

    // Parameterized Constructor
    public FixedAccount(String accountNo, double balance, int tenureYear) {
        super(accountNo, balance); // Calling parent class constructor
        this.tenureYear = tenureYear;
    }

    // Setter
    public void setTenureYear(int tenureYear) {
        this.tenureYear = tenureYear;
    }

    // Getter
    public int getTenureYear() {
        return tenureYear;
    }
}

// Class: Customer (Association with SavingsAccount and FixedAccount)
class Customer {
    private int nid;
    private String name;
    private SavingsAccount savingsAccount; // Association
    private FixedAccount fixedAccount;     // Association

    // Default Constructor
    public Customer() {}

    // Parameterized Constructor
    public Customer(int nid, String name, SavingsAccount savingsAccount, FixedAccount fixedAccount) {
        this.nid = nid;
        this.name = name;
        this.savingsAccount = savingsAccount;
        this.fixedAccount = fixedAccount;
    }

    // Setters
    public void setNid(int nid) {
        this.nid = nid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void setFixedAccount(FixedAccount fixedAccount) {
        this.fixedAccount = fixedAccount;
    }

    // Getters
    public int getNid() {
        return nid;
    }

    public String getName() {
        return name;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public FixedAccount getFixedAccount() {
        return fixedAccount;
    }
}

// Main Class
public class Poly{
    public static void main(String[] args) {
        // Creating SavingsAccount and FixedAccount objects
        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 2.5);
        FixedAccount fa = new FixedAccount("FA456", 10000.0, 5);

        // Creating Customer object
        Customer customer = new Customer(101, "John Doe", sa, fa);

        // Displaying Customer Details
        System.out.println("Customer Details:");
        System.out.println("NID: " + customer.getNid());
        System.out.println("Name: " + customer.getName());

        // Displaying Savings Account Details
        System.out.println("\nSavings Account Details:");
        System.out.println("Account No: " + sa.getAccountNo());
        System.out.println("Balance: " + sa.getBalance());
        System.out.println("Interest Rate: " + sa.getInterestRate());

        // Displaying Fixed Account Details
        System.out.println("\nFixed Account Details:");
        System.out.println("Account No: " + customer.getFixedAccount().getAccountNo());
        System.out.println("Balance: " + customer.getFixedAccount().getBalance());
        System.out.println("Tenure Year: " + customer.getFixedAccount().getTenureYear());
    }
}

*/


