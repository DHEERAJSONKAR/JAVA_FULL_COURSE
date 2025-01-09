import java.util.Scanner;
class subject{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your physics marks");
        int physics=scan.nextInt();
        System.out.println("enter your english marks");
        int english=scan.nextInt();
        System.out.println("enter your math marks");
        int math=scan.nextInt();
        System.out.println("enter your chemistry marks");
        int chemistry=scan.nextInt();
        System.out.println("enter your science marks");
        int science=scan.nextInt();
        float percentage=((physics+english+math+chemistry+science)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);

    }
}