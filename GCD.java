
import java.util.Scanner;

// create a program to find the greatest common divisor(GCD) of two number.
public class GCD {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Welocme to GCD of two number;");
        System.out.println("please enter the first number:");
        int first = sc.nextInt();
        System.out.println("Now, enter the second number:");
        int second = sc.nextInt();
        System.out.println("GCD of the two number: " + gcd(first, second));
    }

    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}
