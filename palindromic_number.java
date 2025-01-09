public class palindromic_number {
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++){
            //space
            int space=n-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            // 1st half number backword
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half number forward
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
