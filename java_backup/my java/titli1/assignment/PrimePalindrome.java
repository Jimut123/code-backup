import java.io.*;
class PrimePalindrome
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 void inShow()throws IOException
 {
  int n;
  System.out.println("enter a no.");
   n=Integer.parseInt(br.readLine());
  boolean a=prime(n);
  boolean b=palindrome(n);
  if (a==true && b==true)
   System.out.println("prime palindrome");
  else
   System.out.println("not prime palindrome");
 }
 
  boolean prime(int n)
  {
   int i,s=0;
   for (i=2;i<n/2;i++)
   {
    if (n%i==0)
    {
     s=s+1;
     break;
    }
   }
    if (s==0)
     return true;
    else
     return false;
  }
  
  boolean palindrome(int n)
  {
   int n1=n,r=0,k;
   while (n1>0)
   {
    k=n1%10;
    r=r*10+k;
    n1=n1/10;
   }
    if (r==n)
     return true;
    else
     return false;
  }
}  
     
 class PrimePalindromeMain
 {
  public static void main(String args[])throws IOException
  {
   PrimePalindrome obj=new PrimePalindrome();
   obj.inShow();
  }
 } 
   