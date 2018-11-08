import java.util.*;
class I_hate_you
{
    public static void main()
    {
        int a,j,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter term:");
        n=sc.nextInt();
        for(a=1;a<=n;a++)
        {
        for(j=1;j<=a;j++)
        System.out.print("*");
        System.out.println("");
    }
    }
}