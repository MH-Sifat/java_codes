import java.util.Scanner;

/*
class Box{
double length,heigth,depth;
}



public class MultipleClasses{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		Box obj = new Box();
		obj.length = x.nextDouble();
		obj.heigth = x.nextDouble();
		obj.depth = x.nextDouble();
		double vol = obj.length * obj.heigth * obj.depth;
		System.out.println(obj.length);
		System.out.println(obj.heigth);
		System.out.println(obj.depth);
		System.out.println(vol);

	}
}

*/
// function calling from other class
/*
class FunctionCall{
	String name = "Sifat";
	byte age = 22;
    double salary = 566664.22;
	void display(){
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
		System.out.println("Salary: " + salary);
	}
}
	
public class MultipleClasses{
	String name = "Sifat";
	byte age = 22;
    double salary = 566664.22;
	void display(){
		System.out.println("Name: " + name);
		System.out.println("age: " + age);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args){
		FunctionCall show = new FunctionCall();
		show.display();
	}
}
*/

/*

class Box2{
	String name,gender;
	int age;
	void displayIfo(){
		System.out.println("Name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
	}

}

public class MultipleClasses{
	public static void main(String[] args){
		Scanner give = new Scanner(System.in);
		Box2 info = new Box2();
		info.name = give.nextLine();
		info.gender = give.nextLine();
		info.age = give.nextInt();
		info.displayIfo();
	}
}
*/