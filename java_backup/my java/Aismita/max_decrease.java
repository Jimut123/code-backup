import java.io.*;
class max_decrease
{
   public static void main(String arg[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit of array");
        int n=Integer.parseInt(in.readLine());
        int a[]=new int [n];
        int i,j,k,t,b,m,mid,a1,s,p;int y=0,z=0;
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
        m=0;mid=n/2+1;a1=0;s=1;t=0;p=0;k=0;
        for(i=0;i<n;i++)
        if(a[i]>m)
        {
        m=a[i];z=i;
        }
        y=a[mid];
        a[mid]=m;
        a[z]=y;
        
       
        
        for(i=m-1;i>=0;i--)
        {
            b=mid+a1*s;
            mid=mid+b;
            
            if((mid+b)<0 || (mid+b)>n-1)
            break;
            else
            {
            for(j=0;j<n;j++)
            {
                //p=0;k=0;
                if(a[j]==i)
                {
                    p=a[j];
                    k=j;
                    break;
                }
            }
            //b=mid+a1*s;
            t=a[mid+b];
            a[mid+b]=p;
            a[k]=t;
            
            m--;s=s*(-1);
            a1++;
        }
    }
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
        