import java.util.Scanner;

public class ThreeNumberCalculator {
    
    // Method to calculate the product of three floating-point numbers
    public static double calculateProduct(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }
    
    // Method to calculate the division of three floating-point numbers
    public static double calculateDivision(double num1, double num2, double num3) {
        if (num2 == 0 || num3 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2 / num3;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three floating-point numbers
        System.out.print("Enter the first floating-point number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second floating-point number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter the third floating-point number: ");
        double num3 = scanner.nextDouble();
        
        // Calculate product and division
        double product = calculateProduct(num1, num2, num3);
        double quotient = calculateDivision(num1, num2, num3);
        
        // Display results
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
        // Close the scanner
        scanner.close();
    }
}
