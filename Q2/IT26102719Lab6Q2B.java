import java.util.Scanner;

public class IT26102719Lab6Q2B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int number;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            System.out.println("The numbers you entered are: " + number);

            count++;
        }

        input.close();
    }
}