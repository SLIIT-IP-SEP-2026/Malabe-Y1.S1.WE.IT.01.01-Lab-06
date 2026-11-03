import java.util.Scanner;
public class IT26102398Lab6Q3 {
    public static void main (String[] args) {
        // Positive Number
        int positive_Int, sigma;
        int number = 0;
        int add = 0;
        double rms;
        // Input 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integers (terminate input with -99)");
        // Iteration
        while (true) {
            System.out.print("Enter a number: ");
            positive_Int = input.nextInt();
            // Termination
            if (positive_Int == -99) {
                break;
            } 
            // Positive or Negative
            if (positive_Int < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            }
            else {
                sigma = positive_Int * positive_Int;
                add += sigma;
                number++;
            }
        }
        // RMS
        rms = Math.sqrt((double)add / number);
        System.out.print("\nThe Root Mean Square (RMS) is: " + rms);
    }
}