import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            int n = (i % 2 == 0) ? i - 1 : i; // number of terms to print
            for (int j = 0; j < n; j++) {
                System.out.print(2 * j + 1);
                if (j != n - 1) System.out.print(", ");
            }
            System.out.println();
        }
        sc.close();
    }
}
