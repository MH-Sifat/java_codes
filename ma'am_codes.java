// wraper
// static block
// String operators
// array 1D and 2D
// loop 
// encapsulation
// inheritance



	



// Array

// making an array
import java.lang.*;
class Average{
	public static void main(String args[]){
		double num[]={10.1, 12.4, 16.8, 10};
		double result=0.0;
		for(int i=0;i<4;i++){
		result=result+num[i];}
System.out.println(result);}}

// 2
class Testarray{  
public static void main(String args[]){  
int a[]=new int[5];//declaration and instantiation  
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]); 
// alternative way
// for(int i:arr)  
//System.out.println(i);   
}}  


// array loop
import java.util.Scanner;
class input3{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		double number[]=new double[5];
		//type arr_name[]=new type[size]
		for(int i=0;i<number.length;i++){
			System.out.println("enter your elements");
number[i]=in.nextDouble();}
for(int i=0;i<number.length;i++){
			System.out.println(" "+number[i]+" ");
}


}}

//encapsulation task
//default(Package -private) member class
package encapsulation;
public class person6{
	private String name;
	private int age;
	public void setName(String n){
	this.name=n;}
	public void setAge(int a){
	this.age=a;}
	public String getName(){ return name;}
	public int getAge(){return age;}
	
}

// package and array

package B; 
class Balance{
String name;
double ba;
public Balance(String n, double b){
	this.name=n;
this.ba=b;}
public void display(){
	if(ba<0.0){
System.out.println(name+" "+ba);}}}
public class Account1{
	public static void main(String args[]){
		Balance current[]=new Balance[4];// memory space 
		current[0]=new Balance("Anika",5000.35);
		current[1]=new Balance("Samiha",3000.35);
		current[2]=new Balance("Kishore",2000.35);
		current[3]=new Balance("Rahim",-2400.35);
		for(int i=0;i<4;i++){
		current[i].display();}
		// for(class/type var: array_name)
			//{array_name.method()}
}}
		
		
		
		
// String operator

// charAt 
import java.lang.*;
import java.util.Scanner;
class ch{
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	char c=input.next().charAt(0);
	//charAT(0)
	if(c>='a' && c<='z')
	{System.out.println("User entered a small letter");}
	else if(c>='A' && c<='Z')
	{System.out.println("User entered a capital letter");}
	else
	{System.out.println("Not letter");}
	//input.close();

}}
	
// compareTo 
public class com {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";

        System.out.println(str1.compareTo(str2)); 
		// Negative, because "apple" comes before "banana"
        System.out.println(str1.compareTo(str3)); 
		// Zero, because both strings are equal
        System.out.println(str2.compareTo(str1)); 
		// Positive, because "banana" comes after "apple"
    }
}

// 
import java.lang.*;
class comp{
public static void main(String args[]){
	String s1="America";
	String s2="Banana";
	String s3=s1;
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
System.out.println(s2.compareTo(s1));}}



// create a string object , store its indexes as integer and perform type 
//casting  to convert it into character within a class
import java.lang.*;
public class Ex{
public static void main(String args[]){
	String s6=new String("Java");
	String s5="Java Lab";
	int index1= s5.charAt(0);
	int index2= s6.charAt(2);// selecting indexes 
System.out.println("The character is :" +(char)index1);// type casting
System.out.println("The character is :" +(char)index2);
// trim(), indexOf() , equals(), compareTo(), toUpperCase(), to LowerCase()

}}



// indexOf
import java.lang.*;
//indexOf()
class index{
public static void main(String args[]){
	String r= new String("Hello, World!");
	//index of a character
	System.out.println(r.indexOf('o'));
	
	//index of character from a specific index
	System.out.println(r.indexOf('l',4));
	//index of substring return
	System.out.println(r.indexOf("ld"));
	String str="Raima Adhikary";
	System.out.println(str.indexOf('h'));
	
	
}}
	



// string operation 
import java.lang.*;// all classes import
class string12{
	public static void main(String args[]){
		String s0=new String();// empty string
		String s11= new String("Java Class");// string objects
		int age=25;
		String msg="she is "+ age+" years old";
		String s12=" PRogramming";// implicit // string literal
System.out.println(s11);
System.out.println(s12);
System.out.println(msg);
// isEmpty() method checks whether you have entered any string or not
System.out.println(s0.isEmpty());
System.out.println(s11.isEmpty());
System.out.println(s12.isEmpty());
// length() methodSystem.out.println(s0.isEmpty());
System.out.println(s11.length());
System.out.println(s12.length());
//charAt()
System.out.println(s11.charAt(3));
System.out.println(msg.charAt(3));

}}



