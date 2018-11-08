import java.io.*;
class t6
{
 public static void main(String args[])throws IOException
 {
  int n,i,a=0,b=1,c=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter limit");
  n=Integer.parseInt(br.readLine());
  System.out.print(a+",");
  System.out.print(b+",");
  for (i=1;i<=n-2;i++)
  {
   c=a+b;
   System.out.print(c+",");
   a=b;
   b=c;
  }
 }
}
   

