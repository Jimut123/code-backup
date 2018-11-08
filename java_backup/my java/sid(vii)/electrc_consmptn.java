import java.io.*;
public class electrc_consmptn
{
    public static void main (String ar[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        int n=Integer.parseInt (br.readLine() );
        int j;
        if(n<=100)
        j=n*10;
        else
        if(n<=200)
        j=(100*10)+(n-100)*15;
        else
        if(n<=300)
        j=(100*10)+(100*15)+(n-200)*25;
        else
        if(n<=400)
        j=(100*10)+(100*15)+100*25+(n-300)*40;
        else
        if(n<=500)
        j=(100*10)+(100*15)+(100*25)+(100*40)+(n-400)*45;
        else
        j=(100*10)+(100*15)+(100*25)+(100*40)+100*45+(n-500)*55;
        System.out.println ("Total Amount="+j);
    }
}    