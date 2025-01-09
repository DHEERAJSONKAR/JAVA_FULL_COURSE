
import java.util.Scanner;

public class ArraySearching { 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr= {3,4,5,67,23,45,667,343,56,78};
        System.out.println("Welcome to Array Searching\n");
        System.out.println("Enter the number you want to search:");
        int num= sc.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("your number was found in array.");
        }else{
            System.out.println("your number was not found in array.");
        }
    }
    public static boolean  isFound(int[] arr , int num){
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == num){
                return true;
            }
        }
        return false;
    }
    
}
