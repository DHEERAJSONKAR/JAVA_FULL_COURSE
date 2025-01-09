
// take a matrix as input from the user. Search for a given number x and print the indces at which it occurs. 
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class TwoD_Array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the row number");
    int rows=sc.nextInt();
    System.out.println("Enter the colum number");
    int colums=sc.nextInt();
    System.out.println("enter the number of row and colunm matrix");
    int number[][]=new int[rows][colums];
    //System.out.println("enter the number of row and colunm matrix");
    for(int i=0; i<rows; i++){
        
        for(int j=0; j<colums; j++){
            
            number[i][j]=sc.nextInt();
        }
    }
    
    int x=sc.nextInt();
        for( int i=0; i<rows; i++){
            for(int j=0; j<colums; j++){
                if(number[i][j]==x){
                    System.out.println("x found at location (" + i + ", "+ j + ")");
                }
            }
        }
      }

}

