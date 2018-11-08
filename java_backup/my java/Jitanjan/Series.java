import java.io.*;
class Series
{
 int n,i,j,s,f;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input() throws IOException
 {
     n=Integer.parseInt(br.readLine());
     cal();
 }
 void cal() throws IOException
 {
     j=1;s=0;
     for(i=1;i<=n;i++)
     {
         s=s+ (power(j)/fact(i));
     }
     System.out.println(s);
 }
 int power(int j)
 {
     return (int)Math.pow(j,j);
 }
 int fact(int j)
 {
     f=1;int k;
     for(k=1;k<=j;k++)
     f=f*k;
     return f;
 }
}