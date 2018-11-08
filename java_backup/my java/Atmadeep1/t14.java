import java.io.*;
class t14
{
 public static void main(String args[])throws IOException
 {
  int n,n1,r=0,k;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a no.");
  n=Integer.parseInt(br.readLine());
  n1=n;
  while (n>0)
  {
   k=n%10;
   r=(r*10)+k;
   n=n/10;
  }
   if (r==n1)
   System.out.println("no.is pallindrome");
   else
   System.out.println("no.is not pallindrome");
 }
}
