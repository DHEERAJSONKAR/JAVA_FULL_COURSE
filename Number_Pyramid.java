
import javax.sound.sampled.SourceDataLine;

public class Number_Pyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
             System.out.print(i);
             System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
