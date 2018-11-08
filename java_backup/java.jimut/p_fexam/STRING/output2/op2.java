package STRING.output2;


import java.io.*;
class op2
{
public static void main(String[]args)throws IOException
{
int p[]={11,21,31,41,51};
p[0]=10;
p[3]=p[1];
int m=p[1]-p[0];
int n=p[3]+22+p[2];
System.out.print("The difference="+m);
System.out.println("The sum="+n);
}
}