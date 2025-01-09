import java.util.Scanner;
class mca{
    public static void main(String[] args){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter A Number");
        int num= reader.nextInt();
        if(num%2==0)
        System.out.println(num+ "is even");
        else
        System.out.println(num+ "is odd");

    }
}