import java.util.Scanner;

	public class IT26102060Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
        double num = input.nextDouble();
		
        double square = num * num;
        double sqrt = Math.sqrt(num);
		
        System.out.print(" The square of "+  num  + " is : " + square);
        System.out.print(" The square root of "+  num  + " is : " + sqrt);
		
		input.close();
		
	}
	
	}