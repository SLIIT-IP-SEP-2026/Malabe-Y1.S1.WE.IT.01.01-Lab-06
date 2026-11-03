// Scanner Library
import java.util.Scanner;
public class IT26102398Lab6Q2B {
    public static void main (String[] args) {
        // Counter controll Loop
        int int_Number, number = 1;
        System.out.println("Please enter 10 numbers:");
        // Input Object
        Scanner input = new Scanner(System.in);
        // Iteration
        while (number < 11) {
            System.out.print("Enter number " + number + ": ");
            int_Number = input.nextInt();
            number++;
        }
    }
}