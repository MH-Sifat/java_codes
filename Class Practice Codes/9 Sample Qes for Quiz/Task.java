/* 
4. Create a main class in java where you will enter a char for choosing greeting style.
Sample input: 
Enter your choice: a
Sample output:
Assalam Walaikum
Sample input:
Enter your choice: b
Sample output:
Nomoshkar 
*/
import java.util.Scanner;

public class Task{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		char x = sc.next().charAt(0); // char input nite eta use hoy
		if(x == 'a'){
			System.out.println("Assalam Walaikum");
		}
		else if(x == 'b'){
			System.out.println("Nomoshkar");
		}
	}
}