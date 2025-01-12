package expen;

// Expection is an run time error.
// It is an abnormal condition that aries in a code sequence at run time.
// different types of expections:

// 1. ArithmeticException : Can't divide a number by 0.
/*
public class Expen{
	public static void main(String[] args){
		int x = 10;
		int y = 0;
		System.out.println(x/y);
	}
}
*/

// 2. NullPointerException 
/*
public class Expen{
	public static void main(String[] args){
		String name = null;
		System.out.println(name.charAt(0));
	}
}
*/

// 3. StringIndexOutOfBoundsException
/*
public class Expen{
	public static void main(String[] args){
		String name = "Sifat";
		System.out.println(name.charAt(10));
	
	}
}
*/

// 4. NumberFormatException
// number e convert kora possible nah tai eta dekhai
/*
public class Expen{
	public static void main(String[] args){
		int num = Integer.parseInt("mehedi"); 
		System.out.println(num);
	
	}
}
*/

// 5. FileNotFoundException
// file khuje na pele eta dekhai
/*
public class Expen{
	public static void main(String[] args){
		File file = new File("D://file.text");
		System.out.println(name.charAt(10));
	
	}
}
*/


// 6. ArrayIndexOutOfBoundsException
/*
public class Expen{
	public static void main(String[] args){
		int a[] = new int[2];
		a[5] = 88;
		System.out.println(a[5]);
	}
}
*/

// ClassNotFoundException , IOException , NoSuchMethodException

// je error amra handle korte parbo oita holo expection (run time error)

// Expection handling is one of the powerfull mechanism to handle the run time errors
// Expection handling is managed by  keywords.
// 1. try 
// 2. catch 
// 3. finally
// 4. throw
// 5. throws

/*
public class Expen{
	public static void main(String[] args){
		try{
			// code we want to monitor
			// je code gula te error ashte pare oigula amra try block e rakhbo
		}
		catch(ExpectionType e1){
			// expection handler for expection
			// try block e kono error thakle ta se throw korbe and oi expection catch korbe catch block jodi expection type same hoy catch block multiple thakte pare
		}
		catch(ExpectionType e2){
			// expection handler for expection
		}
		finally{
			// catch expection handle korte na parle ta finally block korte parbe
		}
	}
}
*/

// example

/*
public class Expen{
	public static void main(String[] args){
		try{
			int x = 10;
		    int y = 0;
		    System.out.println(x/y);
		}
		// expection type mone na korte parle : catch(Exception a){...}
		catch(ArrayIndexOutOfBoundsException a){
		    System.out.println("Exception:" + a);
		}
		
		// jodi kono code try catch handle na korte parle kintu amra chai seta run koruk tkhn seta finally block e likhbo
		finally{
		    System.out.println("Last line of the programe");
		}
	}
}
*/

// example

/*
public class Expen{
	public static void main(String[] args){
		try{
			int x = 10;
		    int y = 0;
		    System.out.println(x/y);
		}
/*
		// ekhne error asbe karon Exception sobar uporer class jar bhitore onno gula ase and 1st catch e error dhora porbe tai ey code run korbe na.
		catch(Exception a){
		    System.out.println("Exception:" + a);
		}	
        catch(ArithmeticException a2){
		    System.out.println("Exception:" + a2);
		}
*/		
/*       
		// correct way
		catch(ArithmeticException a1){
		    System.out.println("Exception:" + a1);
		}
		catch(Exception a2){
		    System.out.println("Exception:" + a2);
		}	
        
		
		finally{
		    System.out.println("Last line of the programe");
		}
	}
}
*/

/*
import java.io.*;
import java.util.*;//Scanner
import java.lang.*;

public class Expen{
	private int x,y;
	private String s;
	public static void main(String[] args){
		// input mismatch exceptiondemo
		Scanner sc=new Scanner(System.in);
		Expen ed=new Expen();
		ed.x=sc.nextInt();
		ed.y=sc.nextInt();
	    System.out.println(ed.x+ed.y);
	    // Null pointer exceptiondemo
	   // System.out.println(ed.s.length());
	   // System.out.println(ed.s.isEmpty());
	    // array index out of bounds exceptiondemo
	    int a[]=new int[]{10,20,30,40};
	    for(int i=0;i<=5;i++){
	    	System.out.println(a[i]);
	    }
	    // number format exceptiondemo
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Enter a string: ");
	    ed.s=scn.next();// next is for character
	    // converting or type casting
	    int j=Integer.parseInt(ed.s); 	
	    System.out.println(j);
	
	}
}
*/