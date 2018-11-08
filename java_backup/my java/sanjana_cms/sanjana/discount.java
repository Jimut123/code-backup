import java.io.*;
class discount
{
    public static void main () throws IOException
    {
        int purchase,discount;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a number");
        purchase=Integer.parseInt(br.readLine());
        discount=0;
        if (purchase<=10000)
        discount=(purchase*10)/100;
        else
        if (purchase<=15000)
        discount=(purchase*15)/100;
        else
        if (purchase<=25000)
        discount=(purchase*20)/100;
        else
        if (purchase>25000)
        discount=(purchase*30)/100;
        System.out.println(discount);
    }
}

        