package project_2011_half_yearly;
//truth table of given binary digit
import java.io.*;
class truthtable
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[100];
int i,j,tmp,f,n,k;
void input()throws IOException
{
System.out.println("Give no of binary digits");
n=Integer.parseInt(br.readLine());
for(i=0;i<100;i++)
{
a[i]=0;
}
for(i=0;i<(int)(Math.pow(2,n));i++)
{
bin(i);
for(int i=n-1;i>=0;i--)
System.out.print(a[i]);
System.out.println("");
}

}
void bin(int x)
{
f=0;
while(x>0)
{
k=x%2;
a[f++]=k;
x=x/2;
}
}
}
