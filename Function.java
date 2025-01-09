// import java.util.*;
// public class Function {
//     public static void printMyName(String Name){
//         System.out.println(Name);
//          return;
//     }
//     public static void main(String[] args) {
//         Scanner cs= new Scanner(System.in);
//         String Name=cs.next();
//         printMyName(Name); // call the function
//     }
    
// }



//make a function to add two number and return the sum.
/*import java.util.Scanner;
public class Function{
public static int claculateSum(int a, int b){
    int sum=a+b;
    return sum;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=claculateSum(a,b);
    System.out.println("The Sum Of Two Number Is :"+sum);

}
}*/



// make a function to product two number and return the product.
/*import java.util.Scanner;
public class Function{ 
    public static int calculateProduct(int a, int b){
        int Product=a*b;
        return Product;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Product=calculateProduct(a,b);
        System.out.println("The Product of Two Number Is :"+Product);
    }
}
*/




// find the factorial number
import java.util.Scanner;
class Function{
    public static void printfactorial(int n){
         int factorial=1; 
         if(n<0){
            System.out.println("Invalid Number");
            return;
         }
         for(int i=n; i>=1; i--){
            factorial=factorial*i;
         }
         System.out.println("The Factorial Number Is:"+factorial);
 return;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    printfactorial(n);
} 
}