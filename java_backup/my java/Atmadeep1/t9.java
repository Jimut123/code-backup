import java.io.*;
class t9
{
 public static void main(String args[])throws IOException
 {
  int x,n,i,s=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a no.");
  x=Integer.parseInt(br.readLine());
  System.out.println("enter degree");
  n=Integer.parseInt(br.readLine());
  for (i=1;i<=n;i++)
  s=s+(x^i);
  System.out.println(s);
 }
}
