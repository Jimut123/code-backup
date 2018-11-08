
import java.io.*;
class del
{
 public static void main(String args[])throws IOException
 {
  int i,m,n,c=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter no. of elements");
  m=Integer.parseInt(br.readLine());
  int a[]=new int[m];
  for(i=0;i<m;i++)
  {
   System.out.println("enter a no.");
   a[i]=Integer.parseInt(br.readLine());
  }
   System.out.println("enter no. to be deleted");
    n=Integer.parseInt(br.readLine());
   for(i=0;i<m;i++)
   {
    if (a[i]==n)
    {
     c=i;
     break;
    }
   }
    if (c!=0)
    {
     for(i=c;i<m-1;i++)
     {
      a[i]=a[i+1];
     }
    }
     for(i=0;i<m-1;i++)
     System.out.println(a[i]);
 }
} 