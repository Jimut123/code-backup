//finding square of a no. after deleting its 1st and last no.
import java.util.*;
class Number
{
  int n;
  Scanner sc=new Scanner(System.in);
  public void get()
  {
      int n1,d=0;
      System.out.println("enter a no.");
       n=sc.nextInt();
      n1=n; 
      while(n1>0)
      {
          d++;
          n1=n1/10;
        }
        num(d);
    }
    public void num(int l)
    {
        int n1=n,num=0,c=1;
        while(n1>0)
        {
            int d=n1%10;
            if (c==1 || c==l)
            {
                c++;
                n1=n1/10;
                continue;
            }
            num=num*10+d;
            c++;
            n1=n1/10;
        }
        System.out.println(num);
        int rev=0;
        n1=num;
        while(n1>0)
        {
            int d=n1%10;
            rev=rev*10+d;
            n1=n1/10;
        }
        System.out.println(rev);
        int sq=rev*rev;
        System.out.println("Required square = "+sq);
    }
  }