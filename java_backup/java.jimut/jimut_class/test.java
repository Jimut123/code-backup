import java.io.*;
class test
{
int i,c=0,a1=0,b1 = 1,n,s=0,j;
void generate(int n)
{
    if(n==0)
    {
        System.out.println(a1);
    }
    else if(n==1)
    {
         System.out.println(a1+","+b1);
        }
      else if(n>=1)
    {
         System.out.print(a1+","+b1);
        for(i=0;i<=n;i++)
        {
            
             c = a1 + b1;
             a1 = b1;
             b1 = c;
             if(c<=n)
             {
             System.out.print(","+c);
            
            }
        }
        System.out.println();
    }
}
    void generate(int a,int b)
    {
         int s=0,m=0,k,d,h=0;
         int c=1;
           for(int i=2;i<x;i++)
          {
            if(x%i==0)
            {
                m=1;
            }
            else if(x%i!=0)
            {
          
                while(x!=0)
                {
                   k = x%10;
                   s=(s*10)+k;
                   x =x/10;
                }
                for(d=2;d<s;d++)
                {
                    if(s%d==0)
            {
               h=0;
            }
            else
            {
               h=1;
            }
        }
        
        }
    }
    if(m==1)
    {
        System.out.println("not twin prime");
        }
    else if(h==0)
    {
        System.out.println("not twin prime");
    }
    else if(h==1)
    {
         System.out.println(" twin prime");
}
        }
    }
    
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         test ob = new test();
         
       System.out.println("Enter the topmost  number::");
       int m1 = Integer.parseInt(cd.readLine());
       ob.generate(m1);
       System.out.println("Enter a range a&b::");
       int x = Integer.parseInt(cd.readLine());
       int y= Integer.parseInt(cd.readLine());     
       ob.generate(x,y);
    }
}
            
            
            
            
            
            
            
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
          
        