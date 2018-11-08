import java.io.*;
class arrange
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("td");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        int i,max=0,m=n/2,j,p=0,t=0;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the elements");
            a[i]=Integer.parseInt(br.readLine());
        }
        for(j=0;j<n;j++)
        {
            int k=m+j;
            for(i=0;i<m&k<n;i++,k++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    p=i;
                    if(a[k]>max)
                    {
                        max=a[k];
                        p=k;
                    }
                }
                t=a[m];
                a[m]=max;
                a[p]=t;
                if(j%2!=0)
                {
                    m=m+j;
                }
                if(j%2==0&&m<n)
                {
                    m=m-j;
                }
                if(m>=n)
                {
                    m=n-j;
                }
            }
        }
            for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        }
    }