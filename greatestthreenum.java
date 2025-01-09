
// create a program that determines the greatest of the three numbers.
import java.util.Scanner;

public class greatestthreenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to greatest three number");
        System.out.println("please enter your  first number:");
        int first=sc.nextInt();
        System.out.println("enter your second number:");
        int second=sc.nextInt();
        System.out.println("now, enter your third number:");
        int third =sc.nextInt();
        if(first >= second && first >= third){
            System.out.println(first + " is the greatest number.");
        }else if(second>=third){
            System.out.println(second + " is the greatest number.");
        }else{
            System.out.println(third + " is the greatest number.");
        }

    }
    
}
