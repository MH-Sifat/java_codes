import java.io.*;
import java.util.*;//Scanner
import java.lang.*;
public class exception3{
	public static void main(String args[]){
		
		try{ 
		int a[]={1};
		a[42]=99;// out of bounds exception
			
		} catch(ArrayIndexOutOfBoundsException f){
		System.out.println("out of boundary");}
		try{// generating the exception
			System.out.println(" print");
			int d=0;
			int ab=42/d;// Exception throw
			//System.out.println("Not print");
			
		} catch(ArithmeticException e){// moving on to control flow
				System.out.println("Division by Zero");
					System.out.println("After printing");
}}}
