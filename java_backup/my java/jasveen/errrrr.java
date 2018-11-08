import java.util.*;
class errrrr
{
    public static void main(String args[])
    {
        int n,k,j,i,f;double s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        s=0;
        k=1;
        j=1;
        f=1;
        for(i=1; i<=n; i++)
       
        {
            for(k=1; k<=j; k++)
            f=f*k;
            s=s+Math.pow(j,j)/((double) f)*k;
            j=j+2;
            k=k*(-1);
        }
        System.out.println(s);
    }
}