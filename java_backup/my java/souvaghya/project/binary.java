package project;

import java.io.*;
class binary
{
    public  void main1()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements into the Array:");
        int n,i,s,low,high,mid,f,pos,j,t;
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        for(i=0;i<n-1;i++)
        {
            pos=i;
            for(j=i+1;j<n;j++)
            if(a[j]<a[pos])
            {
                pos=j;
            }
            t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        s=Integer.parseInt(br.readLine());
        System.out.println("Enter searching element:"+s);
        low=0;
        high=n-1;
        mid=(low+high)/2;
        f=0;
        while(low<high)
        {
            if(a[mid]==s)
            {
                f=1;
                break;
            }
            else
            if(s>a[mid])
            {
                low=mid+1;
            }
            else
            if(s<a[mid])
            {
            high=mid-1;
            mid=(low+high)/2;
        }
    }
    if(f==1)
    System.out.println("Element found");
    else
    System.out.println("Element not found");
}
}
        