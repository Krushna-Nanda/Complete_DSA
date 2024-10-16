import java.util.Scanner;

public class Patteren04 {
    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any
         * value of N. Let's say for N = 5, the pattern should look like as below:
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows or (n) you want ");
        int n = sc.nextInt();
        patteren(n);
    }

    public static void patteren(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

    }

}
