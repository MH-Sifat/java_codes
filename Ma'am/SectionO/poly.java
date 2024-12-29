// Polymorphism and association use.
//person and account class if you have multiple accounts for one person
// use display() for implementing polymorphism
package O;
import java.util.*;
import java.lang.*;
class Account{
	private int Acn;
	private String An;
	private double balance;
	public void setAcn(int a){ this.Acn=a;}
	public void setAn(String b){this.An=b;}
	public void setBa(double c){this.balance=c;}
	public int getAcn(){return this.Acn;}
	public String getAn(){return this.An;}
	public double getBa(){return this.balance;}
	public void display(){
		System.out.println("Name: "+getAn());
		System.out.println("No: "+getAcn());
	System.out.println("Balance: "+getBa());}
		
}
class person{
	private long nid;
	// array of objects for creating multiple account information
	Account A[]=new Account[2];
	public person(){}
	public person(long n){ this.nid=n;}
	// Addition of new accounts
	public void add(Account a){
		int flag=0; // meaning no account has been added
		for(int i=0;i<A.length;i++){
			if(A[i]==null)// null reference
			{ A[i]=a;// added information to this index
			flag=1;
			break;
			}
		}
		if(flag==1){System.out.println("added");}
		else{System.out.println("not able to add");}
		
	}
	// Removing of existing accounts
	public void remove(Account a){
		int flag=0; // meaning no deletion has happened
		for(int i=0;i<A.length;i++){
			if(A[i]==a)// valid data reference
			{ A[i]=null;// delete information to this index
			flag=1;// you cancelled an existing account
			break;
			}
		}
		if(flag==1){System.out.println("Removed");}
		else{System.out.println("not able to remove");}
		
	}
	public void display(){
		System.out.println("Nid "+this.nid);
		for(int i=0;i<A.length;i++){
	A[i].display();}}
	// searching an account exists or not
	// access return_type method_name(arguments)
	public Account search(int acno){// acno=search data
	Account a=null;
	for(int i=0;i<A.length;i++){
		if(A[i]!=null){
			if(A[i].getAcn()==acno) { a=A[i];
	break;}}}
	return a;}	
	
}

	
public class poly{
	public static void main(String args[]){
		person n=new person(456892894L);
		Account a1=new Account();
		a1.setAcn(34849);
		a1.setAn("John");
		a1.setBa(50000.34);
		savings s2=new savings();
		s2.setAcn(44849);
		s2.setAn("John");
		s2.setBa(40000.34);
		s2.setRate(6.5);
		n.add(a1);
		n.add(s2);
		n.display(); // searching
		if(n.search(34849)!=null)
		{System.out.println("This account exists");}
	else {System.out.println("This account doesnot exist");}
	
		
		
		
	}
}