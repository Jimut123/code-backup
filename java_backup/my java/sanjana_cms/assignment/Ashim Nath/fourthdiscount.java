import java.io.*;
class fourthdiscount
{
public static void main(int n) throws IOException
{
int purchase,discount;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter a no.");
discount=0;
if (purchase<=10000)
discount=(10/100*10000);
else
if (purchase<=25000)
discount=(15/100*25000);
else
if (purchase<=50000)
discount=(25/100*50000);
else
if (purchase<=50000)
discount=(35/100*50000);
System.out.println(discount);
}
}
