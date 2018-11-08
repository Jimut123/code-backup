//Pre_board_Question_1
import java.io.*;
class evil
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,n1,c=0,k=0,i,d;
        int a[]=new int[1000];
        System.out.println("Enter the number = ");
        n=Integer.parseInt(cd.readLine());
        n1=n;
        while(n1!=0)
        {
            d=n1%2;
            if(d==1)
            {
                k++;
            }
            a[c]=d;
            c++;
            n1=n1/2;
        }
        System.out.println("INPUT\t:"+n);
        System.out.print("BINARY EQUIVALENT\t:");
        for(i=c-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("NO. OF 1'S\t:"+k);
        System.out.print("OUTPUT\t:");
        if(k%2==0)
        System.out.println("EVIL NUMBER.");
        else
        System.out.println("NOT AN EVIL NUMBER.");
    }
}