import java.util.*;
class CR7
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a[];
        int i,j,n,m,s=0,f,k;
        n=Sc.nextInt();
        a=new int [n];
        for(i=0;i<n;i++)
        a[i]=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            j=a[i];
            while(j>=0)
            {
                m=j%10;
                f=1;
                for(k=1;k<=m;k++)
                f=f*k;
                s=s+s;
                j=j/10;
            }
            if(s==a[i])
            System.out.println(a[i]);
        }
    }
}
