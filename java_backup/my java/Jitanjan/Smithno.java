import java.io.*;
class Smithno
{
 int n,j,s,n1;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
 System.out.println("Enter data:");
 n=Integer.parseInt(br.readLine());
 s=0;
 n1=n;
 while(n>1)
 {
     for(j=2;j<=n;j++)
     if(n%j==0)
     {
         s=s+sum(j);
         n=(n/j);
     }
 }
 if(sum(n1)==s)
 System.out.println("Smith no:"+n1);
else
 System.out.println("Non Smith no:"+n1);
}
 int sum(int x)
 {
     int s;int k;
     s=0;
     while(x>0)
     {
         k=(x%10);
         s=s+k;
         x=(x/10);
         
     }
     return s;
 }
}