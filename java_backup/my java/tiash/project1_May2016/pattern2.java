package project1_May2016;

//To print the following pattern
import java.io.*;
class pattern2
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n,i,j;
        n=Integer.parseInt(br.readLine());
        
        //cheaking of the loop
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            m=0;
            else
            m=1;
            for(j=1;j<=i;j++)
            {
                System.out.print(m);
                if(m==1)
                m=0;
                else
                m=1;
            }
            System.out.println("");
        }
    }
}
