import java.util.*;
class Series2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int i,j;
        for(i=0;i<s.length();i++)
        {
            for(j=i;j<s.length();j++)
            System.out.print(s.charAt(j));
            System.out.println("");
        }
    }
}