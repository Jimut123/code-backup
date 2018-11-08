import java.io.*;
class Prime_palindrome_numbers
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int m,n,i,k,d,p=0,s=0,j;
        System.out.println("Enter the two limits m and n : ");
        m=Integer.parseInt(cd.readLine());
        n=Integer.parseInt(cd.readLine());
        if(m<3000&&n<3000&&m<n)
        {
            for(i=m;i<n;i++)
            {
                k=i;
                while(k!=0)
                {
                    d=k%10;
                    s=s*10+d;
                    k=k/10;
                }
                if(s==i)
                {
                    for(j=2;j<s;j++)
                    if(s%j==0)
                    p=1;
                    if(p==0)
                    System.out.print(i+" ");
                }
                s=0;
                p=0;
            }
        }
        else
        {
            System.out.println("OUT OF RANGE");
        }
    }
}