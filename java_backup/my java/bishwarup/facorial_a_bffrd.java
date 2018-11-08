import java.io.*;
class facorial_a_bffrd
{
public static void amin(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int n,s=0,i,x,j=1,f,k,t=1;
System.out.print("GIVE TERM");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
f=1;
for(k=1;k<=j;k++)
f=f*k;
s=s+(j/f);
j=j+2;
}
System.out.print(s);
}
}