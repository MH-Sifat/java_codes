
/*
class Array{
	public static void main(String[] args){
		// 3 vabe array create kora jai
		// 1st
		int marks[] = new int[5];
		// 2nd 
		int marks_2[];
		marks_2 = new int[5];
		// 3rd
		int marks_3[] = {4,5,8,9,7};
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

public class Array{
	public static void main(String[] args){
		int ints[]=new int[5];
		//toString() method 
		System.out.println("Ints-" + Arrays.toString(ints));
		
		// Wrapper classes
		Integer i[] = new Integer[5];
		System.out.println("I-" + Arrays.toString(i));

	}
}
*/		
	
/*
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.*;
// or we can do this import java.util.*

public class Array{
	public static void main(String[] args){
		String [] arr = {"Chicken","beef","potato"};
		// converting array as list
		List<String> list = Arrays.asList(arr);
		// for(Type var: array)
			for(String s:list){
				System.out.print(s + " ");
			}
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
		
		System.out.println(Arrays.equals(arr1,arr2));
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
		Arrays.sort(arr1);
		for(int i:arr1){
			System.out.print(i + " ");
		}
	}
}
*/		