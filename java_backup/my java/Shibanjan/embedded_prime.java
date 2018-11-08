import java.io.*;
class embedded_prime
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamreader(System.in));
        int n;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        int r,c,dup=n,
        int a[i]=new int[9];
        do
        {
            r=dup%10;
            a[i]=r;
            c++;
            dup=dup/10;
        }while(dup!=0);
        for(i=0;i<c-1;i++)
        {
            for(j=i+1;j<c;j++)
            {
                a[i]=t;
                a[i]=a[j];
                