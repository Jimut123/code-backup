import java.io.*;
class sum_fib
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE RANGE= ");
        int r=Integer.parseInt(br.readLine());
        int a=0,b=1;
        int c;
        int s=0;
        s=a+b;
        for(int i=1;i<=r-2;i++)
        {
            c=a+b;
            s=s+c;
            a=b;
            b=c;
        }
        System.out.println("THE SUM IS ="+s);
    }
}

            
            
     
     
     
    
 
 
  
 
 
 
 
 





