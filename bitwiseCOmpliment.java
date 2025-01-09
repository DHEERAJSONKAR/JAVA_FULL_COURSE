
import java.util.Scanner;

public class bitwiseCOmpliment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to showing the not/compliment operator;");
        System.out.println("Please enter your number:");
        int num = sc.nextInt();
        int result = ~num;
        System.out.println("your result is:" + result);
    }
    
}
