import java.io.*;
class daydate
{
public static void main(String args[])throws IOException
{
int n,j,p,q=0,r=0,t=0;
String a[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
int b[]={31,29,31,30,31,30,31,31,30,31,30,31};
int c[]={31,28,31,30,31,30,31,31,30,31,30,31};
String s="";

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any 6-digit no.:");
n=Integer.parseInt(input.readLine());

j=n;
while(j>0)
{
p=j%100;
t++;
//System.out.println(p);
if(t==1)
{
if(p<=9)
s=" 200"+p+s;
else
s=" 20"+p+s;
r=p;
}

else if(t==2)
{
if(p>12)
{
System.out.println("Invalid no.");
System.exit(0);
}
else
{
q=p-1;
s=" "+a[q]+","+s;
}
}

else if(t==3)
{
if(r%4==0)
{
if(p<=b[q])
s=p+"th"+s;
else
{
System.out.println("Invalid no.");
System.exit(0);
}
}
else
{
if(p<=c[q])
s=p+"th"+s;
else{
System.out.println("Invalid no.");
System.exit(0);
}
}
}
j=j/100;
}

System.out.println(s);
}
}