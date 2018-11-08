import java.io.*;
class gcd
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter limit number");
        int n=Integer.parseInt(in.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(in.readLine());
        int m=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>m)
            m=a[i];
        }
        int c=0;
        for(int j=2;j<=m;j++)
        {
            c=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]%j!=0)
                break;
                else
                c++;
            }
            if(c==n)
            {
            System.out.println("hcf is "+j);
            break;
        }
        
    
        if(j==m && c==0)
        System.out.println("hcf= "+1);
    }
        
    }
}
        

