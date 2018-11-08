import java.io.*;
class length
{
public static void main(String args[])throws IOException
{
int min,max,p=0,c,i,j,k;
String s;
char ch=' ';
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter sentence:");
s=input.readLine();
min=s.length();
c=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
//System.out.println("C:::"+c);
if(min>c)
{
min=c;
}
c=0;
}
else
c++;
}
if(min>c)
{
min=c;
}
max=0;
c=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch==' ')
{
//System.out.println("C:::::"+c);
if(max<c)
{
max=c;
}
c=0;
}
else
c++;
}
//System.out.println("C;"+c);
if(max<c)
{
max=c;
c=0;
}
//System.out.println("Min:"+min);
//System.out.println("Max"+max);
p=0;
for(i=min;i<=max;i++)
{
c=0;
k=0;
p=0;
for(j=0;j<s.length();j++)
{
ch=s.charAt(j);
if(ch==' ')
{
if(c==i)
{
//System.out.println("C;"+c+" i"+i);
for(k=p;k<=(c+p);k++)
{
System.out.print(s.charAt(k));
}
System.out.println(" ");
}
p=j;
c=0;
//break;
}
else
c++;
}
if(c==i)
{
//System.out.println("P::"+p);
//System.out.println("C;"+c+" i"+i);
for(k=p;k<=(c+p);k++)
{
System.out.print(s.charAt(k));
}
System.out.println(" ");
}
}
}
}
//System.out.println("");
