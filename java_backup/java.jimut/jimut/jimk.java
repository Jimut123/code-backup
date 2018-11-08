import java .io.*;
public class perfectnumber
{
public static void main(String args[])throws IOException
{
int n,s,i;
s = 0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number:");
n=Integer.parseInt(br.readLine());
for(i =1 ; i < n ; i ++)
{
if (n % i == 0)
s = s + i;
}
if(s == n)
System.out.println("perfect");
else
System.out.println("it is not a perfect number"+n);
}
}