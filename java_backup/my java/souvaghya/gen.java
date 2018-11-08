import java.io.*;
class gen
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int max;
        max=n%10;
        while(n>0)
        {
         int k=n%10;
         if(k>max)
         max=k;
         k=n/10;
        }