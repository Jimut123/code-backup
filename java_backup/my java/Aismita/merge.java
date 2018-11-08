import java.io.*;
class merge
{
    public static void main(String sr[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit of first array");
        int n=Integer.parseInt(in.readLine());
        System.out.println("Enter the limit of second array");
        int m=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        int b[]=new int[m];
        int c[]=new int[m+n];
        int i,j,k,l,p,t;
        
        System.out.println("Enter the elements in first array");
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
        
        System.out.println("Enter the elements in second array");
        for(i=0;i<m;i++)
        b[i]=Integer.parseInt(in.readLine());
        
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                     t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("After sorting ist array");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        
        for(i=0;i<m-1;i++)
        {
            for(j=i+1;j<m;j++)
            {
                if(b[j]<b[i])
                {
                    t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }
        System.out.println("After sorting 2nd array");
        for(i=0;i<m;i++)
        System.out.println(b[i]);
        l=0;k=0;i=0;
        while(l<n && i<m)
        {
            if(a[l]<b[i])
            {
                c[k]=a[l];
                k++;
                l++;
            }
            else
            if(a[l]>b[i])
            {
                c[k]=b[i];
                k++;
                i++;
            }
            else
            if(a[l]==b[i])
            {
                c[k]=a[l];
                k++;
                l++;
                i++;
            }
        }
        
        if(l<n)
        {
            for(j=l;j<n;j++)
            {
                c[k]=a[j];
                k++;
            }
        }
        else
        if(i<m)
        {
           for(j=i;j<m;j++)
            {
                c[k]=b[j];
                k++;
            }
        }
        System.out.println("After sorting 3rd array");
        for(i=0;i<(m+n);i++)
        System.out.println(c[i]);
    }
}
                
        
            