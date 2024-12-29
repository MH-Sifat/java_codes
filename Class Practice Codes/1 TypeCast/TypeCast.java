
public class TypeCast{
	public static void main(String[] args){
		// int to byte convert
		float a = 456.56f;
		byte b =(byte)a;
		System.out.println(a + " "+ b);
		/*
		// byte to int convert
		byte c = 112;
		int d =(int)c;
		System.out.println(c + " "+ d);
		// int to Short convert
		int e = 546666;
		short f =(short)e;
		System.out.println(e + " "+ f);
		// double to byte convert
		double g = 26.568;
		byte h =(byte)g;
		System.out.println(g + " "+ h);
		// char to int convert
		char i ='A';
		int j =(int)i;
		System.out.println(i + " "+ j);
		*/
	}
}
		



// type casting 
/*
import java.lang.*;

public class TypeCast{
	public static void main(String args[])
	{
		char c1='a', c2='s';
		float f1=0.0F, f2=65.0F;
		double d1=0.0, d2=75.8;
		byte b1=126, b2=125;
		short s1=254, s2=253;
		int i1=2147483646, i2=68;
		long l1=9999999999999L, l2=9999999999998L;
		
		System.out.println("Char -> Float -- Implicit/Auto/Small-To-Large Casting");
		System.out.println("Before	C1: "+c1);
		f1=c1;	//implicit type casting 
		System.out.println("After	F1: "+f1);
		System.out.println();
		
		System.out.println("Float -> Char -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	F2: "+f2);
		c2=(char)f2;	//explicit type casting 
		System.out.println("After	C2: "+c2);
		System.out.println();
		
		System.out.println("Char -> Integer -- Implicit/Auto/Small-To-Large Casting");
		System.out.println("Before	C1: "+c1);
		i1=c1;	//implicit type casting 
		System.out.println("After	I1: "+i1);
		System.out.println();
		
		System.out.println("Integer -> Char -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	I2: "+i2);
		c2=(char)i2;	//explicit type casting 
		System.out.println("After	C2: "+c2);
		System.out.println();
		
		System.out.println("Float -> Double -- Implicit/Auto/Small-To-Large Casting");
		System.out.println("Before	F1: "+f1);
		d1=f1;	//implicit type casting 
		System.out.println("After	D1: "+d1);
		System.out.println();
		
		System.out.println("Double -> Float -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	D2: "+d2);
		f2=(float)d2;	//explicit type casting 
		System.out.println("After	F2: "+f2);
		System.out.println();
		
		System.out.println("Int -> Long -- Implicit/Auto/Small-To-Large Casting");
		System.out.println("Before	I1: "+i1);
		l1= i1;	//implicit type casting 
		System.out.println("After	L1: "+l1);
		System.out.println();
		
		System.out.println("Long -> Int -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	L2: "+l2);
		i2= (int) l2;	//explicit type casting 
		System.out.println("After	I2: "+i2);
		System.out.println();
		
		System.out.println("Int -> Double -- Implicit/Auto/Small-To-Large Casting");
		System.out.println("Before	I1: "+i1);
		d1=i1;	//implicit type casting 
		System.out.println("After	D1: "+d1);
		System.out.println();
		
		System.out.println("Double -> Int -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	D2: "+d2);
		i2= (int)d2;	//explicit type casting 
		System.out.println("After	I2: "+i2);
		System.out.println();
		
		System.out.println("Char -> Short -- Explicit/Auto/Small-To-Large Casting");
		System.out.println("Before	C1: "+c1);
		s1= (short)c1;	//explicit type casting 
		System.out.println("After	S1: "+s1);
		System.out.println();
		
		System.out.println("Short -> Char -- Explicit/Non-Auto/Large-To-Small Casting");
		System.out.println("Before	S2: "+s2);
		c2= (char)s2;	//explicit type casting 
		System.out.println("After	C2: "+c2);
		System.out.println();
	}
}

*/




// wraper 
/*
public class TypeCast{
  public static void main(String[] args) {
	  //Variable.DatatypeValue is to use Wrapper objects
	  // primitive to object
	  int x = 30;
	  Integer y = Integer.valueOf(x);
	  System.out.println(y);
	  // auto boxing er kaj holo primitive data type ke object e convert kora
	  Integer z = x;
	  System.out.println(z);
	  // object to primitive
	  Double d = 12.25;
	  double e = d.doubleValue();
	  System.out.println(e);
	  
	Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
	// toString is used to convert to string
    Integer myInt2 = 100;
    String myString = myInt2.toString();
    System.out.println(myString.length());
	Double myDouble2 = 100.24681;
    String myString2 = myDouble2.toString();
    System.out.println(myString2.length());
  }
}		
*/