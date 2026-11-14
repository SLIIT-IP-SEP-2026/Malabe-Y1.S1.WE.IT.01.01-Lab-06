import java.util.Scanner;
public class IT26102199Lab6Q3{
	public static void main(String[] args){
    
		int num = 0;
		int count = 0;
		double sum = 0;
		double square;
		double rms;
		double meansqr;
    
		Scanner input = new Scanner(System.in);
    
		System.out.println("Enter positve integer(terminate input with -99): ");
    
		while (num != -99){
			if (num>=0){
				square = num*num;
				sum = sum+ square;	
				if (num!=0){
				 count = count + 1;
				}
			}
			else{
				System.out.println("Invalid input. PLease enter a positive integer or -99 to terminate.");
			}
      
			System.out.print("Enter a number: ");
			num = input.nextInt();
		}
    
		meansqr=(sum/count);
		rms= Math.sqrt(meansqr);
		System.out.println("The Root Mean Square(RMS) is: "+ rms);
	}	
}
