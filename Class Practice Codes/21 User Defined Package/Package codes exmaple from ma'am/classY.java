package A2;
import A1.A;
import A1.classX;
public class classY extends classX implements B{
	public void sub(int a, int b){
	System.out.println("subtraction is :"+(a-b));
	}
	//concrete method
	public void div(int a, int b){
		if(b!=0){
		System.out.println("quotient is :"+(a/b));}
		else{ System.out.println("division is not possible");}
		
		
}}