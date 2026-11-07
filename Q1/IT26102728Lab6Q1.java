import java.util.Scanner;

public class IT26102728Lab6Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = input.nextDouble();

        System.out.println();
        System.out.println("The square of " + number + " is : " + (number * number));
        System.out.println("The square root of " + number + " is : " + Math.sqrt(number));

        input.close();
    }
}