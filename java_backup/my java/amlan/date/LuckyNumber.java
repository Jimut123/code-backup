package date;

import java.io.*;
class LuckyNumber
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n,c,l,j,t,k,a[],b[];
    public void show()throws IOException
    {
        System.out.println("Enter length of array");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int b[]=new int[n];
        j=1;
        for(i=0;i<n;i++)
        {
            a[i]=j;
            j++;
        }
        k=1;c=0;
        for(i=0;i<n;i++)
        {
            t=0;
            for(j=0;j<n;j++)
            {
                if(c<k)
                {
                    b[t]=a[j];
                    t++;
                    c++;
                }
                else
                {
                    c=0;
                }
            }
            n=t;
            for(l=0;l<t;l++)
            {
                a[l]=b[l];
                System.out.print(a[l]+" ");
            }
            System.out.println(" ");
            k++;
            c=0;
        }
    }
    public void main()throws IOException
    {
        show();
    }
}