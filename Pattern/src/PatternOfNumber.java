//import java.util.Scanner;
//
//public class PatternOfNumber {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        
//        System.out.println("Enter a number");
//        int num=sc.nextInt();
////        sum=0;
//        
//        
//        for(int i=1; i<=num; i++ )
//        {
////            sum=sum+i;
//            System.out.println();
//        
//       
//        for(int j=1; j<=i; j++)
//        {
//            System.out.print(i+" ");
//        }
//    }
//}
//}
import java.util.Scanner;
public class PatternOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1; i<=n; i++ )
        {
//            sum=sum+i;
            for(int j=1; j<=i
                    ; j++)
            {
                System.out.print(i
                );
            }
            System.out.println();
        }
    }
}