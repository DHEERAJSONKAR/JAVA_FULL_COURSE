// create a program to check whether a given number is prime.

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to prime number;\n");
        System.out.println("Please enter your number : ");
        int num= sc.nextInt();
        boolean isprime= printprime(num);
        if(isprime){
            System.out.println("your number is prime.");
        }else{
            System.out.println("your number is not prime.");
        }
    }
    public static boolean  printprime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
              return false;
            }
        }
        return true;
    }
    
}
