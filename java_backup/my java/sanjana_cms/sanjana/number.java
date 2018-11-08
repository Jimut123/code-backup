import java.io.*;

    class number
    {
        public static void main ()throws IOException
        {
            int i,n,f,j;
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Enter a number");
            n=Integer.parseInt (br.readLine());
            for (i=1; i<=n; i++)
            {if (n%i==0)
                {
                f=0;
                for (j=2; j<i; j++)
                if (i%j==0)
                {
                    f=1;
                    break;
                }
                if (f==0)
                System.out.println(i);
            }
        }
    }
}

