import java.util.Scanner;

public class TimeCom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.println("i: " + i + ", j: " + j);
            }
        }
    }

}
