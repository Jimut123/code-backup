import java.io.*;
class HCF
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int a,b,c,d,k;
System.out.println("Enter any number:");
a=Integer.parseInt(cd.readLine());
b=Integer.parseInt(cd.readLine());
if(a>b)
{
c=a;
d=b;
}
else
{
c=b;
d=a;
}
while(c%d!=0)
{
k=c%d;
c=d;
d=k;
}
System.out.println("HCF"+d);
}
}
