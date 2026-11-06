import java.util.Scanner;
public class IT26102712Lab6Q2B{
	public static void main (String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter 10 numbers: ");
	int number = 1;
	int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0,num7=0,num8=0,num9=0,num10=0;
	while (number<=10){
	System.out.print("Enter number "+number+" : ");
	if (number==1){
		num1=input.nextInt();
	}else if (number==2){
		num2=input.nextInt();
	}else if (number==3){
		num3=input.nextInt();
	}else if (number==4){
		num4=input.nextInt();
	}else if (number==5){
		num5=input.nextInt();
	}else if (number==6){
		num6=input.nextInt();
	}else if (number==7){
		num7=input.nextInt();
	}else if (number==8){
		num8=input.nextInt();
	}else if (number==9){
		num9=input.nextInt();
	}else{
		num10=input.nextInt();
	}
	number++;
	}
	System.out.print("The numbers you entered are:\n"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9+" "+num10);
	}
}