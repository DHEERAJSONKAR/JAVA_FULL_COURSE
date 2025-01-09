
import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        // int num = 1;  // initialization
        // while(num<=10){  // condition
        //     System.out.println(num);  // actuala work
        //     num++;   //updation
        // }


        // int count = 500;
        // while(count>=200){
        //     System.out.println(count);
        //     count--;
        // }
        Scanner sc= new Scanner(System.in);
        int i=0;
        while(i<6){
            int num =sc.nextInt();
            System.out.println("your number is:" + num);
            i++;
        }
    }
    
}
