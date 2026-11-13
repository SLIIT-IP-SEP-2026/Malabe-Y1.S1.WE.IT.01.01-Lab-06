import java.util.Scanner;

public class IT26102491Lab6Q3{
	public static void main(String[]arg){
	
	    Scanner input= new Scanner(System.in); //create new scanner object
		
		int number;
		int count=0;
		double sumOfSquares=0;
		double rms;
		
		System.out.print("Enter the positive integers (terminate input with -99):");
		
		while(true){
		    System.out.println("Enter a number:");
			number = input.nextInt();
			
			if(number == -99){
			   break; 
			}
			
			if(number< 0){
			   System.out.println("Invalid input.Please enter a positive integer or -99 to terminate");
			   continue;
			}
			
			sumOfSquares = sumOfSquares +(number * number);
			count++;
			
		}
		
		if(count>0){
		    rms = Math.sqrt(sumOfSquares / count);
			System.out.println("\nThe Root Mean Square (RMS) is:" +rms);
		}
		
	}
}