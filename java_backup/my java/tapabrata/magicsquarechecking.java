 

import java.io.*;
class magicsquarechecking
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[6][6];
int i,j,k,s,s1,s2,s3,s4,f,f1;
System.out.println("give  elements:");
for(i=0;i<6;i++)
for(j=0;j<6;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("");
System.out.println("Matrix:");
for(i=0;i<6;i++)
{
for(j=0;j<6;j++)
System.out.print(a[i][j]+", ");
System.out.println("");
}
System.out.println("");
s=0;
for(j=0;j<6;j++)
s=s+a[0][j];
f=0;
for(i=1;i<6;i++)
{
s1=0;
for(j=0;j<6;j++)
s1=s1+a[i][j];
if(s1!=s)
{
f=1;
break;
}
if(f==1)
break;
}
if(f==0)
{
for(i=0;i<6;i++)
{
s1=0;
for(j=0;j<6;j++)
s1=s1+a[j][i];
if(s1!=s)
{
f=1;
break;
}
if(f==1)
break;
}
}
if(f==0)
{
s1=0;
for(i=0;i<6;i++)
{
s1=s1+a[i][i];
}
if(s1!=s)
{
f=1;
}
}
if(f==0)
{
s1=0;
j=3-1;
for(i=0;i<6;i++)
{
s1=s1+a[i][j];
j--;
}
if(s1!=s)
{
f=1;
}
}
if(f==0)
System.out.println("the matrix is a magic sq");
else
System.out.println("the matrix is not a magic sq");
}
}
