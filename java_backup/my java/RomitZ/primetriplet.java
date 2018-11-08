import java.io.*;
class primetriplet
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,n,c,m,x,f=0,f1=0,l;
System.out.println("Enter The Upper Boundary");
n=Integer.parseInt(Input.readLine());
System.out.println("Enter The Lower Boundary");
m=Integer.parseInt(Input.readLine());
k=m;
while(k<=n)
{
f=0;
for(i=2;i<k;i++)
if(k%i==0)
{
f=1;
break;
}
if(f==0)
{
System.out.println("");
System.out.print(k+",");
c=0;x=k+1;
while(c<2)
{
f1=0;
for(i=2;i<x;i++)
{
if(x%i==0)
{
f1=1;
break;
}
}
if(f1==0)
{
System.out.print(x+",");
c++;
}
x++;
}
}

k++;
}
}
}

