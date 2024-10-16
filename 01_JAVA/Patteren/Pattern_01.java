import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any
         * value of N. Let's say for N = 5, the pattern should look like as below:
         *****
         *****
         *****
         *****
         ***** 
         */
        System.out.println("enter the no :--");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);

    }

    public static void pattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}