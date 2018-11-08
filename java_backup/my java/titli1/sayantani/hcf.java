import java.io.*;
class hcf
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
 void inShow()throws IOException
 {
  int mn,mx,n1,n2;
  System.out.println("enter 2 nos.");
   n1=Integer.parseInt(br.readLine());
   n2=Integer.parseInt(br.readLine());
  mn=Math.min(n1,n2);
  mx=Math.max(n1,n2);
  int h=hcf(mn,mx);
  System.out.println("HCF="+h);
 }
 
  int hcf(int mn,int mx)
  {
   int d=1,h=0;
   while (d!=0)
   {
    d=mx%mn;
    mx=mn;
    h=mn;
    mn=d;
   }
    return h;
  }
}  
  
 