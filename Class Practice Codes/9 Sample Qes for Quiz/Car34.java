//3. What will be possible output of this code?
public class Car34 {
 
    private static int count = 0;
 public Car34() {
        count++;  }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Car34 car1 = new Car34();
        System.out.println("Number of Car instances: " + Car34.getCount());
        Car34 car2 = new Car34();
        System.out.println("Number of Car instances: " + Car34.getCount());
        Car34 car3 = new Car34();
 
        System.out.println("Number of Car instances: " + Car34.getCount());
		}
}




/*
Number of Car instances: 1
Number of Car instances: 2
Number of Car instances: 3
*/
