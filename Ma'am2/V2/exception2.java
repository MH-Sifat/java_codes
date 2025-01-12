import java.io.*;
import java.util.*;//Scanner
import java.lang.*;
public class exception2{
	public static void main(String args[]){
		int d,a;
		try{// generating the exception
			System.out.println(" print");
			d=0;
			a=42/d;// Exception throw
			//System.out.println("Not print");
			
		} catch(ArithmeticException e){// moving on to control flow
				System.out.println("Division by Zero");
					System.out.println("After printing");
}}}
