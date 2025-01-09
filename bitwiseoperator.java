
import java.util.Scanner;

// create a program that shows bitwise AND of two numbers.
public class bitwiseoperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("showing the bitwise AND operator.");
        System.out.println("Please enter the first number:");
        int first = sc.nextInt();
        System.out.println("NOw, enter the second number:");
        int second = sc.nextInt();
        int sum = first & second ;
        System.out.println("the sum is :" + sum);
    }
    
}
