import java.io.*;
import java.lang.*;
class functionphybonaci
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,m,n,a=0,b=0,c=0;
void calculation()throws IOException
{
System.out.println("Enter The Number of Terms");
n=Integer.parseInt(Input.readLine());
a=0;
b=1;
System.out.print(a+",");
System.out.print(b+",");
for(i=0;i<n;i++)
{
c=a+b;
k=primecheck(c);
if(k==0)
System.out.print(c+",");
a=b;
b=c;
}
}
int primecheck(int k)
{
int f=0;
for(m=2;m<k;m++)
{
if(k%m==0)
{
f=1;
break;
}
}
if(f==0)
return 0;
else
return 1;
}
}