import java.io.*;
import java.util.*;//Scanner
import java.lang.*;
public class exceptiondemo{
	private int x,y;
	private String s;
	public static void main(String args[]){
		// input mismatch exceptiondemo
		Scanner sc=new Scanner(System.in);
		exceptiondemo ed=new exceptiondemo();
		ed.x=sc.nextInt();
		ed.y=sc.nextInt();
	System.out.println(ed.x+ed.y);
	// Null pointer exceptiondemo
	//System.out.println(ed.s.length());
	//System.out.println(ed.s.isEmpty());
	// array index out of bounds exceptiondemo
	int a[]=new int[]{10,20,30,40};
	for(int i=0;i<=3;i++){
		System.out.println(a[i]);
	}
	// number format exceptiondemo
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a string: ");
	ed.s=scn.next();// next is for character
	// converting or type casting
	int j=Integer.parseInt(ed.s); 	
	System.out.println(j);
	
	
}}
		
		
		
