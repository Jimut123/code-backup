import java.util.*;
class Patterns
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter String:");
        s=sc.nextLine();
        int i,j;
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<=i;j++)
            System.out.print(s.charAt(j));
            System.out.println("");
        }
    }
}