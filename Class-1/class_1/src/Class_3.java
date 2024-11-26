// ****  class - 3  ****

// je value ta jei variable e store kora jai take literal bole example : ( int a = 5; float b = 5.5f [ f lekhle eta float value hobe by default eta double thake ] char c = 'S'; ) je variable e je value gula store kora jai oitai holo literal .

// we have to import this to get input from user
import java.util.Scanner;

public class Class_3 {
    public static void main(String[] args){
        // all primitive data types and there literals
        byte age = 45;
        int  age_2 = 56;
        short age_3 = 65;
        long ageLong = 56666878L; // or 5666554l
        float per = 5.6F;        // or5.6f
        double per_2 = 4.65;   // or 4.65d or 4.65D
        char ch = 'D';
        boolean bool = true ;
        String str = "hello"; // literal of string & it's an non-primitive data type
        System.out.println(str);

// this is how to get input from user in java
        System.out.println("Taking Input from user: ");  // shortcut -> if we write sout and press enter we will find System.out.println();
// first we have import Scanner class then we have to create an object using the Scanner class like we have done below
        Scanner sc = new Scanner(System.in); // System.in -> read data from keyboard
        System.out.print("Enter Number 1: ");
        int a ;
        a = sc.nextInt(); // taking int value by using .nextInt()
        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("The Sum of a and b input numbers is: " + sum);
        System.out.print("Enter number 3: ");
        float c = sc.nextFloat(); // taking float value by using .nextFloat
        System.out.print("Enter number 4: ");
        float d = sc.nextFloat();
        //String e = sc.nextLine();
        //char f = sc.next().charAt(2);
        float sum_2 = c + d ;
        System.out.println("The Sum of c and d is: " + d);


    }
}