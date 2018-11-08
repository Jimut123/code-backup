import java.io.*;
class hcf
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int a,b,c,d;
void input()throws IOException
{
System.out.println("Enter the 1st number");
a=Integer.parseInt(input.readLine());
System.out.println("Enter the 2nd number");
b=Integer.parseInt(input.readLine());
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
System.out.println(Hcf(c,d));
}
int Hcf(int c,int d)
{
if(c%d==0)
return d;
else
{
int k=c%d;
c=d;
d=k;
return(Hcf(c,d));
}
}
}
