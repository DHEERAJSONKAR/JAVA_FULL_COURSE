
import java.util.Scanner;

// create a program to print the fibonacci series up to a certain number.
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to create fibnacci series");
        System.out.println("Please enter the number up to which series has to be printed : ");
        int num = sc.nextInt();
        System.out.println("Here is the fibnacci series: ");
        fibnacci(num);
    }

    public static void fibnacci(int num) {
        if (num < 0)
            return;
        System.out.println("0 ");
        if (num == 0)
            return;
        System.out.println("1 ");
        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }

}
