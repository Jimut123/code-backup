package special;


import java.io.*;
class permute2
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String a;
char b[]=new char[100];
int i,j,k,l,t,c;
void input()throws IOException
{
System.out.println("Give string:");
a=br.readLine();
t=1;
for(i=0;i<a.length();i++)
{
b[t++]=a.charAt(i);
}
c=0;
cal();
}
void cal()
{
for(i=1;i<=4;i++)
{
for(j=1;j<=4;j++)
{
if(i==j)
j=j+1;
if(j>4)
break;
for(k=1;k<=4;k++)
{
if(i==k )
k=k+1;
if(j==k)
k=k+1;
if(i==k )
k=k+1;
if(k>4)
break;
l=10-(i+j+k);
if(l>4 || l<0)
break;
System.out.print(b[i]);
System.out.print(b[j]);
System.out.print(b[k]);
System.out.print(b[l]);
System.out.println("");
c=c+1;
}
}
}
System.out.println("Total:"+c);
}
}
