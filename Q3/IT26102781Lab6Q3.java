import java.util.Scanner;

public class IT26102781Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter positive integers (terminate input with -99):");
        int sumSquares = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number == -99) {
                break;
            }
            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {

                sumSquares = sumSquares + (number * number);
                count++;
            }
        }
        if (count > 0) {
              double division = (double) sumSquares / count;
            double rms = Math.sqrt(division);

            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        }
    }
}