
import java.util.Scanner;

// create a program that computes the sum of digit of an integer.
public class sunOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to sum of digit calculator");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of the digit: " + sum);
    }
    public static int sumOfDigit( int num){
        int sum =0;
        while(num>0){
            sum= sum+ (num%10);
            num= num/10;
        }
        return sum;
    }
}
