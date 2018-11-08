import java.io.*;
class HCF
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter two numbers:");
        int n=Integer.parseInt(cd.readLine());
        int m=Integer.parseInt(cd.readLine());
        int p,i,s=1;
        p=(m*n)/2;
        for(i=1;i<=p;i++)
        {
            if(((m%i)==0)&&((n%i)==0))
            {
                s=i;
            }
        }
        System.out.println("HCF = "+s);
           
}
}