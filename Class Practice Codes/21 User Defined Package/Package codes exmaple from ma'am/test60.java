package A3;
import A2.classY;
import java.util.Scanner;

public class test60{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	classY t=new classY();
	System.out.println("enter a");
	int a=sc.nextInt();
	System.out.println("enter b");
	int b=sc.nextInt();
	t.sum(a,b);
	t.sub(a,b);
	t.multiply(a,b);
	t.div(a,b);
	sc.close();
	
	
}
}
