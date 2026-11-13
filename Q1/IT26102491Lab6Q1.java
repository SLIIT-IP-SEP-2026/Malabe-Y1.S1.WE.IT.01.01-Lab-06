import java.util.Scanner;

public class IT26102491Lab6Q1{
	public static void main(String[]arg){
	
	    Scanner input = new Scanner(System.in); //create new scanner object
		
		double number;
		double square;
		double squareRoot;
		
		
		    System.out.print("Please enter a number:");
			number =input.nextInt();
			
			square = number * number;
			squareRoot = Math.sqrt(number);
		
		
		System.out.println("The square of "+ number +" is:" +square);
		System.out.println("The square root of "+ number +" is:" +squareRoot);
		
		
    	
		
		
		
	}
}