
public class PolindromicPattern {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
//            print a space
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
//          first half number 
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

//      second half number
//            for (int j = 2; j <= i; j++) 
//            {
//                System.out.print(j);
//            }
            System.out.println();
        }
    }
}
