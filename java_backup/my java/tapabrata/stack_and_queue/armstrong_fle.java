package stack_and_queue;
import java.io.*;
import java.util.Scanner;
class armstrong_fle
{
Scanner ob=new Scanner(System.in);
int top,i,k,x;
int s[]=new int [100];
armstrong_fle()
{
top=-1;
i=0;
k=0;
}
void push()
{
System.out.println("give the element to be pushed :");
k=ob.nextInt();
System.out.println("");
if(top>=100)
System.out.println("overflow");
else
s[++top]=k;
}
void pop()
{
if(top<0)
{
System.out.println("Empty Stack");
return;
}

System.out.println("popped element = "+s[top]+'\n');
top--;
}
void disp()
{
System.out.println("your stack :");
for(i=top;i>=0;i--)
System.out.println(s[i]+", ");
System.out.println("");
}
void check()throws IOException
{
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("armstrong.txt")));
for(i=top;i>=0;i--)
{
int a=s[i],s1=0;
while(a>0)
{
int m=a%10;
s1=s1+(m*m*m);
a=a/10;
}
if(s1==s[i])
pw.println(s1);
}
System.out.println("all armstrong numbers  stored in  file");
pw.close();
}
void fle_disp()throws IOException
{
BufferedReader ob=new BufferedReader(new FileReader("armstrong.txt"));
String s="";
if((s=ob.readLine())==null)
{
System.out.println("File still empty ");
ob.close();
}
else
{
ob=new BufferedReader(new FileReader("armstrong.txt"));
s="";
System.out.println("Output of File :");
while((s=ob.readLine())!=null)
System.out.println(s);
System.out.println("");
ob.close();
}
}
}


