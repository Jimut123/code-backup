import java.io.*;
class mersene
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,n,f;
String s;
double d;
do
{
System.out.println("Enter no:");
n=Integer.parseInt(input.readLine());
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
System.out.println("Want Another(Yes/No)");
s=input.readLine();
if(s.compareTo("n")==0||s.compareTo("N")==0||s.compareTo("NO")==0||s.compareTo("No")==0||s.compareTo("no")==0||s.compareTo("nO")==0)
 break;
}while(true);
}
}
