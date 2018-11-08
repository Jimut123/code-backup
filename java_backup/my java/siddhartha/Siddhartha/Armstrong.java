import java.io.*;
public class Armstrong
{public static void main()throws IOException
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Enter a number");
        int n=Integer.parseInt(br.readLine());
        int r,s=0,k=n;
        while(n!=0)
        {r=n%10;
         s=(r*r*r)+s;
         n=n/10;
        }
        if(k==s)
        System.out.println("The number "+k+" is armstrong");
        else
        System.out.println("The number "+k+" is not armstrong");
    }
}