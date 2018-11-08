import java.io.*;
class sum_diff
{
public static void main(String[]args)throws IOException
{
int a,b;
a=0;
b=0;
DataInputStream in =new DataInputStream(System.in);
System.out.println("Enter the value of a");
a=Integer.parseInt(in.readLine());
System.out.println("Enter the value of b");
b=Integer.parseInt(in.readLine());
System.out.println("The sum of two nos. ="+(a+b) );
System.out.println("The difference of the two nos. ="+(a-b) );
}
}