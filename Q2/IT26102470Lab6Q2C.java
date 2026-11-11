import java.util.Scanner;

public class IT26102470Lab6Q2C {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = 1;
	int [] numbers = new int [10];
	int sum = 0;
	double average;
	while (num <= 10) {
		System.out.print("Enter number " + num + ":");
		numbers[num - 1] = input.nextInt();
		sum  = sum + numbers[num - 1];
		num ++;
	}
	System.out.println();
	System.out.println("The 10 number are:");
	num = 0;
	while (num < 10) {
		System.out.print(numbers[num] + " ");
		num ++;
	}
	average = sum / 10.0;
	System.out.println();
	System.out.println("Sum of the numbers : " +sum);
	System.out.println("Average of the numbers: " + average);
	}
}