import java.util.Scanner;

public class IT26100568Lab6Q1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		
		double square = num * num;
		double squareRoot = Math.sqrt(num);
		
		System.out.println("The square of the number is :" + square);
		System.out.println("The square root of the number is :" + squareRoot);
		
	}
	
}
