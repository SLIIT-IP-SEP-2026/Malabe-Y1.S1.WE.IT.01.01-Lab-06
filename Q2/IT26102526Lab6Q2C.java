import java.util.Scanner;

public class IT26102526Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        int sum = 0;
        String numbersEntered = ""; 
        
        System.out.println("Please enter 10 numbers:");
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            
            sum += number;
            numbersEntered += number + " "; 
            count++;
        }
        
        double average = (double) sum / 10;
        
        System.out.println();
        
        System.out.println("The numbers you entered are:");
        System.out.println(numbersEntered);
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
        input.close();
    }
}
