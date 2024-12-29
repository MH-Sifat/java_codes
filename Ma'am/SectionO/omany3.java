// one to many association between two classes
class card{
	private long cardno;
	private String cardh;
	private double Balance;
	public void setCno(long c){this.cardno=c;}
	public long getCno(){ return this.cardno;}
	
public void setCh(String h){ this.cardh=h;}
public String getCh(){return this.cardh;}
	
public void setBa(double b){ this.Balance=b;}
public double getBa(){return this.Balance;}
}
class customer{
	private String phn;
	card c[];// initializing multiple cards
	public void setPh(String p){ this.phn=p;}
	public String getPh(){return this.phn;}
public customer(){}
public customer(String p, int size){
this.phn=p;
c=new card[size];
}
public void show(){
for(int i=0;i<c.length;i++){
if(c[i]!=null){
	System.out.println("Card No"+c[i].getCno());
	System.out.println("Card Holder name "+c[i].getCh());
System.out.println("Card Balance: "+c[i].getBa());}		
}}
// inserting new card 
public void insertcard(card d){
	// d as a local variable of card class type
	int flag=0;// to track insertion has happened or not
	for(int i=0;i<c.length;i++){
		if(c[i]==null){ c[i]=d;// setting all values through one object
		flag=1;
	break;}}
	if(flag==1){System.out.println("Inserted");}
	else {System.out.println("Cannot Insert");}
	
}
// removing existing card 
public void removecard(card d){
	// d as a local variable of card class type
	int flag=0;// to track insertion has happened or not
	for(int i=0;i<c.length;i++){
		if(c[i]==d){ c[i]=null;// setting all values through one object
		flag=1;
	break;}}
	if(flag==1){System.out.println("Removed");}
	else {System.out.println("Cannot Remove");}
}
}

public class omany3{
	public static void main(String args[]){
		customer c1=new customer("+89323939030",2);
		card d1=new card();
		d1.setCno(7328836L);
		d1.setCh("John Wilson");
		d1.setBa(63288.3278);
		card d2=new card();
		d2.setCno(27832938L);
		d2.setCh("John Wilson");
		d2.setBa(2187923.89);
		c1.insertcard(d1);
		c1.insertcard(d2);
		c1.show();
		c1.removecard(d2);
		c1.show();
	}
}
