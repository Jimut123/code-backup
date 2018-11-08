import java.io.*;
class prime_in_number
{
public static void main (String args[])throws IOException
{
int n,f,i,j,k,x,y,c,d;
c=0;k=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter no.");
n=Integer.parseInt(br.readLine());
x=y=n;
while (x>0)
{
x=x/10;
c++;
}
int a[]=new int [c];
d=0;
while(y>0)
{
a[d++]=y%10;
y=y/10;
}
//for (i=0;i<d;i++)
//{
//System.out.print(a[i]+",");
//}
for (i=1;i<=n;i++)
{
f=0;
for(j=2;j<i;j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
{
k=i;
int f1=0;
while(k>0)
{
f=0;
y=k%10;
for(j=0;j<c;j++)
{
if(a[j]==y)
{
f++;
break;
}
}
if(f<=0 )
{
f1=1;
break;
}
if(f>1 )
{
f1=1;
break;
}
k=k/10;
}
if(f1==0)
System.out.println(i);
}
}
}
}
