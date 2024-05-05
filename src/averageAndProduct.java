import java.util.Scanner;

public class averageAndProduct {

    //Method to calculate the average of three floating-point numbers
    public static double calculateAverage(double num1, double num2, double num3){
        double average = (num1 + num2 + num3) / 3;
        return average;
    }    

    //Method to calculate the product of three floating-point numbers
    public static double calculateProduct( double num1, double num2, double num3){
        double product = num1 * num2 * num3;
        return product;
    }

    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three floating-point number
        System.out.println("Enter the First floating-point number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the Second floating-point number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter the Third floating-point number: ");
        double num3 = input.nextDouble();

        //Calculate product and division
        double average = calculateAverage(num1, num2, num3);
        double product = calculateProduct(num1, num2, num3);

        //Display results
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);

        //Close the scanner
        input.close();
    }      
}
