// java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() . Implement method overloading to allow these operations for integers, doubles
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class _1MathOperOverload {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        System.out.println("Addition of two integers: " + math.add(10, 20));
        System.out.println("Addition of two doubles: " + math.add(5.5, 3.3));
        
        System.out.println("Subtraction of two integers: " + math.subtract(15, 5));
        System.out.println("Subtraction of two doubles: " + math.subtract(8.5, 2.5));
        
        System.out.println("Multiplication of two integers: " + math.multiply(4, 6));
        System.out.println("Multiplication of two doubles: " + math.multiply(2.2, 3.3));
        
        System.out.println("Division of two integers: " + math.divide(20, 4));
        System.out.println("Division of two doubles: " + math.divide(9.0, 3.0));
    }
}
