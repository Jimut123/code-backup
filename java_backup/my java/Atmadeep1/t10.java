import java.io.*;
class t10
{
 public static void main(String args[])throws IOException
 {
  int n,i,s=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a no.");
  n=Integer.parseInt(br.readLine());
  for (i=0;i<=n;i++)
  s=1/(n+i);
  System.out.println(s);
 }
}
