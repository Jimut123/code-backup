import java.io.*;
class recurhcf
{
int a,b,x,y,l,h,temp;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// 
recurhcf()throws IOException
{
System.out.println("Enter no.:");
a=Integer.parseInt(br.readLine());
System.out.println("Enter another no.:");
b=Integer.parseInt(br.readLine());
if(a>b)
{
x=a;
y=b;
}
else
{
x=b;
y=a;
}
hcf();
}
void hcf()
{
if(x%y==0)
{
System.out.println("H.C.F. :"+y);
return;
}
else
{
temp=x%y;
x=y;
y=temp;
hcf();
}
}
}