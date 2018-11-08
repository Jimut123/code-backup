import java.io.*;
class discount
{
    public static void main () throws IOException
    {
        int purchase, discount;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number");
        purchase=Integer.parseInt(br.readLine());
        discount=0;
        if(purchase<=10000)
        discount=(10/100)*purchase;
        else
        if (purchase<=25000)
        discount=(15/100)*purchase;
        else
        if (purchase<=50000)
        discount=(15/100)*purchase;
        else
        if (purchase>50000)
        discount=(35/100)*purchase;
        System.out.println(discount);
    }
}
    