import java.io.*;
class t12
{
 public static void main(String args[])throws IOException
 {
  int n,m=0,mn,n1,k,s=0,s1=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter a no.");
  n=Integer.parseInt(br.readLine());
  mn=n%10;
  n1=n;
  while (n>0)
  {
   k=n%10;
   if (k>m)
   m=k;
   if (k<mn)
   mn=k;
   n=n/10;
  }
   while (n1>0)
   {
    k=n1%10;
    if (k==m)
    k=mn;
    else
    if (k==mn)
    k=m;
    s=(s*10)+k;
    n1=n1/10;
   }
    while (s>0)
    {
     k=s%10;
     s1=(s1*10)+k;
     s=s/10;
    }
     System.out.println(s1);
 }
}





























