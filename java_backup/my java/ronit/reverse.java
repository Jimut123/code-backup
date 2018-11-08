import java.io.*;
class reverse
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n=123,s=0,r=0;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
System.out.println(s);
}
}