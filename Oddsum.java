
import java.util.Scanner;

// create a program to sum all odd number from 1 to a specified number N.
public class Oddsum {
    public static void main(String[] args) {
        
            @SuppressWarnings("resource")
            Scanner input= new Scanner(System.in);
            System.out.println("welcome to sum all odd number\n");
            System.out.println("Enter the number:");
            int num= input.nextInt();
            int sum = oddsum(num);
            System.out.println("oddsum till " + num + " is: " + sum);
    }  
    public static int oddsum(int num){
        int sum =0;
        int i= 1;
        while(i<=num){
            sum+=i;
            i+=2;

        }
        return sum;
    }   
}
