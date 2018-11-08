import java.io.*;
class pat_5
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,j,c=3,k=1,d=0,l=0;
        int m[]=new int[15];
        m[0]=2;
        while(k<=14)
        {
            d=0;
            for(i=2;i<c;i++)
            {
                if(c%i==0)
                {
                    d=1;
                }
            }
            if(d==0)
            {
                m[k]=c;
                k=k+1;
            }
            c=c+1;
        }
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(m[l]);
                l=l+1;
            }
            System.out.println("");
        }
    }
}