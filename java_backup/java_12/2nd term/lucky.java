import java.io.*;
class lucky
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,t,k,i,j;
        System.out.println(" Enter the upper limit : ");
        n=Integer.parseInt(cd.readLine());
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        k=1;
        while(k<n)
        {
        for(i=k;i<n;i=i+k)
        {
            for(j=i;j<n-1;j++)
            {
                a[j]=a[j+1];
            }
            n--;
        }
        k++;
        for(t=0;t<n;t++)
        {
             System.out.print(a[t]+" ");
        }
         System.out.println();
        }
}
}