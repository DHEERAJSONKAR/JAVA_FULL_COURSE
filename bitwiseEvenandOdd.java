
import java.util.Scanner;

// write a program to check of a given number is even or odd using bitwise operators.
public class bitwiseEvenandOdd {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);   
        System.out.println("Welcome to even or odd using bitwise operator;");
        System.out.println("Please enter your number is:");
        int num =sc.nextInt();
        if((num & 1) == 1){
            System.out.println("your number is odd.");
        }else{
            System.out.println("your number is even.");
        }

    }
    
}
