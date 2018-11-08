
import java.io.*;
class test
{
    public static void main(String args[])throws IOException
    {
        int a[]=new int [100],i,n,pos,j,t,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Term:");
        n=Integer.parseInt(br.readLine());
        
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.println("Elements before sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
        for(i=0;i<n/2-1;i++)
        {
            pos=i;
            for(j=i+1;j<n/2;j++)
            if(a[j]<a[pos])
            pos=j;
            t=a[pos];
            a[pos]=a[n/2];
            a[n/2]=t;
        }
        k=0;
        for(i=n/2;i<n;i++)
        {
        for(j=n/2;j<n-k-1;j++)
        if(a[j]>a[j+1])
        {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
        k++;
    }
     System.out.println("Elements after sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
        
    }
}
      
           
        