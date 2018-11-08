import java.io.*;
class t11
{
 public static void main(String args[])throws IOException
 {
  int n,k,c=0,i;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a no.");
  n=Integer.parseInt(br.readLine());
  while (n>0)
  {
   k=n%10;
   for (i=2;i<k;i++)
   {
    if (k%i==0)
    c=c+1;
   }
    if (c==0)
    System.out.println(k);
    c=0;
    n=n/10;
  }
 }
}














































