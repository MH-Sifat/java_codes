// String is an calss in java 
/*
public class StringOper{
	public static void main(String[] args){
	// String object lekahr system
	String name_1 = new String("Sifat");
	System.out.println(name_1);
	// string letral or variable
	String name_2 = "Mehedi";
	System.out.println(name_2);
	// String immutable eta change kora jai nah
	
	}
}
*/

/*
// String Methods or operators

public class StringOper{
	public static void main(String[] args){
		String name = "Mehedi";
		System.out.println(name);
		
		// name.length()
		// it return the length of the string variable
        int value = name.length();
		System.out.println(value);
		
		// name.toLowerCase() use korse String er sob letter gulu small letter hoye jabe
		String lowerString = name.toLowerCase();
		System.out.println(lowerString);
		
	    // name.toUpperCase() use korse String er sob letter gulu Captal letter hoye jabe
		String upperString = name.toUpperCase();
		System.out.println(upperString);
		
		// name.trim() use korle samne and pichoner space gula ar thakbe nah
		String nonTrim = "    Sifat    " ;
		System.out.println(nonTrim);
		String useTrim = "    Sifat    " ;
		// or String useTrim = nonTrim.trim();
		System.out.println(useTrim.trim());
		
		// name.substring(int startingVlaue)  use korle je value thakbe oita theke sesh porjonto print hobe
	    String subName = "Mehedi Hasan Sifat";
		// (index 0 theke suru) ekhne 5 no index theke sesh porjonto print hobe
		System.out.println(subName.substring(5));
		// nicherta use kora ar nah kora same 
		System.out.println(subName.substring(0));
		
		// name.substring(int startingVlaue , int endingValue) eta use korle starting e je value deoua thake oita theke ending e je value deoua thakbe oitar age porjonto print hobe 
	    String subCheck = "123456789";
	    System.out.println(subCheck.substring(5,8));
		
		// name.replace(1st char , 2nd char) eta use korle 1st char e jeta thakbe oita replace kore 2nd char ta shekhane boshbe
		String replaceCheck = "Harry";
		System.out.println(replaceCheck.replace('r','p'));
		System.out.println(replaceCheck.replace("r","pp"));
		
		// name.startsWith(" ") starting letter same naki check korar jonno use kora hoye same hole true nah hole false
		String sWc = "jouly";
		System.out.println(sWc.startsWith("jo"));
		System.out.println(sWc.startsWith("Jo"));
		System.out.println(sWc.startsWith("Boo"));
		
		// name.endsWith(" ") ending letter same naki check korar jonno use kora hoye same hole true nah hole false
		String eWc = "fool";
		System.out.println(eWc.endsWith("fo"));
		System.out.println(eWc.endsWith("Ol"));
		System.out.println(eWc.endsWith("ol"));
		
		// name.charAt(0) je index number deoua oitai ki value ase ta dekhte use kora hoy
		String charCheck = "I am Mad";
		System.out.println(charCheck.charAt(3));
		
		// name.indexOf('') string er index number show kore
		String indexCheck = "I am Mad";
		System.out.println(indexCheck.indexOf('a'));
		System.out.println(indexCheck.indexOf("Ma"));
		// ekhne name.indexOf('',int) int value jeta oi index number theke char er index num ta khoja suru korbe
		String indexCheckRange = "hurrray";
		System.out.println(indexCheckRange.indexOf("ra",3));
		
		// char khuje nah pele -1 show korbe
		System.out.println(indexCheckRange.indexOf("ra",6));
		System.out.println(indexCheckRange.lastIndexOf("ra"));
		
		// name.equals() value equal naki na ta check korte use kora hoy
		System.out.println(indexCheckRange.equals("hurrray"));
		System.out.println(indexCheckRange.equals("hurray"));
		
		// etai case sensitive er problem hoy nah value same hole e true hoy
		System.out.println(indexCheckRange.equalsIgnoreCase("Hurrray"));
		
		String forCom1 = "My name";
		String forCom2 = "My Name";
		
		// comapre korte use hoy soman hole 0 jetar sathe comapre kortasi oita choto hole value 0 theke choto hobe ar boro hole 0 theke boro
		System.out.println(forCom1.compareTo(forCom2));
		
		
		// duita eksathe jora lagate use hoy
		System.out.println(forCom1.concat(forCom2));

		
	}
}

*/

/*
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
*/

/*	
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
*/

/* 
import java.lang.*;
class comp{
public static void main(String args[]){
	String s1="America";
	String s2="Banana";
	String s3=s1;
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
System.out.println(s2.compareTo(s1));}}

*/

/*
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
*/

/*
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
*/

/*
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
*/

/*
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

*/

/*
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

*/

/*
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

*/


/*

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

*/


