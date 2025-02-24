// Array is a collection of similar data or value
// We can declare an Array in 4 ways

/*
// 1D Array 
class Array{
	public static void main(String[] args){
// TypeOfArray ArrayName SymbolOfArray[] = new keyword TypeOfValue [Size]
		
// 1st Approach (This approach is used when we know the size of the array but we do not know the elements of the array.)
		int marks[] = new int[5];  // or int []marks = new int[5];
   
	 // for loop declaring to see the output of an array
	 // loop ta array er length porjonto cholbe tai ekhne ArrayName.lengthMethod use kora hoyeche 
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i] + " ");
		}
	// while loop declaring
	    int i = 0;//start from 0
        while(i<marks.length){ //condition
			System.out.print(marks[i] + " ");
			i++; //increment
		}
		
	// Do-While loop declaring 
	//ey loop e condition false hole o kaj ek bar hobe 
	    int j = 6;
		do{
			System.out.print(marks[j] + " ");
			j++;
		}
		while(j<marks.length); //condition

	// for each loop declaring
    //for (Type variable : collection) { code to execute }
        for(int a: marks){
			System.out.print(marks[a] + "  for each  ");
		}
	
		System.out.println();
// 2nd Approach (This approach is used when we neither know the size nor the elements of the array.)
		int marks_2[];
		int size = 5;
		marks_2 = new int[size];
		for(int i=0;i<marks_2.length;i++){
			System.out.print(marks_2[i] + " ");
		}
		System.out.println();	
// 3rd (This approach is used when we do not know the size of the array but we know the elements of the array.)
		int marks_3[] = new int[]{4,5,8,9,7};
	// we can access the elements of the array using there index positions
		marks_3[2] = 65;
		
		for(int i=0;i<marks_3.length;i++){
			System.out.print(marks_3[i] + " ");
		}
		System.out.println();
// 4th Approach ( !!! This approach is NOT RECOMMENDED !!!. )
        int marks_4[] = {46,5,4,12,6};
		for(int i=0;i<marks_4.length;i++){
			System.out.print(marks_4[i] + " ");
		}
		
	}
	
}
*/

/*
// 2D Array
class Array{
	public static void main(String[] args){
// declaring 2D Array
// 1st Approach
    int arr_1 [][] = new int[3][3];
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		  System.out.print(arr_1[i][j] + " ");	
		}
		  System.out.println();	
	}
// 2nd Approach
    int arr_2[][];
	int r = 4;
	int c = 4;
	arr_2 = new int[r][c];
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		  System.out.print(arr_2[i][j] + " ");	
		}
		  System.out.println();	
	}
// 3rd Approach
    int arr_3[][] = new int[][]{{1,2,3},{4,5,6}};
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
		  System.out.print(arr_3[i][j] + " ");	
		}
		  System.out.println();	
	}
// 4th Approach (!!! Not Recommended !!!)
    int arr_4[][] = {{1,2},{3,4}};
	for(int i=0;i<2;i++){
		for(int j=0;j<2;j++){
		  System.out.print(arr_4[i][j] + " ");	
		}
		  System.out.println();	
	}

	}
}
*/

// Array of object declaring

/*
public class Array{
	int l,w,h;
	public Array(int l,int w,int h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	public static void main(String[] args){
// className arrayOfObjectName arraySymbol[] = new keyword className [arraySize];
	 // an object created 
	 Array a = new Array(1,2,3);
	 // an array of object created
	 Array arrObj[] = new Array[3];
// array of object er 0 index e a object ta initialize korechi
	 arrObj[0] = a;
	 //System.out.println(a.w);	
	// System.out.println(arrObj[0].w);
// array of object er 1 index e direct ekta object create korechi
	 arrObj[1] = new Array(4,5,6);
	 //System.out.println(arrObj[1].w);
	 for( int i=0;i<arrObj.length;i++){
	     System.out.print(arrObj[i].l);
	     System.out.print(arrObj[i].w);
	     System.out.print(arrObj[i].h);
	     System.out.println();
	 }
	 
	}
}
*/

// checking array null or not
/*
import java.lang.*;

class Box{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l){
		length = l;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setHeight(double h){
		height = h;
	}
	
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}	
}

public class Array{
	public static void main(String args[]){
		Box boxes[] = new Box[5];
		
		Box b1 = new Box();
		b1.setLength(1.5);
		b1.setWidth(1.2);
		b1.setHeight(1.3);
		
		Box b2 = new Box();
		b2.setLength(2.5);
		b2.setWidth(2.1);
		b2.setHeight(2.7);
		
		boxes[0] = b1;
		boxes[2] = b2;
		
		for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("------------------");
				System.out.println("Boxes["+i+"] Length: "+boxes[i].getLength());
				System.out.println("Boxes["+i+"] Width: "+boxes[i].getWidth());
				System.out.println("Boxes["+i+"] Height: "+boxes[i].getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("------------------");
				System.out.println("There is No Object in boxes["+i+"]");
			}
		}
	}
}
*/




//array inputs in 1D , print average , maximum , minimum 

