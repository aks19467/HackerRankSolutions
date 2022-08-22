import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                      // N  is an intiger input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {  //for printing *
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {   //for spacing
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {                                         //Half Butterfly
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {                         //Second half butterfly
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
