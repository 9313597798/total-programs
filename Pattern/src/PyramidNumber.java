
import java.util.Scanner;

public class PyramidNumber {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
//         spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
//         number - print row no, row no times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
