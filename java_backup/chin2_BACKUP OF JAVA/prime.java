import java.io.*;

class prime 
{
    private int n;
    public static void main(String args[])throws IOException
    {
        prime abc = new prime();
        abc.input();
        abc.prime();
    }
    void input() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number-->>");
        n = Integer.parseInt(br.readLine());
    }
    void prime()
    {
        int flag=0;
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag!=1)
        System.out.println(n+"not prime number");
        else
        System.out.println(n+"prime number");
        
    }
}
