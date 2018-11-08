import java.io.*;
class Random1
{
    public static void main()throws IOException
    {
        int a[]=new int[10];
        int i,k=0,j,t,c=0,k1;
        for(i=0;i<10;i++)
        {
            k=(int)(i*Math.random());
            if(k>=1 && k<=6)
            {
                a[c++]=k;
            }
        }
        System.out.println("Before changing....");
        for(i=0;i<c;i++)
        System.out.println(a[i]);
        t=0;
        for(i=1;i<=6;i++)
        {
            for(j=0;j<k;j++)
            {
                if(a[j]==i)
                {
                    k1=a[t];
                    a[t]=a[j];
                    a[j]=k1;
                    t++;
                    break;
                }
            }
            
        }
        System.out.println("After changing....");
        for(i=0;i<t;i++)
        System.out.println(a[i]);
    }
}


