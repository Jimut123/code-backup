import java.io.*;
class funcSC
{
 String s;
 int ch,n,n1,r=0,i,p=1,k;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void input()throws IOException
 {
  do
  {
   System.out.println("press 1 for Palindrome");
   System.out.println("press 2 for Factorial");
   System.out.println("press 3 to exit");
    ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
    case 1:
           System.out.println("enter a no.");
            n=Integer.parseInt(br.readLine());
           pal(n);
           break;
    case 2:       
           System.out.println("enter a no.");
           n=Integer.parseInt(br.readLine());
           fac(n);
           break;
    case 3:
           System.exit(0);
           
   }
  }
   while(true);
 }
  
  void pal(int n)
  {
   n1=n;
   while(n1>0)
   {
    k=n1%10;
    r=r*10+k;
    n1=n1/10;
   }
    if(r==n)
     System.out.println("palindrome");
    else
     System.out.println("not palindrome");
  }
  
  void fac(int n)
  {
   for(i=1;i<=n;i++)
    p=p*i;
   System.out.println("factorial="+p);
  }
}  
    
  