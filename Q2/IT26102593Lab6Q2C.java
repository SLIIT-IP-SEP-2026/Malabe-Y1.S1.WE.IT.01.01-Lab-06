import java.util.Scanner;

public class IT26102593Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 1;
        int number;
        int sum = 0;
        double average;

        while (i <= 10) {

            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            sum = sum + number;

            i++;
        }

        average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}