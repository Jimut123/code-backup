import java.io.*;
class handcricket
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int i,j,a=0,g=0,n=1,sump=0,sumc=0,k=0,con,o,comp=3;
System.out.println(" YOUR CHOICE IS EVEN:");
o = Integer.parseInt(cd.readLine());
if(o%2 == 0)
{
System.out.println("COMPUTER IS BALLING FIRST:");
for(i=0;i<n;i++)
{
System.out.println("ENTER YOUR THROW:");
j = Integer.parseInt(cd.readLine()); 
a = a+(2*i)+g;
if(a|=j)
{
System.out.println(":");
}
n=n+1;
sump = sump+j;
sumc = sumc+a;
if(a>6)
{
a=a-(2*3);
g=1;
}
System.out.println("COMPUTER'S THROW:"+a);
if(sump>sumc)
{
k=1;
}
else
{
k=0;
}
if(a==j)
{
System.out.println("GAME OVER:::");
n=i;
break;
}
}
if(k==1)
{
System.out.println("PLAYER IS WINNER:");
}
else
{
System.out.println("COMPUTER IS WINNER:");
}
}
}

