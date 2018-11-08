import java.io.*;
class duplicate_array
{
    public static void main(String args[])throws IOException
    {//declaration of main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements");
        int n=Integer.parseInt(br.readLine());
        int a[]= new int[n];
        int b[]= new int[n];
        int i,j,p=0;
        System.out.println("Enter elements in the array ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<n;i++)
        {
            int num=a[i];
            int d=0;
            for(j=i+1;j<n;j++)
            {
                if(a[j]==num)
                d=1;
            }
            if(d==0)    
            b[p++]=a[i];
        }
        for(i=0;i<n;i++)
        System.out.print(b[i]+", ");
    }
}