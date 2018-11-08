import java.io.*;
class lcm
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int i,p=1,max=0,f=0,st=0;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            p=p*a[i];
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        for(i=max;i<=p;i++)
            {
                p++;
                if(f==1)
                {
                   System.out.println(+st);
                   break;
                }
                f=1;
                for(int j=0;j<n;j++)
                {
                    if(i%a[j]==0)
                    {
                        f=f*1;
                        st=i;
                    }
                    else
                    {
                        f=0;
                    }
                }
            }

    }
}
