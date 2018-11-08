import java.io.*;
class nat_combi
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int n,m,k,t,i,j,n1;
int s=0;
char ch;
System.out.println("Enter the number:");
n=Integer.parseInt(input.readLine());
s=0;
if(n<9)
n1=n;
else
n1=9;
for(i=1;i<=n1;i++)
{
j=1;
s=i;
while(j<=9)
{
if(j!=i)
{
s=s+j;
if((n-s)>=0 && (n-s)<=9)
{
//System.out.println("Yes");
System.out.println(i+"+"+j+"+"+(n-s));
s=i;
}
else
{
t=s;
//System.out.println("Yes"+t);
for(m=t;m<=(n-s);m++)
{
s=s+m;
if((n-s)>=0 && (n-s)<=9)
{
System.out.println(i+"+"+j+"+"+m+"+"+(n-s));
s=i;
break;
}
else
if(s==n)
{
System.out.print(i+"+"+j);
for(k=t;k<=m;k++)
System.out.print(k);
s=i;
break;
}
else
if(s>n)
{
s=i;
break;
}
}
}
}
j++;
}
System.out.println("Press any key to continue..............");
ch=(char)System.in.read();
}
}
}


