import java . io .*;
public class dwloop
{
public static void main(String args[]) throws IOException
{
int  m,m1,n,s=0,f=0,t,k,s1,p;
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
System.out.println("ENTER THE NO. TO CHECK THE AUTOMORPHIC NO.::"); 
n = Integer.parseInt(cd.readLine());
m = n*n;
m1 = m;
do
{
k = m1%10;
s = (s*10)+k;
s1 = s;
t = 0;
do
{
p = s1%10;
t = (t*10)+p;
s1 = s1/10;
}
while(s1>0); 
if(t == n)
{
f = 1;
break;
}
m1 = m1/10;
}
while(m1>0);
if(f == 1)
{
System.out.println("AUTOMORPHIC NO.::"+n); 
}
else
{
System.out.println("NOT A AUTOMORPHIC NO.::"+n);
}
}
}









