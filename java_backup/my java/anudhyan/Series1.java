import java.util.*;
class Series1
{
    public static void main(String args[])
    {
        int i,j;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<=i;j++)
            System.out.print(s.charAt(j));
        System.out.println("");
    }
}
}