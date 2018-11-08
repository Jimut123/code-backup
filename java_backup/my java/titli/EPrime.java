//Embedded prime
import java.io.*;
class EPrime
{
  int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void check()throws IOException
  {
      System.out.println("enter a no.");
       n=Integer.parseInt(br.readLine());
      int n1=n,len=0,i,j;
      int min=n%10,max=0;
      while(n1>0)
      {
          int d=n1%10;
          len=len+1;
          if(d<min)
           min=d;
          n1=n1/10;
        }
        int a[]=new int[len];
        n1=n;
        int c=0;
        while(n1>0)
        {
            int d=n1%10;
            a[c++]=d;
            n1=n1/10;
        }
        for(i=0;i<len;i++)
        {
            for(j=0;j<len-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(i=0;i<len;i++)
         max=max*10+a[i];
        for(i=min;i<=max;i++)
        {
            boolean b=num(i,a,len);
            if (b==true)
            {
                boolean d=isPrime(i);
                if (d==true)
                 System.out.println(i);
                }
            }
        }
        public boolean num(int no,int a[],int l)
        {
            int n1=no,i,flag=0;
            int a1[]=new int[l];
            for(i=0;i<l;i++)
             a1[i]=a[i];
            while(n1>0)
            {
                int d=n1%10;
                for(i=0;i<l;i++)
                {
                    if (a1[i]==d)
                    {
                        a1[i]=10;
                        flag=1;
                        break;
                    }
                }
                if (flag==0)
                 return false;
                flag=0; 
                n1=n1/10;
            }
            return true;
        }
        public boolean isPrime(int no)
        {
            int i;
            for(i=2;i<no;i++)
            {
                if (no%i==0)
                 return false;
                }
                return true;
            }
        }
            
            
        
                