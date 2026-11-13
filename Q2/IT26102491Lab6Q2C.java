import java.util.Scanner;

public class IT26102491Lab6Q2C{
	public static void main(String[]arg){
	
	    Scanner input= new Scanner(System.in); //create new scanner object
		
		int number,count,sum;
		count=1;
		String output = "";
		sum = 0;
		double avg;
		
		System.out.println("Please enter 10 numbers:");
		
		while(count<=10){
		   System.out.print("Enter number" +count+ ": ");
		   number = input.nextInt();
		   output = output + number + " ";
		   sum = sum + number;
		   count++;
		   
		  
		}
			avg = sum /10.0;
			
			System.out.println("\nThe numbers you entered are:" );
			System.out.println(output);
		
	        System.out.println("\nSum of the numbers:" +sum);
			System.out.println("Average of the number:" +avg );
		
	}
}