// create a program that prints the multiplication table for a given number.
import java.util.*;
class multiplicationtable{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to create a table\n");
        System.out.println("please enter the numer: ");
        int num= sc.nextInt();
        printmultiplicationtable( num);
        
    }
    public static void printmultiplicationtable(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i  + " = "+ (num*i));

        }
    }
}
