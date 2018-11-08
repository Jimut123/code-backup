import java.io.*;
class mersene
{
public static void main(int n)throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,f;
String s;
double d;

f=0;
for(i=1;i<=n;i++)
{
d=Math.pow(2,i);
if((double)n==(d-1))
{
f=1;
break;
}
}
if(f==1)
System.out.println("Mersene No:"+n+" "+i);
else
System.out.println("No Mersene No:"+n);

}
}
