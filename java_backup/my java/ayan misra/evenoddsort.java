import java.io.*;
public class evenoddsort
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(int x=0;x<n;x++)
        {
            a[x]=Integer.parseInt(br.readLine());
        }
       int t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
                }
            }
        }
for(int y=0;y<n;y++)
if(a[y]%2==0)
System.out.print(a[y]+"    ");
for(int z=n-1;z>=0;z--)
if(a[z]%2==1)
System.out.print(a[z]+"    ");

}
}
        
        