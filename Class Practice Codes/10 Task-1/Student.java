public class Student{
	int id;
	String name;
	double cgpa;
	//set methods
	public void setId(int i){
		this.id = i ;
	}
	public void setName(String n){
		this.name = n ;
	}
	public void setCgpa(double c){
		this.cgpa = c ;
	}
	// get methods
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getCgpa(){
		return cgpa;
	}
	public static void main(String[] args){
		Student s = new Student();
		s.setId(24);
		s.setName("Asir");
		s.setCgpa(2.55);
		
		System.out.println("Id: " + s.getId());
		System.out.println("Name: " + s.getName());
		System.out.println("CGPA: " + s.getCgpa());
	}
}

 