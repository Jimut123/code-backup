import java.io.*;
class palindrome
{
 public static void main(String args[])throws IOException
 { int n1,p,c,k,p1,p2,rev;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter A Number");
     int n=Integer.parseInt(br.readLine());
     c=1;
     while(c<=15)
     {
         n1=n;
         rev=0;
         while(n1>0)
         {
             k=n1%10;
             rev=(rev*10)+k;
             n1=n1/10;
         }
         p=n+ rev;
         p1=0;
         p2=p;
         while(p2>0)
         {
             k=p2%10;
             p1=(p1*10)+k;
             p2=p2/10;
         }
         if(p==p1)
         {
             System.out.println("NUMBER IS PALINDROME "+p+"::"+p1);
             System.out.println("FOUND IN STEP "+c);
             break;
         }
         n=p;
         c++;
     }
 }
}