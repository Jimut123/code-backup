import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner Sc= new Scanner(System.in);
        int n,k,s=0;
        System.out.println("Enter any no.");
        n=Sc.nextInt();
        while (n>0)
        {
            k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        System.out.println(s);
    }
}
