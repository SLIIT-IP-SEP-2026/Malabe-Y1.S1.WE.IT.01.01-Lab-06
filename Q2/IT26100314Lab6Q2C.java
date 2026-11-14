import java.util.Scanner;

public class IT26100314Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            numbers[count - 1] = input.nextInt();

            sum = sum + numbers[count - 1];

            count++;
        }

        double average = sum / 10.0;

        System.out.println();
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        
    }
}
