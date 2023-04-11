public class Calculator {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
    
    public int square(int num1) {
        return num1 * num1;
    }
    
    public static void main(String[] args) {
        // You can create a Calculator object and call its methods here to test them
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3)); // Output: 5
        System.out.println(calc.subtract(5, 3)); // Output: 2
        System.out.println(calc.multiply(2, 3)); // Output: 6
        System.out.println(calc.divide(10, 2)); // Output: 5
        System.out.println(calc.square(3)); // Output: 9
    }
}
