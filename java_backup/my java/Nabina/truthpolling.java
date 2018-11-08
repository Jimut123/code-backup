import java.io.*;
class truthpolling
{
  double c,p1;
  double count(double x)
  {
    c=0;
    while(x>0)
    {
      p1=x%10;
      if(p1==1)
      {
         c++;
         x=x/10;
         }       
    }
    return c;
    }
    
    public void main(String args[])throws IOException
    {
       int a=65;
       double p,n,i,q,r;
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println("Enter no.:");
       n=Integer.parseInt(input.readLine());
       p=Math.pow(2,n);
       
       for(i=0;i<n;i++)
       {
       System.out.print((char)a);
       a++;
       }
       System.out.println();
       
       for(i=0;i<p;i++)
       {
       q=binary(i);
       System.out.print(q+" ");
       r=count(q);
       if(r>2)
       System.out.print("1");
       else
       System.out.print("0");
       
       System.out.println("");
       }
       }
       
       double binary(double x)
       {
         double s;
         s=0;
         while(x>0)
         {
         if(x%2==0)
         s=s*10+0;
         else
         s=s*10+1;
         x=x/2;
         }
         return s;
         }
         }
       