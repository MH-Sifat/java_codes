//one to one association between person and passport
class person{
	private String name;
	public void setN(String n){
	this.name=n;}
	public String getN(){
	return this.name;}	
}
class passport{
	private String passno;
	public void setP(String n){
	this.passno=n;}
	public String getP(){
	return this.passno;}	
}
public class one{
	public static void main(String args[]){
		person p=new person();
		p.setN("John");
		
		passport t=new passport();
		t.setP("A6328238");
		System.out.println(p.getN()+" has a passport that's "+t.getP());	
	}
}
	