import java.io.*;
class twinprime
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         int s=0,m=0,k,d,h=0;
         System.out.println("Enter a number::");
         int x = Integer.parseInt(cd.readLine());
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
      
            
            