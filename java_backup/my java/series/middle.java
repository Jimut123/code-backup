import java.io.*;
 class middle
{
    public static void main(  )throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int c,p,k,n1,n;
         System.out.println("Enter a number:");
        n=Integer.parseInt(br.readLine()); 
        c=0;
        n1=n;
        while (n1>0)
        {
            c++;
            n1=n1/10;
        }
        p=c/2;
        k=(int)Math.pow(10,p);
        n=n/k;
        System.out.println(n%10);
    }
}

        