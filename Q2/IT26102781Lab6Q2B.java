import java.util.Scanner;

public class IT26102781Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Please enter 10 numbers:");
        int i = 0;
        while (i < 10) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }
        System.out.println("The numbers you entered are:");
        int j = 0;
        while (j < 10) {
            System.out.print(numbers[j] + " ");
            j++;
        }
        System.out.println();
    }
}