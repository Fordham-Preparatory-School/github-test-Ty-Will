import java.util.Scanner;
public class NestedLoopsProject {
    public static void main(String[] args) 
    {
        Scanner input1 = new Scanner(System.in);
        asteriskTriangle(input1.nextInt());


        
    }
    public static void asteriskTriangle(int numberOfLines)
    {
        for (int i = 1; i <= numberOfLines; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (j == 0 || j == i-1 || i == numberOfLines)
                {
                    System.out.print("*");
                }
                else 
                { 
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }
    }
}
