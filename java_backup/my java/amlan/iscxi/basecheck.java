package iscxi;


import java.io.*;
class basecheck
{
int x,y,i,j,kl,f;
String s,s1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give Number1:");
x=Integer.parseInt(br.readLine());
System.out.println("Give Number1:");
y=Integer.parseInt(br.readLine());
for(i=2;i<=x;i++)
{
s="";
f=0;
s=basen(x,i);
for(j=2;j<=y;j++)
{
s1="";
s1=basen(y,j);
if(s.compareTo(s1)==0)
{
System.out.println("Number:"+x+" "+"Base:"+i+" "+"Value:"+s+" "+"="+"Number:"+y+" "+"Base:"+j+" "+"Value:"+s+" ");
//f=1;
//break;
}
}
//if(f==1)
//break;
}
}
String  basen(int k, int l)
{
int p;
String s2;
s="";
while(k>0)
{
p=k%l;
if(p==0)
s=s+"0";
else
if(p==1)
s=s+"1";
else
if(p==2)
s=s+"2";
else
if(p==3)
s=s+"3";
else
if(p==4)
s=s+"4";
else
if(p==5)
s=s+"5";
else
if(p==6)
s=s+"6";
else
if(p==7)
s=s+"7";
else
if(p==8)
s=s+"8";
else
if(p==9)
s=s+"9";
else
if(p==10)
s=s+"A";
else
if(p==11)
s=s+"B";
else
if(p==12)
s=s+"C";
else
if(p==13)
s=s+"D";
else
if(p==14)
s=s+"E";
else
if(p==15)
s=s+"F";
k=k/l;
}
return s;
}
}