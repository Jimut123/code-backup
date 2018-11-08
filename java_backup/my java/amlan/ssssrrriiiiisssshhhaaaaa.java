import java.util.*;
class pattern
{
    public static void main(String s[])
    {
        int i, j; 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two variables");
        i=sc.nextInt();
        j=sc.nextInt();
        for(i=1;i<=5; i++)
        {
            for(j=1;j<=i; j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    