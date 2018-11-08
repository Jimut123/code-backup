import java.io.*;
class recurdigit
{
int n,j,p,max,min;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
recurdigit()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
j=n;
max=n%10;
min=n%10;
digit();
}
void digit()
{
if(j==0)
{
System.out.println("Maximum digit is:"+max);
System.out.println("Minimum digit is:"+min);
return;
}
else
{
p=j%10;
if(p>max)
{
max=p;
}
else
if(p<min)
{
min=p;
}
j=j/10;
digit();
}
}
}