/*
import java.util.Scanner;

class Array{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt(); // take the size
		int [] num = new int [size]; // array declare
		for(int i=0;i<num.length;i++){
			System.out.print(i + ": ");
			num[i] = in.nextInt();
		}
		// total sum of all elements / size of array
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum = sum + num[i];
		}
		double average = (double) sum/num.length;
		// maximum and minimum
		int min = num[0];
		int max = num[0];
		
		for(int i=0;i<num.length;i++){
			if(min>num[i]){
				//update
				min = num[i];
			}
		    if(max<num[i]){
				max=num[i];
			}
		}
		
		System.out.println("Average: " + average);
		System.out.println("Maximun: " + max);
		System.out.println("Minimum: " + min);
	}
}
*/

/*
// Built in Array class
import java.util.Arrays;
//The java.util.Arrays class provides utility methods for array manipulation, such as sorting, searching, and converting arrays to strings.

public class Array{
	public static void main(String[] args){
		int ints[]=new int[5];
		//toString() method 
		System.out.println("Ints-" + Arrays.toString(ints));
		
// Wrapper classes
// Wrapper classes (like Integer, Double, etc.) allow primitive data types to be treated as objects.
// When an array of objects (like Integer) is created, all elements are initialized to their default value, which is null.
		Integer i[] = new Integer[5];
// Arrays.toString(i) converts the i array into a string in the format [null, null, null, null, null].
		System.out.println("I-" + Arrays.toString(i));

	}
}
*/
	
	
/*
import java.util.Arrays;
//import java.util.Arrays; This specifically imports the Arrays class, which provides utility methods for working with arrays.
import java.util.ArrayList; 
//import java.util.ArrayList; This specifically imports the ArrayList class, which implements the List interface.
import java.util.*;
//import java.util.*; This is a wildcard import, which imports everything from the java.util package.

// or we can do this import java.util.*

public class Array{
	public static void main(String[] args){
		String [] arr = {"Chicken","beef","potato"};
// Arrays in Java have a fixed size and cannot be resized dynamically. That’s why converting it to a List (which supports dynamic sizing and other utilities) is useful
		// converting array as list
		List<String> list = Arrays.asList(arr);
// Arrays.asList() Converts an array to a List backed by the original array.
// The list is fixed-size, meaning you cannot add or remove elements, but you can modify the existing elements.
     // for each loop
		// for(Type var: array)
			for(String s:list){
				System.out.print(s + " ");
			}
				
			System.out.println();
			
// The list is not fixed size, meaning you can add or remove elements.
        List<String> dynamicList = new ArrayList<>(Arrays.asList(arr));
// Type: List<String> is an interface, and ArrayList<String> is a concrete implementation of the List interface.dynamicList behaves as a dynamically resizable list because it uses the ArrayList class.
         // new kono elements list e add korte hole 
 		  dynamicList.add("Carrot");
		 // kono element remove korte hole
		  dynamicList.remove(1); // Removes the element at index 1 ("beef")
          dynamicList.remove("potato"); // Removes the element "potato"

		  for(String i: dynamicList){
				System.out.print(i + " ");
		  }
		
	}
}
*/

/*
// total of all element
import java.lang.*;
class Array{
	public static void main(String args[]){
		double num[]={10.1, 12.4, 16.8, 10};
		double result=0.0;
		
		for(int i=0;i<4;i++){
		result=result+num[i];
		}
        System.out.println(result);
	}
}
*/

/*
class Array{   
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
       
	   System.out.println();  
	   
       // alternative way
        for(int i:a)  
        System.out.println(i);  
    }
} 
*/
 
/*
// copyOf(arr_name,arr_size)
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class Array{
	public static void main(String[] args){
		int [] arr1 = new int[5]; 
// A method from the java.util.Arrays class that creates a new array by copying elements from an existing array.
		int [] arr2 = Arrays.copyOf(arr1,arr1.length);
		
		for(int i:arr1){
			System.out.print(i +" ");			
		}
		System.out.println();
		for(int i:arr2){
			System.out.print(i + " ");
		}
	}
}
*/

/*
// equals(arr1,arr2)
// compare(arr1,arr2)
import java.util.*;
//copy an array to another array

public class Array{
	public static void main(String[] args){
		String[] arr1 ={"Bike","car","tomato"};
		String[] arr2 ={"Bike","Wcar","tomato"};
// Compares the two arrays element by element. Return true if both are equal other wise false
		System.out.println(Arrays.equals(arr1,arr2));
// Compares corresponding elements in the arrays until a mismatch is found:
// Returns: 0: If both arrays are equal. A negative integer: If the first array is less than the second. A positive integer: If the first array is greater than the second
		System.out.println(Arrays.compare(arr1,arr2));
		
	}
}
*/

/*
//sort(array)
import java.util.*;
//copy an array to another array

public class Array{
	public static void main(String[] args){
		int []arr1 = new int[]{45,2,17,50,9};
// Sorts the elements of an array in ascending order by default.
// Numbers are sorted from smallest to largest.
		Arrays.sort(arr1);
		for(int i:arr1){
			System.out.print(i + " ");
		}
	}
}
*/