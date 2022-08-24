import java.util.Scanner;
public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         char c=sc.next().charAt(0);
        for(char i='a'; i<=c; i++)
        {
            for(char j='a'; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
// char c=sc.next().charAt(0);\
//char c=sc.next().charAt(0);