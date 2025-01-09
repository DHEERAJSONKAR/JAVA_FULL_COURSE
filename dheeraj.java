
import java.util.Scanner;
public class dheeraj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number");
        int row=sc.nextInt();
        System.out.println("enter the colum number");
        int colum=sc.nextInt();
        System.out.println("enter the number of row and colum matrix");
        int[][]number=new int[row][colum];
        for (int i = 0; i <row; i++) {
            for( int j=0; j<colum; j++){
                number[i][j]=sc.nextInt();
            }
        
        }
        int x=sc.nextInt();
        for (int i = 0; i <row; i++) {
            for( int j=0; j<colum; j++){
                if(number[i][j]==x){
                    System.out.println("x the found("+ i + "," + j + ")");
                }
            }
        }
    }
    
}
