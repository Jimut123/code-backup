package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class palprme_fle
{
Scanner ob=new Scanner(System.in);
int top,i,x,n;
String s="";
int a[]=new int [100];
palprme_fle()throws IOException
{
top=-1;
i=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("number.txt")));
s="";
do
{
System.out.println("give the number :");
n=ob.nextInt();
pw.println(n);
System.out.println("want to give more? (y/n) :");
s=br.readLine();
System.out.println("");
}while(s.equalsIgnoreCase("y")==true);
pw.close();
}
void fle_disp()throws IOException
{
BufferedReader ob=new BufferedReader(new FileReader("number.txt"));
s="";
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
System.out.println(s);
ob.close();
System.out.println("");
}
void push()throws IOException
{
BufferedReader ob=new BufferedReader(new FileReader("number.txt"));
s="";
while((s=ob.readLine())!=null)
{
int m=Integer.parseInt(s);
n=m;
int r=0,f=0,f1=0;
while(n>0)
{
r=(r*10)+(n%10);
n=n/10;
}
if(r==m)
{
for(i=2;i<r;i++)
if(r%i==0)
{
f=1;
break;
}
if(f==0)
{
for(i=top;i>=0;i--)
if(m==a[i])
{
f1=1;
break;
}
if(f1==0)
{
a[++top]=m;
break;
}
}
}
}
ob.close();

}
void disp()
{
if(top==-1)
System.out.println("empty...............\n");
else
{
System.out.println("your palprime stack :");
for(i=top;i>=0;i--)
System.out.println(a[i]+", ");
System.out.println("");
}
}
}

