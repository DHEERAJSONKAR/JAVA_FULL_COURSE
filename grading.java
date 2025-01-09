// create a program that calculates grades based on marks. A above 90% , B above 75% , C above 60%
// D above 30% , F below 30%.
import java.util.Scanner;
public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome your grading calculator");
        System.out.println("Please enter your percentage:");
        float percentage =sc.nextFloat();
        if(percentage>=90){
            System.out.println("Great, you hava got A");
        }else if(percentage>=75){
            System.out.println("Good, you have got B");
        }else if(percentage>=60){
            System.out.println("you have got C, Work harder next time");
        }else if(percentage>=30){
            System.out.println("you have got D, you seriously need to work harder");
        }else{
            System.out.println("Sorry, you have fail the test, you have got F");
        }
    }
    
}
