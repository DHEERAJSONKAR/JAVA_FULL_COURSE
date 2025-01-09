
// create a program that determines of a given year a leap year.
//(consedring conditions like divisible by 4 but not 100, unless also divisible by 400).
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator");
        System.out.println("Please enter the year that you want to check:");
        int year = sc.nextInt();
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 == 0)){
            System.out.println("your year is leap year.");
        }else{
            System.out.println("your year is not leap year.");
        }
    }
    
}
