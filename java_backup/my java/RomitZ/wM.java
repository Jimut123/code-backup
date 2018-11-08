import java.io.*;
class wM
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,m,n,S=0,S1=0,l;
System.out.println("Enter The Length Of Matrix");
n=Integer.parseInt(Input.readLine());
int A[][]=new int[n][n];
m=(int)((0.5)*((n)*((n*n)+1)));
//System.out.println(m);
for(i=0;i<n;i++)
{
for(k=0;k<n;k++)
{
System.out.println("Enter The Nos in Arry");
A[i][k]=Integer.parseInt(Input.readLine());
}
}
int f=0;
for(i=0;i<n;i++)
{
S=S1=0;
for(k=0;k<n;k++)
{
S=S+A[i][k];
S1=S1+A[k][i];
}
//System.out.println(S);
//System.out.println(S1);
if(S!=m || S1!=m)
{
f=1;
break;
}
}
if(f==0)
{
System.out.println("Wondrous Matrix");
}
else
{
System.out.println("Not A Wondrous Matrix");
}
}
}



