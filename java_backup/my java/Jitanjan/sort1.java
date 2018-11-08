import java.io.*;
class sort1
{
 public static void main() throws IOException
 { int i,j,t;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("ENTER ARRAY ELEMENTS");
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(br.readLine());
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<(n-i-1);j++)
        {
            if(a[j]>a[j+1])
            {
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    
        System.out.println(a[i]);
    
}
}