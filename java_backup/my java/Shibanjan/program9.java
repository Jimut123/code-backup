import java.io.*;
class program9
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  long m,n;
  void input()throws IOException
  {
     System.out.print("Enter first number:");
     long m=Long.parseLong(br.readLine());
     System.out.print("Enter second number:");
     long n=Long.parseLong(br.readLine());
     operprint( m, n);
  }
  void operprint(long m,long n)
  {
    String n1=conversion(m);
    String m1=conversion(n);
    String sum=summation(n1, m1);
    System.out.println("Binary of "+m+" is "+n1);
    System.out.println("Binary of "+n+" is "+m1);
    System.out.println("Their sum is "+sum);
  }
  String conversion(long x)
  { 
     long a,b;
     String conv="";
      while(x!=0)
      {
          a=x/2;
          b=x%2;
          conv=b+conv;
          x=a;
      }
     return conv;
  }
  String summation(String n1, String m1)
  {
     String s="";
     int c=0, i;
      if(n1.length()<m1.length())
      {
         while(n1.length()<m1.length())
         n1=0+n1;
      }
      else if(m1.length()<n1.length())
      {
         while(m1.length()<n1.length())
         m1=0+m1;
      }
      for(i=n1.length()-1;i>=0;i--)
      {
        if(n1.charAt(i)=='0' && m1.charAt(i)=='0')
        {
           s=c+s;
           c=0;
        }
        else if(n1.charAt(i)=='1' && m1.charAt(i)=='1')
        {
            if(c==0)
             s='0'+s;
            else
            s='1'+s;
            c=1;
        }
        else if(n1.charAt(i)=='1' || m1.charAt(i)=='1')
        {
           if(c==0)
            s='1'+s;
           else
           {
              s='0'+s;
              c=1;
           }
        }
     }
     if(c==1)
     s='1'+s;
     return s;
   }
   public static void main(String arg[])throws IOException
   {
       program9 p=new program9();
       p.input();
    }
}