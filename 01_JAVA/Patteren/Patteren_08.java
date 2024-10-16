import java.util.Scanner;
public class Patteren_08 {

    public static void main(String[] args) {
        /*
         * Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



*********
 *******
  *****
   ***
    *
         */

         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            patteren08(n);

    }

         private static void patteren08(int n) {

            // for(int i= n ; i>=1;i--){
            //     for(int j=1;j<=n-i;j++){
            //         System.out.print(" ");
            //     }
            //     for(int k  = 1 ; k <=2* i-1;k++){
            //         System.out.print("*");
                 
            //     }
    
            //     // for(int l = 1;l<=i-1;l++){
            //     //     System.out.print("*");
            //     // }
    
            //     System.out.println();
            // }           


            for (int i = n; i >=1; i--) {
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
