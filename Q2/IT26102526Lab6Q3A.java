public class IT26102526Lab6Q3A {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        
        while (i <= 10) {
            sum += i;
            i++;
        }
        
        double average = (double) sum / 10;
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
        System.out.println("The average of numbers from 1 to 10 is: " + average);
    }
}
