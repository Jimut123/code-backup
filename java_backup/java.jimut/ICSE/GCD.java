import java.io.*;
class GCD
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter two numbers:");
        int n=Integer.parseInt(cd.readLine());
        int m=Integer.parseInt(cd.readLine());
        int d1,d2,r=9;
       if(m>n)
       {
           d1=m;
           d2=n;
        }
        else
        {
           d1=n;
           d2=m;
        }
       while(r!=0)
        {
           r=d1%d2; 
           if(r>0)
           {
               d2=r;
               d1=d2;
               
            }
        }
        System.out.println(d2);
           
}
}