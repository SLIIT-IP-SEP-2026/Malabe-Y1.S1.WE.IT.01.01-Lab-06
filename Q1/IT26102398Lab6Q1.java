// Scanner Library
import java.util.Scanner;
// Math Library
// import java.lang.Math;
public class IT26102398Lab6Q1 {
    public static void main (String[] args) {
        // Square Initialization
        double square;
        // Input Initialization
        int number;
        // Input object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        // Square
        square = (double) number * number;
        System.out.print("\nThe square of " + number + " is: " + square);
        System.out.print("\nThe square root of " + number + " is: " + Math.sqrt(number));
    }
}