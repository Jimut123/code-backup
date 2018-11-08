package examprac;

import java.io.*;
class binary_search
{
    public static void main(String args[])throws IOException
    {
        int a[] = new int[100],i,l,h,m,j,v,f,n,t;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a term");
        n=Integer.parseInt(br.readLine());
        for (i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Enter a Searching number:");
        v=Integer.parseInt(br.readLine());   
        l=0;
        h=n-1;
        m=(l+h)/2;
        f=0;
        while(l<=h)
        {
            if(a[m]==v)
            {
                f=1;
                break;
            }
            else
            if(v>a[m])
             l=m+1;
            else
            if(v<a[m])
            h=m-1;
            m=(l+h)/2;
        }
        if(f==1)
        System.out.println("Element found.....");
        else
        System.out.println("Element not found...");
    }
}