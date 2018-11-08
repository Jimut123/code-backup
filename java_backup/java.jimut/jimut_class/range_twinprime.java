import java.io.*;
class range_twinprime
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         int s=0,m=0,k,d,h=0,j,p=0;
         System.out.println("Enter two numbers second one should be greater than the other one::");
         int x = Integer.parseInt(cd.readLine());
         int y = Integer.parseInt(cd.readLine()); 
         int c=1;
           for(int i=x;i<y;i++)
          {
              for(j=2;j<i;j++)
              {
            if(i%j==0)
            {
               System.out.println("no twin prime numbers exists in between them:");
            }
            else if(i%j!=0)
            {
          
                while(i!=0)
                {
                   k = i%10;
                   s=(s*10)+k;
                   i =i/10;
                }
                for(d=2;d<s;d++)
                {
                    if(s%d==0)
            {
               
               System.out.println("no twin prime numbers exists in between them:");
            }
            else
            {
               
               p=1;
            }
        }
        
        
        }
    }
       if(p==1)
            {
               
               System.out.println(s+",");
            }
            s=0;
}
}
}
      