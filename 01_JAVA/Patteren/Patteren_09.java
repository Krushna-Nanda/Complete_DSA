public class Patteren_09 {
    public static void main(String[] args) {
        
        //print a diamond pattern

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces and stars in a single loop
            for (int j = 1; j <= n + i - 1; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // Print spaces and stars in a single loop
            for (int j = 1; j <= n + i - 1; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }



       

    }
}
