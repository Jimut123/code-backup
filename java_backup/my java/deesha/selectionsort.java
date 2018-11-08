import java.io.*;
class selectionsort
{
    public static void main(String args[])throws IOException
    {
        int a[]=new int [100],i,n,pos,j,t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Term:");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.println("Elements before sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
        for(i=0;i<n-1;i++)
        {
            pos=i;
            for(j=i+1;j<n;j++)
            if(a[j]<a[pos])
            pos=j;
            t=a[pos];
            a[pos]=a[i];
            a[i]=t;
        }
     System.out.println("Elements after sort:");   
    for(i=0;i<n;i++)
       System.out.println( a[i]);
        
    }
}
      
           
        