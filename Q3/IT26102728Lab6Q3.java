import java.util.Scanner;

public class IT26102728Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;

        System.out.println(
            "Enter positive integers (terminate input with -99):"
        );

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        while (number != -99) {
            if (number > 0) {
                sumOfSquares += (double) number * number;
                count++;
            } else {
                System.out.println(
                    "Invalid input. Please enter a positive integer or -99 to terminate"
                );
            }

            System.out.print("Enter a number: ");
            number = input.nextInt();
        }

        System.out.println();

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No positive integers were entered.");
        }

        input.close();
    }
}