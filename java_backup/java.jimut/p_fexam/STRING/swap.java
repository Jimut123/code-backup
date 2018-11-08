package STRING;


import java.io.*;
class swap
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a,b;
System.out.println("Enter the values of a & b:");
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
a=a+b;
b=a-b;
a=a-b;
System.out.println("Value of a-swap:"+a);
System.out.println("Value of b-swap:"+b);
}
}