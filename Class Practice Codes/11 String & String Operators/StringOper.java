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
	    String subCheck = "0123456789";
	    System.out.println(subCheck.substring(5,10));
		
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
		
	}
}

