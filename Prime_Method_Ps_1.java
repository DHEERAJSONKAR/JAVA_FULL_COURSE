import java.util.Scanner;
public class Prime_Method_Ps_1{
    public static void main(String[] args) {
        int n;
        int count=0;
        System.out.println("Enter The number ");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
             if(count==2){
        System.out.println("Prime Number");
    }
        else{
        System.out.println("Not Prime Number");
        }

        

    }
}
