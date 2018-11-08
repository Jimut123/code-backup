import java.io.*;
class Array
{
 public static void main()throws IOException
 {int t=0,k,j,i;
    
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter array elements");
  int n=Integer.parseInt(br.readLine());
   int a[]=new int[n];
  
  for(i=0;i<n;i++)
  { 
      a[i]=Integer.parseInt(br.readLine());
    }
    t=0;
  for(i=0;i<n;i++)
  {
      if((a[i]%2)!=0)
      {
          k=a[t];
          a[t]=a[i];
          a[i]=k;
          t++;
        }
    }
    
for(i=0;i<n;i++)
System.out.println(a[i]);
}

}

