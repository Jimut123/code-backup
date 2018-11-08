package assignment;

import java.io.*;
class pr1
{
public static void main() throws IOException
{
int purchase,discount;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter a no.");
purchase=Integer.parseInt(br.readLine());
discount=0;
if (purchase<=10000)
discount=(10000*10)/100;
else
if (purchase<=25000)
discount=(25000*15)/100;
else
if (purchase<=50000)
discount=(50000*25)/100;
else
if (purchase>50000)
discount=(35*50000)/100;
System.out.println(discount);
}
}
