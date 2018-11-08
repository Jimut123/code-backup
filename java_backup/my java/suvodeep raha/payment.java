import java.io.*;
class payment
{
public static void main(String args[])throws IOException
{
int word,amount;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of words ");
word=Integer.parseInt(br.readLine());
amount=0;
if (word<=10)
amount=2;
else
if (word>=11 && word<=20)
amount=5;
else
if (word>=21 && word<=30)
amount=7;
else
if (word>=30)
amount=9;
System.out.println("The amount for the given no. of words is "+amount);
}
}