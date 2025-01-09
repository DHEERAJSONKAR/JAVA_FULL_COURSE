import java.util.Scanner;
public class logical { 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator: ");
        System.out.println("Please enter your age: ");
        int age= input.nextInt();
        System.out.println("Are you a female? (true/false) ");
        boolean isFemale= input.nextBoolean();
        if(age<5){
            System.out.println("you got a 75% discount");

        }else if (isFemale) {
            System.out.println("you got a 50% discount");
            
        }else if(age>60 && !isFemale){
            System.out.println("you got a 25% discount");
        }else{
            System.out.println("you got no discount");
        }

    }
    
}
