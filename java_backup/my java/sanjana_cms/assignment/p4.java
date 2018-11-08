package assignment;

import java.io.*;
class p4
{

int i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int x;
void start()throws IOException
{
System.out.println ("Press 1for armstrong number");
System.out.println("Press 2 for duck number");
System.out.println("Press 3 for krishnamurti number");
System.out.println("Enter choice");
x=Integer.parseInt(br.readLine());
switch(x)
{
    case 1: arm();
            break;
    case 2: duck();
            break;
   case 3:  krish();
      break;
    }
}
            
void arm()throws IOException
{
    int n,s,n1,k;
n=Integer.parseInt (br.readLine());
s=0;
n1=n;
while(n1>0)
{
k=n1%10;
s=s+(k*k*k);
n1=n1/10;
}
if (s==n)
System.out.println("Armstrong number");
else
System.out.println("Non Armstrong number");
}
void duck()throws IOException
{
int n,s,n1,k,f;
n=Integer.parseInt (br.readLine());
n1=n;f=0;
while(n1>0)
{
k=n1%10;
if(k==0)
{
f=1;
break;
}
n1=n1/10;
}
if(f==1)
System.out.println("Duck number");
}

void krish()throws IOException
{
int n,s,n1,k,f,j;
n=Integer.parseInt(br.readLine());
n1=n;
s=0;
while(n1>0)
{
k=n1%10;
f=1;
for (j=1;j<=k;j++)
f=f*j;
s=s+f;
n1=n1/10;
}
if(s==n)
System.out.println("krishnamurti number");

}
public static void main()throws IOException
{
  p4 pp=new p4();
  pp.start();
}
}




