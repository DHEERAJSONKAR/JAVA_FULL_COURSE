// print x^n (stack height =n)
public class recursion_1 {
    public static int xpower(int x, int n){
        if(n==0){   //base case 1
            return 1;
        }
        if(x==0){     //base case 2 
            return 0;

        }
        int xnum=xpower(x,n-1);
        int xnum1=x* xnum;
        return xnum1;
    }
    public static void main(String[] args) {
        int x=2, n=7;
        int ans=xpower(x,n);
        System.out.println(ans);
    }
    
}
