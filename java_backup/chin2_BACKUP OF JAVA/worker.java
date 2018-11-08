import java.io.*;
public class worker
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        System.out.println("ENTER THE WORKING HOURS::");
        int hour = Integer.parseInt(br.readLine());
        long wage;
        if(hour <= 3)
        {
            wage = hour*20;
        }
        else if((hour>3)&&(hour<=5))
        {
            wage = (3*20)+((hour-3)*25);
        }
        else if((hour>5)&&(hour<=8))
        {
            wage = (3*20)+(2*25)+((hour-5)*30);
        }
        else
        {
            wage = (3*20)+(2*25)+(3*30)+((hour-8)*40);
        }
        System.out.println("YOUR WAGE IS = "+wage);
    }
}
