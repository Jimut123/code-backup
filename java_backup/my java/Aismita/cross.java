import java.io.*;
class cross
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        String s=in.readLine();
        s=s.toUpperCase();
        int n=s.length();
        char a[][]=new char[n][n];
        
        for(int i=0;i<n;i++)
        a[i][i]=s.charAt(i);
        
        int b=n-1;int c=0;
        while(b>=0 && c<n)
        {
            if(a[c][b]==s.charAt(n/2))
            {
                c++;
                b--;
            }
            a[c][b]=s.charAt(c);
            b--;c++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                System.out.print(" ");
                else
            System.out.print(a[i][j]+" ");
        }
            System.out.println();
        }
    }
}