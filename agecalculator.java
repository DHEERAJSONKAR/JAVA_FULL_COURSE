//create a program that categorize a person into different age groups.
// child below 13 , teen below 20 , adult below 60 , senior above 60. 



import java.util.Scanner;

public class agecalculator{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to age calculator.");
    System.out.println("Please enter your age:");
    int age=sc.nextInt();
    if(age>=65){
        System.out.println("you are a senior citizen.");
    }else if(age>=20){
        System.out.println("you are a adult.");
    }else if(age>=13){
        System.out.println("you are a teenager.");
    }else{
    System.out.println("you are a child.");
    }

   }
}

