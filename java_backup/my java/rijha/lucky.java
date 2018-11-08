import java.io.*;
public class lucky
{
public static void main(String args[])throws IOException
{
    int n,a,b,c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number");
    n=Integer.parseInt(br.readLine());
    int s;
    s=n;
    while(s>9)
    {
        while (n>0)
        {
            a=n/10;
            b=a*10;
            c=n-b;
            s=s+c;
            n=a;
        }
    }
    if(s==1)
    {
        System.out.println("lucky number");
    }
    else
    System.out.println("not a lucky number");
}
}
    