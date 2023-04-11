
public class MagicCalculator extends Calculator {
    
    public double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot find square root of a negative number!");
        }
        return Math.sqrt(num);
    }
    
    public double sin(double num) {
        return Math.sin(num);
    }
    
    public double cos(double num) {
        return Math.cos(num);
    }
    
    public double tan(double num) {
        return Math.tan(num);
    }
    
    public int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot find factorial of a negative number!");
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        // You can create a MagicCalculator object and call its methods here to test them
        MagicCalculator calc = new MagicCalculator();
        System.out.println(calc.add(2, 3)); // Output: 5
        System.out.println(calc.subtract(5, 3)); // Output: 2
        System.out.println(calc.multiply(2, 3)); // Output: 6
        System.out.println(calc.divide(10, 2)); // Output: 5
        System.out.println(calc.square(3)); // Output: 9
        System.out.println(calc.squareRoot(16)); // Output: 4.0
        System.out.println(calc.sin(30)); // Output: -0.9880316240928618
        System.out.println(calc.cos(60)); // Output: -0.9524129804151563
        System.out.println(calc.tan(45)); // Output: 1.6197751905438615
        System.out.println(calc.factorial(5)); // Output: 120
    }
}