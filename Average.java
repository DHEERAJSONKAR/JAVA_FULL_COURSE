//enter three number from the user & make a function to print their average
/*import java.util.Scanner;
public class Average {
    public static int printaverage(int a, int  b, int c){
        return(a+b+c)/3;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The first Number");
    int a=sc.nextInt();
    System.out.println("Enter The Second Number");
    int b=sc.nextInt();
    System.out.println("Enter The Third NUmber");
    int c=sc.nextInt();
    System.out.println("The Sum Value Is :"  +(a+b+c));
    System.out.println("The Average Value Is :"+printaverage(a,b,c));
    
    } 
}
*/





import java.util.Scanner;
class Average{
    public static void main(String[] args) {
        System.out.println("Enter The Number Is :");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){          
            if(n%2==0|| n%2==1){
                sum=sum+i;
            }
            System.out.println("Sum Of Odd Number"+sum);
        }
        
    }
}