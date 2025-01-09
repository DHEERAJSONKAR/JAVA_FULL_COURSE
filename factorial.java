
import java.util.Scanner;

// write a function that calculates the factorial of a given number.
public class factorial {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial number of program;");
        System.out.println("Enter the number: ");
        int num =sc.nextInt();
         System.out.println("Factorial is: " + printfactorial(num)); 
    }
    public static long printfactorial(int num){
        if(num<2){
            return 1;
        }
        long fact= 1                             ;
        for( int i=2; i<=num; i++){
            fact= fact*i;
        } 
        return fact;
    }
    
}
