import java.io.*;
public class pos_freq
{
    public static void main(String args[])throws IOException
    {
        int k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n");
        System.out.println("-------");
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        for(int x=0;x<n;x++)
        {
            a[x]=Integer.parseInt(br.readLine());
        }
        int max=a[0];int min=a[0];
        for(int y=0;y<n;y++)
        {
            if(a[y]>max)
            {
                max=a[y];
            }
            if(a[y]<min)
            {
                min=a[y];
            }
        }
        for(int p=min;p<=max;p++)
        {k=0;
            for(int q=0;q<n;q++)
            {
                
                if(p==a[q])
                {
                  k++;
                  System.out.print(q+",");
                }
            }
            if(k>0)
            {
            System.out.print("Positions of"+"Element:"+p+"and frequency is:"+k);
            System.out.println(" ");
        }
        }
    }
}

        