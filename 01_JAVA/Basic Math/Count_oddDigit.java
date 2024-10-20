import java.util.Scanner;
public class Count_oddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {

            int dg = n%10;

            // if (dg % 2 !=0) {
            //     count++;
            // }

            if (dg % 2 == 1) 
                count++;
            
      

            n/=10;
            
        }

        System.out.println(count);
    }
    
}
