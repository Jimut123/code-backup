//lowest base in which the no. is palindromic
import java.io.*;
class PalindromicNumber
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void pal()throws IOException
   {
       int i,c=0,n;
       long num=0;
       System.out.println("enter a no.");
        n=Integer.parseInt(br.readLine());
       int n1=n,d=n;
       for(i=2;i<=10;i++)
       {
           num=0;
           n1=n;
           while(n1>0)
           {
               d=n1%i;
               num=(num*10)+d;
               n1=n1/i;
            }
            int flag=check(num,i);
            if (flag==1)
            {
                c=1;
                break;
            }
        }
        if (c==0)
         System.out.println("no. is non palindromic");
        }
        public int check(long num,int base)
        {
            int flag=0;
            long n1=num,ron=0;
            while(n1>0)
            {
                long d=n1%10;
                ron=(ron*10)+d;
                n1=n1/10;
            }
            if (ron==num)
            {
                System.out.println("the no. is palindromic in base "+base);
                System.out.println("the no. in base "+base+ " is "+ron); 
                flag=1;
            }
            return flag;
        }
    }
        
        
       
        
            