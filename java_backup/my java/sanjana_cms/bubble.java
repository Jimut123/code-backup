import java.io.*;
class bubble
{
    public static void main (String args[]) throws IOException
    {
        int a[]=new int[100],i,j,t,n;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a term");
        n=Integer.parseInt(br.readLine());
        for (i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for (i=0;i<n;i++)
        for (j=1;j<n-i-1;j++)
        {
            if (a[j]>a[j+1])
        {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
    }
    System.out.println(a[i]);
}
}