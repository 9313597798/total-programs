import java.util.Scanner;
public class SolidRhombus 
{
    public static void main(String[] args) 
    {
//        outer loop
        for(int i=1; i<=5; i++)
        {
          
//            print space 

            int space=(5-i);
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
                for(int  j=1; j<=5; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}

