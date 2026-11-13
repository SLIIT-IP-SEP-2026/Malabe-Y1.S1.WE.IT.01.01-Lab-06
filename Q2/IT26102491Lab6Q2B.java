import java.util.Scanner;

public class IT26102491Lab6Q2B{
	public static void main(String[]arg){
	
	    Scanner input= new Scanner(System.in); //create new scanner object
		
		int number,count;
		count=1;
		String output = "";
		
		System.out.println("Please enter 10 numbers:");
		
		while(count<=10){
		   System.out.print("Enter number" +count+ ": ");
		   number = input.nextInt();
		   output = output + number + " ";
		   count++;
		   
		  
		}
			
			System.out.println("\nThe numbers you entered are:" );
			System.out.println(output);
		
	
		
	}
}