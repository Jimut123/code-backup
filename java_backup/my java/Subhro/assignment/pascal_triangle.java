package assignment;

import java.io.*;
class pascal_triangle
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i,j,k,s,n;
    public void input()throws IOException
    {
        System.out.println("enter the number");
        n=Integer.parseInt(br.readLine());
    }
    public void pascal()
    {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(+j);
            }
            if(i>=2)
            {
                for(k=j-2;k>=1;k--)
                System.out.print(+k);
            }
            System.out.println("");
        }
    }
}