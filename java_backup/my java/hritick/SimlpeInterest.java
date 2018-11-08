import java.io.*;
class SimlpeInterest
{
    public static void main ()throws IOException
    {
        int SI,p,r,t;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        p=Integer.parseInt(br.readLine());
        r=Integer.parseInt (br.readLine());
        t=Integer.parseInt (br.readLine());
        SI=p*r*t/100;
        System.out.println(SI);
    }
}