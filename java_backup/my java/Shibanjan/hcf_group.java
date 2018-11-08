import java.io.*;
class hcf_group
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements of which you want to find the hcf");
        int i,f,max=999999,m=0,j;
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<max)
            {
                max=a[i];
               // System.out.println(+max);
            }
        }
        for(i=1;i<=max;i++)
        {
            f=1;
            for(j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    f=f*1;
                }
                else
                f=f*0;
            }
            if(f==1)
            {
                m=i;
                
            }
        }
        System.out.println("The HCF is ="+m);
        //System.out.println("The HCF is ="+m);
    }
}