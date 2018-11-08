import java.io.*;
class Magic 
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void input()throws IOException
 {
  int n;
  System.out.println("enter a no.");
   n=Integer.parseInt(br.readLine());
  check(n);
 }
 
  void check(int n)
  {
   int n1=n,k,s=0;
   while(n>9)
   {
    n1=n;
    s=0;
    while(n1>0)
    {
     k=n1%10;
     s=s+k;
     n1=n1/10;
    }
    n=s;
   } 
   if(s==1)
    System.out.println("magic no.");
   else
    System.out.println("not magic no.");
  }
}  
 
  class MagicMain
  {
   public static void main(String args[])throws IOException
   {
    Magic obj=new Magic();
    obj.input();
   }
  } 