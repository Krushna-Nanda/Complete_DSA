import java.util.Scanner;

public class Patteren06 {
    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any
         * value of N. Let's say for N = 5, the pattern should look like as below:
         * 
         * 12345
         * 1234
         * 123
         * 12
         * 1
         * 
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        patteren06(n);

    }

    public static void patteren06(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
