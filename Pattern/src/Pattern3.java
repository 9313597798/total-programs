//Invert Half Pyramid
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
//        int n=4;
        for(int i=1; i<=n; i++)
        {
          System.out.println();
        for(int j=n; j>=i; j--)
        {
            System.out.print("*");
        }
          
        }
//for(int i=1; i<=4; i++)
//{
////    print a spaces
//    for(int j=1; j<=4-i; j++)
//    {
//        System.out.print(" ");
//        
//    }
//    for(int j=1; j<=i; j++)
//    {
//        System.out.print("*");
//    }
//    System.out.println();
//}
// 
    }
    
}