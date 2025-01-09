
import java.util.Scanner;

// create a program to find the least common multiple (LCM) of two numbers. 
public class LCM {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to LCM of two number;");
        System.out.print("Please enter your first number:");
        int first= sc.nextInt();
        System.out.print("please enter your second number:");
        int second =sc.nextInt();
        System.out.print("please enter your third number:");
        int third =sc.nextInt();
        System.out.println("LCM of the three number is: " +lcm(first, second, third));
    }
    public static int lcm(int first , int second , int third){
        int i = 1;
        while(i<=third){
            int factor = first * second * i;
            if(factor% third == 0){
                return  factor;
                
            }
            i++;
        }
        return 0; // unreachable
    }

    
}
