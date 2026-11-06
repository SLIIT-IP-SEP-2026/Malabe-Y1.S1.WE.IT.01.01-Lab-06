import java.util.Scanner;
public class IT26102712Lab6Q3{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int num=0, square=0, count=0;
		double rms, div;
	System.out.println("Enter positive integers (terminate input with -99)");
	while (num!=-99){
		square=square+(num*num);
		System.out.print("Enter a number: ");
		num=input.nextInt();
	if (num<=0 && num!=-99){
		System.out.print("Invalid input. Please enter a positive integer or -99 to terminate");
		return;
	}
		count=count+1;
	}
	count=count-1;
	div=(double)square/(double)count;
	rms=Math.sqrt(div);
	System.out.print("The Root Mean Square (RMS) is: "+rms);
	}
}