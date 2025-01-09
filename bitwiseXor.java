
import java.util.Scanner;

public class bitwiseXor {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("showing bitwise XOr operator;");
        System.out.println("Please enter the first number:");
        int first = sc.nextInt();
        System.out.println("Now, enter the second number:");
        int second = sc.nextInt();
        int result = first ^ second;
        System.out.println("result is: " + result);
    }
    
}
