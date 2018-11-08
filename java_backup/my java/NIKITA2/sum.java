import java.io.*;
class sum
{
    public static void main(String args [])throws IOException
    {
        int n,s,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine ());
        s=0;
        while(n>0)
        {
            k=n%10;
            s=s+k;
            k=k/10;
        }
        System.out.println(s);
    }
}
       