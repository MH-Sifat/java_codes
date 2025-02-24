// Associtaion 
package associtaion;

// Association in Java is a connection or relation between two separate classes that are set up through their objects.
// Association relationship indicates how objects know each other and how they are using each other’s functionality.
// It can be one-to-one , one-to-many , many-to-one , many-to-many.

/*
// 1. One-to-One Association
// A person can have only one passport. That is a one-to-one association.
// Definition: One object of a class is associated with one object of another class.
//illustrate one to one association using person and passport
class person{
	private String name;
	public void setName(String n){
	this.name=n;}
	public String getName(){
	return this.name;}
}
class passport{
	private String pass;
	public void setPass(String p){
	this.pass=p;}
	public String getPass(){
	return this.pass;}
	
}
public class Asso{
	public static void main(String args[]){
		person r = new person();
		r.setName("John");
		passport t = new passport();
		t.setPass("A456780F");
		// association of one to one
		System.out.print(r.getName()+" has a passport named "+t.getPass());	
	}
}
*/


/*
// 2. One-to-Many Association
// one to many association between customer class and card class. A customer can have many cards.
// Definition: One object of a class is associated with many objects of another class.

class card{
	private String Cno;// card no
	private String Cn;// card holder name
	private double balance;
	
	public void setCno(String c){
	 this.Cno=c;
	}
	public String getCno(){
	 return this.Cno;
	}
	
	public void setCn(String d){
	 this.Cn=d;
	}
	public String getCn(){
	 return this.Cn;
	}
	
	public void setBa(double b){
	 this.balance=b;
	}
	public double getBa(){
	 return this.balance;
	}	
	
}

class customer{
	private String phn;
	card c[]; // declaring
	
	public customer(){
	}
	public customer(String h, int size){
	  this.phn = h;
	  c = new card[size];
	}
	
	public void setPhn(String n){
	  this.phn = n;
	}
	
	public String getPhn(){
	  return this.phn;
	}
	
	public void show(){
		for(int i=0;i<c.length;i++){
			if(c[i]!=null){
			  System.out.println("Card Holder's Name: " + c[i].getCn());
		      System.out.println("Card No: " + c[i].getCno());
			  System.out.println("Card Balance: " + c[i].getBa());
		    }
		}
	}
	
	public void insert(card d){
		int flag = 0;
	    for(int i=0;i<c.length;i++){
			if(c[i] == null){
				c[i] = d;// insertion of all the informations
		        flag = 1;
				break;
			}
		}
		if(flag == 1){
				System.out.println("inserted");
		}
		else{
				System.out.println("Cannot insert");
		}
	}
}
public class Asso{
	public static void main(String args[]){
		customer c1 = new customer("+8802373248342", 2);
		card d1 = new card();
		d1.setCno("478392362389");
		d1.setCn("John Wick");
		d1.setBa(4576546.379);
		
		card d2=new card();
		d2.setCno("36838326782");
		d2.setCn("Jhon Wick");
		d2.setBa(2763787.35);
		
		c1.insert(d1);
		c1.insert(d2);
		c1.show();
	}
}
*/

/*
// 3. Many-to-One Association
// Multiple Employees work in one Department.

// Department Class
class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Department: " + name);
    }
}

// Employee Class
class Employee {
    String name;
    Department department; // Many-to-One Association

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        department.displayInfo(); // Access associated Department object
    }
}

// Main Class
public class Asso {
    public static void main(String[] args) {
        Department dept = new Department("Crime");
        Employee e1 = new Employee("Batman", dept);
        Employee e2 = new Employee("Superman", dept);

        e1.displayInfo();
        e2.displayInfo();
    }
}
*/


