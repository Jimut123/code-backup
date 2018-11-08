import java.io.*;
class dec_bin
{
    public static void main ()throws IOException
    {
    int i,x,k,t;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Decimal no:");    
    x =Integer.parseInt(br.readLine());
        int a[] =new int [100];
        t =0;
        while (x>0)
        {
            k =x%2;
            a [t] =k;
            t++;
            x =x/2;
        }
        System.out.println("Equivalent Binary no:");    
        for (i =t-1;i>=0;i--)
        System.out.print(a[i]);
    }
}
                                                                                                                                                                    