import java.io.*;
class calculation
{
int i,n,j,s,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void input()throws IOException
{
System.out.println("GIVE A NUMBER");
n=Integer.parseInt(br.readLine());
calculate();
}
public void calculate()
{
for(i=1;i<n;i++)
{
s=0;
for(j=i;j<n;j++)
{
s=s+j;
if(s==n)
{
for(k=i;k<=j;k++)
System.out.print(k+" + ");
System.out.println("");
}
else
if(s>n)
{
break;
}
}
}
}
}
