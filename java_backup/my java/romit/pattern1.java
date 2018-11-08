import java.io.*;
import java.lang.*;
class pattern1
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER");
int n=Integer.parseInt(Input.readLine());
int i,j,m;
for(i=1;i<=n;i++)
{
if(i%2==0)
{
m=0;
}
else
{
m=1;
}
for(j=1;j<i;j++)
{
System.out.print(m);
System.out.println(' ');
if(m==0)
{
m=1;
}
if(m==1)
{
m=0;
}
System.out.println(' ');
}
}
}
}


