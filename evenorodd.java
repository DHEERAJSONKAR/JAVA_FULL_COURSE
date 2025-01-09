// create a program that determines if a number is odd or even.
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to odd or even calculator ");
        System.out.println("Please enter your number:");
        int num = sc.nextInt();
        if(num %2==0){
            System.out.println("your number is a even.");
        }else{
            System.out.println("your number is a odd.");
        }

    }
    
}
