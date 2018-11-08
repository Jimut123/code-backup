import java.io.*;
class test_matrixx_generator2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i,c,j,n1,k;
        System.out.println("Enter a number:");
        n=Integer.parseInt(cd.readLine());
        n1=n*n;
        for(i=n;i>=2;i--)
         {
            if(i==n)
             c=1;
            else if(i==2)
             c=3;
            else
             c=2;
            for(j=0;j<c;j++)
            {
                System.out.println(i+"----->");
                for(k=0;k<i;k++)
                System.out.println(n1--);
            }
        }
}
}