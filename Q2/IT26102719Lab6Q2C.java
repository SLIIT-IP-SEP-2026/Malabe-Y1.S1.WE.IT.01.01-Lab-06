import java.util.Scanner;

public class IT26102719Lab6Q2C {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int number;
        int sum = 0;
        double average;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            sum += number;
            count++;
        }

        average = (double) sum / 10;

        System.out.println("Sum of the numbers = " + sum);
        System.out.println("Average of the numbers = " + average);

        input.close();
    }
}