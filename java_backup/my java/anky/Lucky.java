import java.io.*;
class LuckyNumber
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,n,l,j=0,t,k,a[],b[];
    public void show()throws IOException
    {
        System.out.println("Enter length of array");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        {
            j++;
            a[i]=j;
        }
        for(i=1;i<n;i++)
        {
            t=0;k=0;
            for(j=0;j<n;j++)
            {
                b[t]=a[k];
                k=k+i+1;
                t++;
            }
            n=t;
            for(l=0;l<t;l++)
            {
                a[j]=b[j];
                System.out.print(a[j]+" ");
            }
            System.out.println(" ");
        }
    }
    public void main()throws IOException
    {
        show();
    }
}