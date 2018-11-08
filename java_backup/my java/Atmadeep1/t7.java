import java.io.*;
class t7
{
 public static void main(String args[])throws IOException
 {
  int n,i,a=0,b=1,c=0,c1=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter limit");
  n=Integer.parseInt(br.readLine());
  for (i=1;i<=n-2;i++)
  {
   c1=c;
   c=a+b;
   if ((c-c1)>0)
   {
    for (i=c1+1;i<c;i++)
    System.out.println(i);
   } 
    a=b;
    b=c;
  }
 }
}
