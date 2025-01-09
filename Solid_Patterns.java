public class Solid_Patterns {
    public static void main(String[] args) {
        int n = 5;
        int m = 20;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.err.println();
        }

    }

}
