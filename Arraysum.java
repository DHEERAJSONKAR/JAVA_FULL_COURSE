// create a program to find the sum and average of all elements in an array.

import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome to find the sum and average of all element\n");
            System.out.println("pleasr enter the number of elements: ");
            int size = sc.nextInt();
            int[] nums = new int[size];
            int i = 0;
            while (i < size) {
                System.out.print("Please enter element no" + (i + 1) + ":");
                nums[i] = sc.nextInt();
                i++;
            }
            // return nums;
            long sum = sum(nums);
            double Average = Average(nums);
            System.out.println("Sum of the number is: " + sum);
            System.out.println("Average of the number is: " + Average);
        }

    }

    public static long sum(int[] numarray) {
        long sum = 0;
        int i = 0;
        while (i < numarray.length) {
            sum = sum + numarray[i];
            i++;
        }
        return sum;
    }

    public static double  Average(int[] numarray) {
        long sum = sum(numarray);
        return  (sum / numarray.length);
    }

}
