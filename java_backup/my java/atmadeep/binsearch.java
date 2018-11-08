import java.io.*;
class binsearch
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int i,j,h,l,mid,f;
String s,w,w1,w2;
String s1[]=new String[100];
int t=0;
System.out.println("Enter the String:");
s=input.readLine();
w=w1=w2="";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
s1[t]=w;
t++;
w="";
}
else
w=w+s.charAt(i);
}
s1[t]=w;
t++;
for(i=0;i<t;i++)
s1[i]=s1[i].toUpperCase();
for(i=0;i<t-1;i++)
for(j=i+1;j<t;j++)
if(s1[i].compareTo(s1[j])>0)
{
w2=s1[i];
s1[i]=s1[j];
s1[j]=w2;
}
System.out.println("Enter the Searching String:");
w1=input.readLine();
w1=w1.toUpperCase();
l=0;
h=t-1;
mid=(h+l)/2;
f=0;
while(l<=h)
{
if(s1[mid].equalsIgnoreCase(w1)==true)
{
f=1;
break;
}
else
if(w1.compareTo(s1[mid])>0)
l=mid+1;
else
if(w1.compareTo(s1[mid])<0)
h=mid-1;
mid=(l+h)/2;
}
if(f==1)
System.out.println("found");
else
System.out.println("not found");
}
}
