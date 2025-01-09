
import java.util.Scanner;

 // create a program to verify if a number is a palindrome. 
 public class palindrome {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to palindrone");
        System.out.println("enter your number:");
         int num = sc.nextInt();
         boolean isPalindrome = isPalindrome(num);
         if(isPalindrome){
            System.out.println("your number is a palindrome num.");
         }else{ 
            System.out.println("your number is not palindrome num.");
         }
    }
    public static boolean  isPalindrome( int num){

        return num==reverse(num);

    }
    @SuppressWarnings("UnusedAssignment")
    public static int reverse( int num){
        int newnum = 0;
        while(num>0){
            int digit= num%10;
             newnum =newnum*10+digit;
             num /= 10;
        }
        return  newnum;
    }
}
