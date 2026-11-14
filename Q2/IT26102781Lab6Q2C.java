import java.util.Scanner;

public class IT26102781Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Please enter 10 numbers:");

        int i = 0;
        int sum = 0;

        while (i < 10) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum = sum + numbers[i];
            i++;
        }
        System.out.println("The numbers you entered are:");
        int j = 0;
        while (j < 10) {
            System.out.print(numbers[j] + " ");
            j++;
        }
        System.out.println();
        double average = (double) sum / 10;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}