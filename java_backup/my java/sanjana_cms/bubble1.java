import java.io.*;
class bubble1
{
    public static void main()throws IOException
    {
        String k,a[]=new String[100];
        int i,j,t,n;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a term");
        n=Integer.parseInt(br.readLine());
        for (i=0;i<n;i++)
        {            
            a[i]=br.readLine();
        }
        
        for (i=0;i<n-1;i++)
        for (j=0;j<n;j++)
        {
            if (a[i].compareTo(a[j])>0)
            {
                k=a[i];
                a[i]=a[j];
                a[j]=k;
            }
        }
    }
}