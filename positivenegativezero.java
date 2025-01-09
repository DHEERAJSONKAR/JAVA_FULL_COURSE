// create a program that determines if a number is positive,negative,zero.
import java.util.Scanner;
public class positivenegativezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.println("Please enter your number:");
        int num =input.nextInt();
        if(num>0){
            System.out.println("your number is positive");
        }else if(num == 0){
            System.out.println("your number is zero");
        }else{
            System.out.println("your number is negative");
        }

    }
    
}
