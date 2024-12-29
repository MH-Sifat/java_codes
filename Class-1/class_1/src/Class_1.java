// ****  class - 1  ****

//*** How to write function & class in java and how to print ***

public class Class_1 {
		private String a;
		int b;
		double c;
		boolean d;
		
		public Class_1(){
		System.out.println("default");
		}
		
		Class_1(String a , int b, double c, boolean d){
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		
		public void dis(){
		System.out.println(a +" " + b + "  " + c + " " +d);
		}
			
		public int add(int a, int b){
		 int s = a+b ; 
		 return s;
		}			
    public static void main(String[] args) {
        // this is how to print anything in java
        //System.out.println("Hello World what's up!!");
		Class_1 obj = new Class_1();
		obj.dis();
		System.out.println(obj.add(10 , 52));
		
		Class_1 obj2 = new Class_1("Sifat",10,5.65,true);
		obj2.dis();
		
    }
}


// single line comment korte ( // ) eta and multiple line comment korte ( /* comments.. */ ) eta use hoy
// class name lekhar jonno PascalConvention use kora hoi er mane er first letter gula capital hobe emaple : ( MyNameIsSifat , OddNumber, EvenNumber ) ey vabe class name gula lekha hoy
// function name lekhar jonno amra camelCase use kori er mane first letter small the second word er first letter capital Example:( myNameIsSifat , oddNumber,evenNumber)

