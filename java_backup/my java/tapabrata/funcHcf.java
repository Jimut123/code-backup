import java.io.*;
class funcHcf
{
 int n1,n2,mx,mn,d=1,h;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
  System.out.println("enter 2 no.");
   n1=Integer.parseInt(br.readLine());
   n2=Integer.parseInt(br.readLine());  
  mx=Math.max(n1,n2);
  mn=Math.min(n1,n2);
  hcf(mx,mn);
  System.out.println("HCF="+h);
 } 
  int hcf(int mx,int mn)
  {  
   while(d!=0)
   {
    d=mx%mn;
    mx=mn;
    h=mn;
    mn=d;
   } 
   return h;
  }
}  