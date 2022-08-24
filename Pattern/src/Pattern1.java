//import java.util.Scanner;
//
//public class Pattern1 {
//    public static void main(String[] args) 
//    {
////        outer loop
//        for(int i=0; i<=4; i++)
//        { System.out.println();
//            
//            
////            inner loop
//            for(int j=0; j<=4; j++)
//            {
//                System.out.print("*");
//            }
//            
//                           
//
//        }
//    }
//    
//}
import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=4; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}