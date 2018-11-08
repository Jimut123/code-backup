import java.io.*;
class wondrousmatrix
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int sum=0,f=0,i,k,sum1=0,t,L,r=0,c=0;
System.out.println("Enter The value of n");
int n=Integer.parseInt(Input.readLine());
int A[][]=new int[n][n];
double m=0.5*n*((n*n)+1);
for(i=0;i<n;i++)
{
System.out.println("Enter Nos:");
for(k=0;k<n;k++)
{
A[i][k]=Integer.parseInt(Input.readLine());
}
}
for(i=0;i<n;i++)
{sum=0;sum1=0;
for(k=0;k<n;k++)
{
sum=sum+A[i][k];
sum1=sum1+A[k][i];
}
if((sum!=m)&&(sum1!=m))
{
f=1;
break;
}
}
if(f==0)
{
System.out.println("Wondrous");
}
else
{
System.out.println("Not");
}
for(i=0;i<n;i++)
{
for(k=0;k<n;k++)
{
t=A[i][k];
f=0;
for(L=2;L<t;L++)
{
if(t%L==0)
{
f=1;
break;
}
}
if(f==0)
{

System.out.println(A[i][k]+" "+i+" "+k);
}
}
}
}
}
