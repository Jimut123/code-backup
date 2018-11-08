import java.io.*;
class d
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,p,p1;
        n=Integer.parseInt(br.readLine());
        int a[]={1000,500,100,50,20,10,5,2,1};
        for(int i=0;i<9;i++)
        {
            p=n%a[i];
            p1=n/a[i];
            if(p==0&&p1>1)
            {
                p1=p1-1;
                p=a[i];
                n=p;
            }
            System.out.println(a[i]+"x"+p1+"="+a[i]*p);
        }
    }
}