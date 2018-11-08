import java.util.*;
 class co
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no. to test");
int n=sc.nextInt();
int m=n;
int t=0;

String m1="";
while(m>0)
{
m=m/10;
t=t+1;
}
String w=Integer.toString(n);
String hl="";
for(int i=0;i<t;i++)
{
String g="";
g=g+w.charAt(i);
for(int j=0;j<t;j++)
{
int s=Integer.parseInt(g);
String kk="";
kk=kk+w.charAt(j);
int f=Integer.parseInt(kk);
if(kk!=g)
if(f<s)
{
hl=hl+w.charAt(j);
}
}
m1=m1+hl;
}
int xyz=0;
for(int i=0;i<t-1;i++)
{
String dd1="";
dd1=dd1+w.charAt(i);
String dd2="";
dd2=dd2+w.charAt(i+1);
int d1=Integer.parseInt(dd1);
int d2=Integer.parseInt(dd2);
if(d2-d1==1)
{
xyz=xyz+1;
}
}

if(xyz==t)
{
System.out.println("Consecutive no.");
}
else
{
System.out.println("not a consecutive no.");
}
}
}

