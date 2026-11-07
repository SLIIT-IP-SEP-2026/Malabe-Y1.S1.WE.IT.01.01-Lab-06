import java.util.Scanner;

public class IT26102728Lab6Q2B {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please Enter 10 Numbers");
	
	int num = 1;
	int [] numbers = new int [10];
	
	
	while (num <= 10) {
		System.out.print("Enter number " + num + ":");
		numbers[num - 1] = input.nextInt();
		num ++;
	}
	
	System.out.println();
	System.out.println("The 10 number are:");
	
	num = 0;
	
	while (num < 10) {
		System.out.print(numbers[num] + " ");
		num ++;
	}
	
	}
	
}

	  