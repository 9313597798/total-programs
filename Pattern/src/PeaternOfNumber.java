//import java.util.Scanner;
//public class PeaternOfNumber {
//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1; i<=n; i++)
//        {
//         System.out.println();
//            for(int j=1; j<=i; j++)
//            {
//                System.out.print(j);
//                            }
//        }
//        
//
//    }
//    
//}
import java.util.Scanner;
public class PeaternOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
        