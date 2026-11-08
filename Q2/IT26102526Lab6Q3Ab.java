import java.util.Scanner;

public class IT26102526Lab6Q3Ab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        int sum = 0;
        
        System.out.println("Please enter 10 numbers:");
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            
            sum += number;
            count++; //posfix
        }
        
        double average = (double) sum / 10;
        System.out.println();
        
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
        
        input.close();
    }
}
