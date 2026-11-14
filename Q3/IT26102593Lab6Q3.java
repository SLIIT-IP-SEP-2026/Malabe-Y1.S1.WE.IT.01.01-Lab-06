import java.util.Scanner;

public class IT26102593Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sum = 0;
        double rms;

        while (true) {

            System.out.print("Enter a positive number (-99 to stop): ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number <= 0) {
                System.out.println("Invalid input! Enter a positive number.");
                continue;
            }

            sum = sum + (number * number);

            count++;
        }

        if (count > 0) {

            rms = Math.sqrt(sum / count);

            System.out.println("Root Mean Square = " + rms);

        } else {

            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}