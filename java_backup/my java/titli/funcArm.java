import java.io.*;
class funcArm
{
 int n,a,n1,k,s=0,c;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
 System.out.println("enter a no.");
  n=Integer.parseInt(br.readLine());
 arm(n);
 if (a==0)
  System.out.println("armstrong no.");
 else
  System.out.println("not armstrong");
 }
 int arm(int n)
 {
  n1=n;
  a=0;
  while(n1>0)
  {
   k=n1%10;
   s=s+(k*k*k);
   n1=n1/10;
  }
  if (s!=n)
   a=1;
  return a;
 }
} 