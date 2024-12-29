// Encapsulation & AccessModifier & Package

// Encapsulation is a primary attribute to OOP.
// Encapsulation is the mechanism that binds together code and the data it manipulates and keeps both safe from outside interference and misuse
// It is a process of packaging variablees and methods into a single unit

// How to do encapsulation => 
// Declare the variables as private.
// provide public setter and getter methods to modify and get the values

// Benefits => provides data hiding , Reusability , code can modify without breaking the code
// To create package we have to give this command in compailer ( javac -d . FileName.java ) then ( java PackageName.MainClassName ) 

package encapsulation;

// There are 4 type of access modifier in java ( private , default or package-private , protected , public )
// public => It can accessible from every where 
// default or package-private => It is visible only within its own package / class
// private => It can only be accessed by its own class not by outside or from another class
// protected => It can be accessed within its own package / class In addition, by a subclass of its class in another package.

class Person{
	private String name;
	private int age;
	public void setName(String n){
	this.name=n;
	}
	public void setAge(int a){
	this.age=a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class Encap{
	public static void main(String[] args){
		Person p = new Person();
		p.setName("Mehedi");
		p.setAge(20);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		
	}
}