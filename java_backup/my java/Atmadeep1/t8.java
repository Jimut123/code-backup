import java.io.*;
class t8
{
 public static void main(String args[])throws IOException
 {
  int n,n1,i,s=0,a,c=1;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter limit");
  n=Integer.parseInt(br.readLine());
  n1=n*2;
  for (i=1;i<=n1;i+=2)
  {
   if (c%2==0)
   a=i*(-1);
   else
   a=i;
   c=c+1;
   s=s+a;
  }
   System.out.println(s);
 }
}
