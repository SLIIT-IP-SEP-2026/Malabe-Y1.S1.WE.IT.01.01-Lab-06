import java.util.Scanner;

public class IT26102719Lab6Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;
        double rms;

        System.out.println("Enter positive integers (Terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Please enter a positive integer or -99 to terminate.");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) {
            rms = Math.sqrt(sumOfSquares / count);

            System.out.println("Number of values entered = " + count);
            System.out.println("The Root Mean Square(RMS)is = " + rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}