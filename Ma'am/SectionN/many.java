//section N
// one to many association
// one to many association between two classes 
// i.e.: a customer has multiple account information
class Account{
	private int Acc;
	private String Accn;
	private double Balance;
	public void setAcc(int a){
	this.Acc=a;}
	public int getAcc(){
	return this.Acc;}
	public void setAccn(String n){
	this.Accn=n;}
	public String getAccn(){
	return this.Accn;}
	public void setBa(double b){
	this.Balance=b;}
	public double getBa(){
	return this.Balance;}
	
}
// array of objects
class customer{
	private String phn;
	Account A[];// an array of account objects inside customer class
	public customer(){
	}
	public customer(String p, int size){
		this.phn=p;
	A=new Account[size];// no of total accounts of one customer
	}//Classname Arrayname=new Classname[size]
	public void setPhn(String p){
	this.phn=p;}
	public String getPhn(){ return this.phn;}
	public void show(){
		// array traverse
		for(int i=0;i<A.length;i++){
			if(A[i]!=null){
				System.out.println("Account name:"+A[i].getAccn());
				System.out.println("Account no:"+A[i].getAcc());
				System.out.println("Balance"+A[i].getBa());	
		}
	}}
	public void insert(Account a){
		int flag=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==null)// new customer and no account
			{ A[i]=a;
			flag=1;
			break;}
		}
		if(flag==1){System.out.println("inserted");}
		else{System.out.println("not able to insert");}
		
	}
	public void remove(Account a){
		int flag=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==a)// new customer and no account
			{ A[i]=null;
			flag=1;
			break;}
		}
		if(flag==1){System.out.println("removed");}
		else{System.out.println("not able to remove");}
		
}}
public class many{
	public static void main(String args[]){
		customer c1=new customer("+8803268238",2);
		Account a1=new Account();
		a1.setAccn("John");
		a1.setAcc(123782);
		a1.setBa(50000);
		Account a2=new Account();
		a2.setAccn("John");
		a2.setAcc(123737);
		a2.setBa(40000);
		c1.insert(a1);
		c1.insert(a2);
		c1.show();
		c1.remove(a1);
		c1.show();	
		
	}
}
	
	