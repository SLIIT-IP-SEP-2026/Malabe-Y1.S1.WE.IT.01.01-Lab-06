import java.util.Scanner;

public class IT26100313Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = "";
        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            numbers = numbers + number + " ";
            i++;
        }

        System.out.println("The numbers you entered are: " + numbers);
    }
}