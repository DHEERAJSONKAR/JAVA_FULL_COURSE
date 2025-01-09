
import java.util.Scanner;

// create a program to check if a number is an Armstrong number. 
public class Armstrongnum {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number");
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("your number is Armstrong.");
        } else{
            System.out.println("your number is not Armstrong.");
        }
    }
    public static boolean isArmstrong(int num){
        int numcopy =num;
        int numOfdigit=numOfdigit(num);
        int finalNum=0;
        while(num>0){
            int lastdigit = num%10; 
            num = num/10;
            finalNum = finalNum + pow(lastdigit , numOfdigit);

        }
        return finalNum == numcopy;
    }
    public static int pow(int num1 , int num2){
        int result= 1;
        int i=0;
        while(i<num2){
            result = result*num1;
            i++;
        }
        return  result;
    }
    public static int numOfdigit(int num){
        int digit=0;
        while ((num>0)) {
            digit++;
            num/=10;    
        }
        return  digit;
    }
}
