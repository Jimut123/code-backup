import java.io.*;
class denominations
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        n=Integer.parseInt(br.readLine());
        int a[]={1000,500,100,50,20,10,5,2,1};
        int b[]=new int[9];
        int n1=n,r,c=0;
        while(n1!=0)
        {
            int v=a[c];
            n1=n1-v;
            b[c]=c;
            if(n1<0)
            {
                n1=n1+a[c];
                b[c]--;
            }
            c++;
        }
        for(int i=0;i<c;i++)
        {
            System.out.print(a[i]);
            System.out.print(b[i]);
        }
    }
}
