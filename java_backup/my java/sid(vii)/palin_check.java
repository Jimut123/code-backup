import java.io.*;
class palin_check
{
    int n,s,n1;
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    void input()throws IOException
    {
        System.out.println("Enter data:");
        n=Integer.parseInt(br.readLine());
        check(n);
    }
    void check(int n)
    {
        s=0;
        n1=n;
        while(n>0)
        {
            s=(s*10)+n%10;
            n=n/10;
        }
        if(n1==s)
        System.out.println("Palindrom...");
        else
        System.out.println("Non Palindrom....");
    }
    public static void main()throws IOException
    {
        palin_check p=new palin_check();
        p.input();
    }
}