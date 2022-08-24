import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            for(int j=1; j<=num-i; j++)
            {
                System.out.print(" ");
            if(i%2==0)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(i);
            }
            
                
            }
            System.out.println();
        }
    }
}
