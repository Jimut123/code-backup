import java.io.*;
class special_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int k,s=0,f=1,n1,i,n;
        System.out.println("Enter a number::");
        n = Integer.parseInt(cd.readLine());
       
        n1=n;
       while(n!=0)
        {
            k=n%10;
            for(i=1;i<=k;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
            f=1;
          }
       if(n1==s)
       {
           System.out.println("Your number is a special no::"+s);
        }
        else
        {
            System.out.println("Your number is not a special no::"+s);
        }
    }
}