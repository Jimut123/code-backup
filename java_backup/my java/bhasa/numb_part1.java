 

import java.io.*;
class numb_part1
{
    public static void main(String args[])throws IOException
    {
        int n,i,k,k1,s,j,f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            if(i==n)
            {
            System.out.println(n);
            break;
        }
            
            k=1;
            while(k<n)
            {
                k1=n-k;
                //System.out.println(k1);
                if(k1==i)
                {
                    System.out.print(i+" "+k);
                    System.out.println("");
                }
                else
                {
                    s=0;
                    for(j=1;j<=k1;j++)
                    s=s+i;
                    if((s+k)==n)
                    {
                     for(j=1;j<=k1;j++)
                     System.out.print(i+" ");
                     System.out.print(k);
                     System.out.println("");
                    }
                } 
                     
                     k++;
                    }
                }
            }
                    
}
