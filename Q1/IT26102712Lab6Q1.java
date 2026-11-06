import java.util.Scanner;
public class IT26102712Lab6Q1{
	public static void main(String[] args){
		double sqRoot, square;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number=input.nextDouble();
		sqRoot = Math.sqrt(number);
		square = Math.pow(number,2);
		System.out.println("The square of "+ number +" is: " + square);
		System.out.print("The square root of "+ number +" is: " + sqRoot);
	}
}