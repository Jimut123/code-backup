import java.io.*;
class linearsearch
{
    public static void main(String args[])throws IOException
    {
        int a[]=new int [100],i,n,f,v;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Term:");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        System.out.println("Elements before search:"); 
        for(i=0;i<n;i++)
       System.out.println( a[i]);
       System.out.println("Enter searching element:");
        v=Integer.parseInt(br.readLine());
        f=0;
   for(i=0;i<n;i++)
    if(a[i]==v)
   {
      f=1;
      break;
    }
   if(f==1)
   System.out.println("Found:"+v);
   else
   System.out.println("Not Found:"+v);
        
    }
}
