
import java.util.Scanner;

// create a program to reverse the digits of a number.
class reverseOFdigit{
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Please enter your number: ");
     int num= sc.nextInt();
     int reverse= reversedigit(num);
     System.out.println("reverse number of digit: " + reverse);
 }
 public static int reversedigit(int num){
    int newnum =0;
    while(num>0){
        int digit = num%10;
        newnum= newnum*10+digit;
        num= num/10;
    }
    return newnum;
    
 }
}