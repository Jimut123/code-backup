import java.io.*;
class fiboprime{
    public static void main () throws IOException
    {
        int n,i,a=0,b=1,c=0,j,k=0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader (isr);
        n=Integer.parseInt(br.readLine());
        for (i =1; i<=n-2;i++)
        { 
            c= a+b;
            System.out.println(c+",");
            k=0;
            for(j=2;j<c;j++)
            {
                if (c%j==0)
                {
                k++;
                break;
            }
            }
            if(k==0)
            System.out.print("Fibo and prime" +c);
            else
            System.out.print("Fibo and non prime" +c);
            
            a=b;
            b=c;
            System.out.println("");
        }
    }
}

        

    