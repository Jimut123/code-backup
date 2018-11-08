import java.io.*;
class combi
{
public static void main(String args[])throws IOException
{
long g,s,s1,s2,h,k,t,j,n,t1,t2,t3,p,p1,p2,h1,t4,num;
int i;
char ch[]=new char[100];
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. only upto 7 digits:");
n=Integer.parseInt(input.readLine());
if(n>7)
{
System.out.println("Error");
System.exit(0);
}
for(i=1;i<=n;i++)
{
ch[i]=(char)System.in.read();
}
g=1;
s=0;
while(g<=n)
{
s=(s*10)+g;
g++;
}
s1=s;
s2=0;
h=0;
while(s1>0)
{
s2=(s2*10)+(s1%10);
t1=1;
for(j=1;j<=(s1%10);j++)
t1=t1*j;
h=h+t1;
s1=s1/10;
}
System.out.println("No of Permutations:");
num=0;
for(k=s;k<=s2;k++)
{
  t1=k;
  h1=0;
  while(t1>0)
  {
  p=t1%10;
  if(p!=0)
  {
  t4=1;
  for(j=1;j<=p;j++)
  t4=t4*j;
  h1=h1+t4;
  }
  t1=t1/10;
  }
  //System.out.println(h1);
  if(h1==h)
  {
  //System.out.println("Found");
  t1=k;
  t3=0;
  while(t1>0)
  {
  p1=t1%10;
  t3=(t3*10)+p1;
  t1=t1/10;
  }
  while(t3>0)
  {
  p2=t3%10;
  System.out.print(ch[(int)p2]);
  t3=t3/10;
  }
  System.out.println("");
  num++;
  }
}

System.out.println("Total No of Permutations:"+num);
//System.out.println(s2);
}
}

