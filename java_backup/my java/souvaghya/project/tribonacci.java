package project;

import java.io.*;
class tribonacci
{
 
    int n;
    tribonacci()
    {
    }

    tribonacci(int x)
    {
        n=x;
    }
    void series(int n)
    {
    int a,b,c,d,i;
        a=0;
        b=1;
        c=2;
        System.out.print(a+","+b+","+c);
        for(i=0;i<=n-3;i++)
        {
            d=a+b+c;
            System.out.print(d+",");
            a=b;
            b=c;
            c=d;
            
        }
    }
        public  void main()throws IOException
        {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int n;
          n=Integer.parseInt(br.readLine());
           tribonacci a=new tribonacci(n);
           a.series(n);
        }
    }
    
           
    