//string operations
import java.lang.*;
class string20{
	public static void main(String args[]){
		String s0=new String();//empty string object
		String s11=new String("Hello World");// string object
		String s14=new String("Hello World");
String s12="Hi";// string literal
String s13=s12;//string reference
//equals()

if(s11.equals(s14)){
System.out.println("yes");}
else{System.out.println("no");}

//compareTo()
String s21="America";// 7 characters
String s22="banana";//6 characters
String s23=s22;
System.out.println(s21.compareTo(s22));
System.out.println(s22.compareTo(s21));
System.out.println(s23.compareTo(s22));
//indexOf
String s31=new String("Hello World ");
System.out.println(s31.indexOf('e'));
// index of a character from a specific position
System.out.println(s31.indexOf('l',5));
//beginning index of a substring 
System.out.println(s31.indexOf("World"));
System.out.println(s31.toLowerCase());
System.out.println(s31.toUpperCase());
//trim()
System.out.println(s31.trim());

//substring()
System.out.println(s31.substring(0,3));
System.out.println(s31.substring(7));


}}

import java.lang.*;

public class StringDemo
{
public static void main(String args[])
{
	String s1="HELLO java";
	String s2= new String();
	String s3 = new String("Hello");
	String s4 = "Hello";
	String s5 = new String("Hello");
	String s6 = "Hello";
	String s8=new String("JaVaClaSs");
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		System.out.println(s1.length());
		System.out.println(s3.charAt(1));
		
		System.out.println(s1.concat(s3));
	System.out.println(s1);
	System.out.println(s3);
	if(s3 == s5)
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
	if(s3.equals(s5))
	{
	System.out.println("yes");
	}
	else
	{
	System.out.println("No");
	}
String s7 = s1.substring(2,7);//begin index is inclusive end index is exclusive
	System.out.println(s7);
	System.out.print	s1 = s1.substring(3,7);
	System.out.println(s1); 
	s8=s8.toLowerCase();
System.out.println(s8);}}



// trim(), indexOf() , equals(), compareTo(), toUpperCase(), to LowerCase()
import java.lang.*;
class Stringop{
	public static void main(String args[]){
		String s=" Saima Shahin ";
		String s2="Java Programming";
		String s3= new String("Hello");
		String s4= new String("Hello");
		//String s4=s3; // string reference
		System.out.println(s.trim());// trim method
		System.out.println(s.concat(s2));// concat() method
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		if(s3==s4)
		{System.out.println("yes");}
	else
	{System.out.println("no");}
if(s3.equals(s4))
		{System.out.println("yes");}
	else	{System.out.println("no");}
}}
	


// sub string

public class sub {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Extract substring from index 7 to the end
        System.out.println(str.substring(7));      
		// Output: "world!"
        
        // Extract substring from index 0 to index 5 (exclusive)
        System.out.println(str.substring(0, 5));    
		// Output: "Hello"
        
        // Extract substring from index 7 to index 12 (exclusive)
        System.out.println(str.substring(7, 12));     
		// Output: "world"
    }
}




// inheritance

// extends keyword
class Animal{
	String name;
	public void eat(){
System.out.println("I can eat");}}
class cat extends Animal{
	public void display(){
System.out.println("My name is "+name);}}
public class t5{
	public static void main(String args[]){
		cat c1=new cat();
		c1.name="Meow";
c1.display();}}
		

// Parent class is Bank11 Class
// child classes - > SIBL - 4%, PBL- 5.3%
// same method
//mother class
class Bank11{
public float getROI(){
return 0;}
}
class SIBL extends Bank11{
public float getROI(){
return 4;}}
class PBL extends Bank11{
public float getROI(){
return 5.3f;}}
public class test1{
	public static void main(String args[]){
		SIBL s= new SIBL();
		PBL p=new PBL();
		System.out.println("Rate of interest: "+s.getROI()+" %");
		System.out.println("Rate of interest: "+p.getROI()+" %");
}}
		
		
		



