 package iscxi;


//Lucky Numbers
import java.io.*;
class luckyno
{
BufferedReader br =new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
int a[]=new int[100];
int b[]=new int[100];
int i,n,p,q,j,k;
void input()throws IOException
{
System.out.println("Give no:");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
a[i]=i+1;
disp();
}
void disp()
{
System.out.println("The series of Lucky no:");
for(i=0;i<n;i++)
System.out.print(a[i]+",");
System.out.println("");
k=1;
p=k;
q=2;
while(p<=n)
{
j=0;
for(i=0;i<n;i++)
{
if(p!=i)
{
//cout<<p<<"  "<<i<<endl;
//getch();
\/cout<<a[i]<<endl;
b[j++]=a[i];
}
else
p=p+q;
}
for(i=0;i<j;i++)
System.out.print(b[i]+",");
System.out.println("");
for(i=0;i<j;i++)
a[i]=b[i];
n=j;
k++;
p=k;
q=q+1;
}
}
}

