import java.io.*;
class deep
{
    public void main()throws IOException

    {
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        int i,n,f;
        System.out.println("enter a number");
        n=Integer.parseInt(BR.readLine());
        f=1;
        for(i=1;i<=n;i++)
        f=f*i;
        System.out.println(f);
    }
}
        