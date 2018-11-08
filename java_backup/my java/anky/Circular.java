import java.io.*;
class Circular
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n,mup,c,num[],rev[],k,i,j;
    double p=0;
    void check()throws IOException
    {
        int num[]=new int[6];
        int rev[]=new int[5];
        System.out.println("Enter Number");
        n=Integer.parseInt(br.readLine());
        if(n<1||n>999999)
        {
            System.out.println("Invalid Input!"+"Number should be greater than 1 and less than 1000000");
        }
        k=n;
        mup=k%10;
        k=k/10;
        c=n*mup;
        num[0]=mup;
        i=0;
        while(k>0)
        {
            rev[i]=k%10;
            k=k/10;
            i++;
        }
        j=0;
        while(i>=0)
        {
            j++;
            num[j]=rev[i];
            i--;
        }
        i=0;
        mup=0;
        while(j>=0)
        {
            mup=num[j];
            p=p+(mup*(Math.pow(10,i)));
            i++;
            j--;
        }
        if(p==n)
        {
            System.out.println("It is a circular number");
        }
        else
        {
            System.out.println("IOt is not a circular number");
        }
    }
    public void main()throws IOException
    {
        check();
    }
}