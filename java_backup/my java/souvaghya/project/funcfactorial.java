package project;

import java.io.*;
class funcfactorial
{
    int n,c;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     void input()throws IOException
     {
         n=Integer.parseInt(br.readLine());
         c=fact(n);
         System.out.print(c);
        }
        int fact(int n)
        {
            int f,i;
            f=1;
            for(i=1;i<=n;i++)
            {
            f=f*i;
        }
        return f;
    }
    public void main()throws IOException
    {
      
            funcfactorial h=new funcfactorial();
            h.input();
        }
    }  