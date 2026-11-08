import java.util.Scanner;
public class IT26102742Lab6Q1{
	public static void main(String[] args){
	    double num;
		double square;
		double sqroot;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = input.nextDouble();
		square = num*num;
		sqroot = Math.sqrt(num);
		System.out.println("The square of 25.0 is : "+ square);
		System.out.println("The square root of 25.0 is: "+ sqroot);
	}	
}