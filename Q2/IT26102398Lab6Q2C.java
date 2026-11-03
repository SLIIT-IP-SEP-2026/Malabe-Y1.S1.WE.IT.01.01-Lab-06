// Scanner Library
import java.util.Scanner;
public class IT26102398Lab6Q2C {
    public static void main (String[] args) {
        // Counter controll Loop
        int int_Number, sum = 0, number = 1;
        double average;
        System.out.println("Please enter 10 numbers:");
        // Input Object
        Scanner input = new Scanner(System.in);
        // Iteration
        while (number < 11) {
            System.out.print("Enter number " + number + ": ");
            int_Number = input.nextInt();
            // Sum
            sum += int_Number;
            // Increment
            number++;
        }
        average = sum / number * 1.0;
        System.out.print("\nSum of the number: " + sum);
        System.out.print("\nAverage of the number: " + average);
    }
}