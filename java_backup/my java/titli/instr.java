import java.io.*;
class instr
{
 public static void main(String args[])throws IOException
 {
  int i,m,n,c;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter no. of elements");
  m=Integer.parseInt(br.readLine());
  int a[]=new int[m+1];
  for(i=0;i<m;i++)
  {
   System.out.println("enter a no.");
   a[i]=Integer.parseInt(br.readLine());
  }
   System.out.println("enter no. to be inserted");
    n=Integer.parseInt(br.readLine());
   System.out.println("enter position");
    c=Integer.parseInt(br.readLine());
   for(i=m;i>=c;i--)
   {
    a[i]=a[i-1];
   }
    a[c]=n;
    for(i=0;i<=m;i++)
    {
     System.out.println(a[i]);
    }
 }
} 