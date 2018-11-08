import java.io.*;
class PrimePalindrome
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void inShow()throws IOException
 {
  int r1,r2,i;
  System.out.println("enter 1st no. of range");
   r1=Integer.parseInt(br.readLine());
  System.out.println("enter last no. of range");
   r2=Integer.parseInt(br.readLine());
  for(i=r1;i<=r2;i++)
  {
   boolean a=prime(i);
   if (a==true)
    {
     boolean b=palindrome(i);
     if (b==true)
      System.out.println(i);
    }
  }
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
   
   
  
  
  