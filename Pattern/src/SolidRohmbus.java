
import java.util.Scanner;

public class SolidRohmbus {

    public static void main(String[] args) {
        int i;
        int j;
//        outer loop
        for (i = 1; i <= 5; i++);
        {
//            print space
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

//                print Star
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
