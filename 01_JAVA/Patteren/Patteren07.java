import java.util.Scanner;

public class Patteren07 {
    public static void main(String[] args) {
        /*
         
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
    *
   ***
  *****
 *******
*********

         */

         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            patteren07(n);
    }

    public static void patteren07(int n) {

        for(int i= 1 ; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k  = 1 ; k <= i;k++){
                System.out.print("*");
             
            }

            for(int l = 1;l<=i-1;l++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    
    }
}
