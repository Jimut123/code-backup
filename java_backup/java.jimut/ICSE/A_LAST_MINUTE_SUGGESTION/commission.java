package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
import java.lang.*;
class commission
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int s;
        double c;
        System.out.println("Enter the sales ::");
        s = Integer.parseInt(cd.readLine());
        if(s<=5000)
        {
            c=(5.0/100.0)*s;
        }
        else if((s>=5001)&&(s<=10000))
        {
            c=(11.0/100.0)*s;
        }
        else
        {
            c=(15.0/100.0)*s;
        }
        System.out.println("Commission ="+c);
    }
}