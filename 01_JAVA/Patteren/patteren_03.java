import java.util.Scanner;

public class patteren_03 {
    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any
         * value of N. Let's say for N = 5, the pattern should look like as below:
         * 1
         * 
         * 12
         * 
         * 123
         * 
         * 1234
         * 
         * 12345
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows or (n) you want ");
        int n = sc.nextInt();
        patteren(n);
    }

    public static void patteren(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
