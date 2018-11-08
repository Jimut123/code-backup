import java.util.*;
class series2
{
    public static void main (String args[])
    {
    int j, i;
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter the limit: ");
    int n = SC.nextInt();
    for(i=1;i<=n;i++)
    {
        int k=97;
        for(j=1;j<=i;j++)
       {System.out.print((char)k);
           k++;
        }
        System.out.println("");
    }
}
}