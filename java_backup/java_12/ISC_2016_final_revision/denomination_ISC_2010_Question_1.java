//ISC_2010_Question 1 on denomination
import java.io.*;
class denomination_ISC_2010_Question_1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,n1,d,k,c=0,s=0,i;
        System.out.println("Enter the amount = ");
        n=Integer.parseInt(cd.readLine());
        n1=n;
        int deno[]={1000,500,100,50,20,10,5,2,1};
        for(i=0;i<9;i++)
        {
            d=n1%deno[i];
            k=n1/deno[i];
            if(k>0)
            {
               System.out.println(deno[i]+"\tx\t"+k+"\t=\t"+(k*deno[i]));
            }
            n1=n1%deno[i];
            c=c+k;
            s=s+k*deno[i];
        }
        System.out.println("Total = \t"+s);
        System.out.println("Total no. of notes =\t"+c);
    }
}
