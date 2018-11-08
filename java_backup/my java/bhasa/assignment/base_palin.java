package assignment;
import java.io.*;
class base_palin
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;

public static void main(String args[])throws IOException
{
base_palin bp=new base_palin();
bp.input();

}
void input()throws IOException
{
System.out.println("ENTER NUMBER");
n=Integer.parseInt(br.readLine());
//base_palin ob=new base_palin(n);
check();
}
void check()
{
for(i=2;i<=9;i++)
{
palincheck(n,i);
}
}
void palincheck(int a,int b)
{
int arr[]=new int[100];
int k,t;
t=0;
while(a>0)
{
k=a%b;
arr[t++]=k;
a=a/b;
}
int j,f,j1;
f=0;
for(j=0,j1=t-1;j<=t/2;j++,j1--)
{
if(arr[j]!=arr[j1])
{
f=1;
break;
}
}
if(f==0)
{
System.out.println("Palindrome at base "+b);
}
}
}
