import java.io.*;
class dateplus
{
public static void main(String args[])throws IOException
{
int i,t=0,d=0,m=0,y=0,days=0,p=0;
String s,w="",s1="";
char ch;
int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int b[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter date: (dd/mm/yyyy)");
s=input.readLine();

t=0;
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if(ch=='/')
{
t++;
if(t==1)
d=Integer.parseInt(w);
else
if(t==2)
m=Integer.parseInt(w);
w="";
}
else
w=w+ch;
}
y=Integer.parseInt(w);
w="";

System.out.println("Enter days to be added :");
days=Integer.parseInt(input.readLine());

if((y%4==0)||(y%400==0))
p=b[m];
else
p=a[m];

while(days>0)
{

if(d>p)
{
System.out.println("D (d>p) :"+d);
d=1;
m++;
System.out.println("M (d>p) :"+m);
}
else
if(m>12)
{
d=1;
m=1;
y++;
System.out.println("M (m>12) :"+m+"; D :"+d);
}

else
{
if((y%4==0)||(y%400==0))
p=b[m];
else
p=a[m];

d++;
}
days--;
System.out.println(days);
}

s1=s1+d+'/'+m+'/'+y;

System.out.println("New date: "+s1);
}
}