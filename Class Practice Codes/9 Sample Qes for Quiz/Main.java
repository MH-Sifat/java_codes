//2. Trace any error .if yes, correct the error.
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
 
    int static multiply(int a, int b) {   // static return type er age hobe 
        return a * b;
    }
}
 
public class Main {
    public static void main(string[] args) {  // S caoital String
        MathOperations math = new MathOperations; //MathOperations();
        int sum = math.add(5, 10);
        int product = math.multiply(3, 7);  // ey method ta static tai eta class name diye direct call kora hobe MathOperations.multiply(3,7);
        system.out.println("Sum: " + sum+);  // + hobe nah last e 
        system.out.println("Product: " + product+);  // S capiat System er
    }
}