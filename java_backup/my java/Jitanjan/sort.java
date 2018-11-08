import java.io.*;
class sort
{
 public static void main()throws IOException
 { int i,t,pos,j;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("ENTER ARRAY ELEMENTS");
     int n=Integer.parseInt(br.readLine());
     int a[]=new int[n];
     for(i=0;i<n;i++)
     {
         a[i]=Integer.parseInt(br.readLine());
        }
     for(i=0;i<(n-1);i++)
     {
         pos=i;
        for(j=i+1;j<n;j++)
        {
            if(a[pos]>a[j])
            {
                pos=j;
            }
        }
            t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        
        
    }
    for(i=0;i<n;i++)
    System.out.println(a[i]);
}
}
            
        
     