/*
// 4. Many-to-Many Association
// Definition: Many objects of one class are associated with many objects of another class.

// Students can enroll in multiple Courses, and a Course can have multiple Students.

// Course Class
class Course {
    String name;
    Student students[]; // Array of Students
    int studentCount;   // Keeps track of the number of students enrolled

    public Course(String name, int maxStudents) {
        this.name = name;
        this.students = new Student[maxStudents]; // Initialize array
// studentCount keeps track of how many students have enrolled in the course.

	    this.studentCount = 0;
    }

    // Method to add a student to the course
    public void enrollStudent(Student student) {
    // Check if the course has space for more students
    // Before adding a new student or course, the method checks if there's space left using  => if (currentCount < maxCapacity).
    if (studentCount < students.length) {
        students[studentCount] = student; // Add the student to the array
        studentCount++;                   // Increase the count of enrolled students
    } else {
        System.out.println("Course " + name + " is full!"); // Print a message if full
    }
}

    public void displayInfo() {
        System.out.println("Course: " + name);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i].name);
        }
    }
}

// Student Class
class Student {
    String name;
    Course[] courses; // Array of Courses
    int courseCount;  // Keeps track of the number of courses enrolled

    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses]; // Initialize array
// courseCount keeps track of how many courses the student has enrolled in.
		this.courseCount = 0;
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
    // Check if the student can enroll in more courses
    if (courseCount < courses.length) {
        courses[courseCount] = course;    // Add the course to the array
        courseCount++;                    // Increase the count of enrolled courses
        course.enrollStudent(this);       // Also enroll the student in the course
    } else {
        System.out.println("Student " + name + " can't enroll in more courses!"); // Print a message if limit reached
    }
}

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].name);
        }
    }
}

// Main Class
public class Asso {
    public static void main(String[] args) {
        // Create Courses
        Course java = new Course("Java", 2);   // Max 2 students
        Course python = new Course("Python", 2); // Max 2 students

        // Create Students
        Student s1 = new Student("Alice", 2);   // Max 2 courses
        Student s2 = new Student("Bob", 2);     // Max 2 courses

        // Enroll Students in Courses
        s1.enrollCourse(java);
        s1.enrollCourse(python);

        s2.enrollCourse(java);
        s2.enrollCourse(python);
			

        // Display Student Info
        s1.displayInfo();
        s2.displayInfo();

        // Display Course Info
        java.displayInfo();
        python.displayInfo();
    }
}
*/






// Ma'am egula porai nai it's from youtube

// Types of Association: 
// Aggregation: A weaker relationship where objects can exist independently ( Library and Books ).
// Composition: A stronger relationship where the lifetime of one object depends on the other ( House and Rooms ).
// Direction:
// One-way (Unidirectional): One class knows about the other.
// Two-way (Bidirectional): Both classes know about each other.


/*

// this is one-way associtaion or unidirectional
// Person "has-a" Address
class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getFullAddress() {
        return city + ", " + state;
    }
}

class Person {
    String name;
    Address address; // Association with Address class

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}

public class Asso{
    public static void main(String[] args) {
        Address address = new Address("New York", "NY");
        Person person = new Person("Alice", address); // Associate Address with Person

        person.displayInfo();
    }
}
*/


// this is Two-way associtaion or Bidirectional

/*
class Library {
    String name;
    Book book; // Library has-a Book

    public Library(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void showLibraryInfo() {
        System.out.println("Library: " + name);
        System.out.println("Book: " + book.title);
    }
}

class Book {
    String title;
    Library library; // Book has-a Library (Bidirectional)

    public Book(String title) {
        this.title = title;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void showBookInfo() {
        System.out.println("Book: " + title);
        System.out.println("Available at Library: " + library.name);
    }
}

public class Asso{
    public static void main(String[] args) {
        Library library = new Library("City Library");
        Book book = new Book("Java Programming");

        // Establishing bidirectional association
        library.setBook(book);
        book.setLibrary(library);
		
        // Displaying information
        library.showLibraryInfo();
        System.out.println();
        book.showBookInfo();
    }
}
*/

// Association is all about connecting classes so they can interact.
// It doesn't imply ownership; the connected objects can exist independently.
// Unidirectional: A Person has an Address.
// Bidirectional: A Library has a Book, and a Book belongs to a Library.



// Aggregation is a weak relationship where one class contains a reference to another class, but the lifetime
// of the objects is independent. If the container object is destroyed, the contained objects can still exist
//Example: A Department contains Students, but a Student can exist without the Department.

/*
import java.util.*;

// Student Class
class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name + ", Roll Number: " + rollNumber);
    }
}

// Department Class
class Department {
    String name;
    List<Student> students; // Aggregation: Department "has-a" Students

    public Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + name);
        System.out.println("Students in this Department:");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}

// Main Class
public class Asso{
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);

        // Create Department with Students
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        Department department = new Department("Computer Science", studentList);

        // Display Department Info
        department.displayDepartmentInfo();
    }
}
*/


// Composition is a strong relationship where one class contains another class, and the contained object's 
// lifetime depends on the container.If the container object is destroyed, the contained objects are also destroyed.
// Example: A Car contains Engine. If the Car is destroyed, the Engine cannot exist independently.
/*
// Engine Class
class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void displayEngineInfo() {
        System.out.println("Engine Type: " + type);
    }
}

// Car Class
class Car {
    String model;
    Engine engine; // Composition: Car "has-a" Engine

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine object created within Car
    }

    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        engine.displayEngineInfo(); // Engine is part of Car
    }
}

// Main Class
public class Asso{
    public static void main(String[] args) {
        // Create Car with Engine
        Car car = new Car("Tesla Model S", "Electric");

        // Display Car Info
        car.displayCarInfo();
    }
}
*/