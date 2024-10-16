import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any
         * value of N. Let's say for N = 5, the pattern should look like as below:
         *
         **
         ***
         ****
         ***** 
         */
        System.out.println("enter the number of rows or (n) you want ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        patteren(n);
    }

    public static void patteren(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
