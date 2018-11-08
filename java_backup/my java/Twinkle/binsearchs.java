import java.io.*;
class binsearchs
{
public static void main(String args[])throws IOException
{
int i,j,k=0,p,t=0,q=0,high,low,mid,f=0;
String a[]=new String[100];
String s,w="",v;
char ch,h;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any text.:");
s=input.readLine();

w="";
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
if((ch==' ')||(ch==',')||(ch=='.')||(ch=='!')||(ch=='?'))
{
if(w!="")
{
a[k]=w;
k++;
w="";
}
}
else
w=w+ch;
}
if(w!="")
{
a[k]=w;
k++;
w="";
}

for(i=0;i<k;i++)
{
a[i]=a[i].toUpperCase();
}

for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
if(a[j+1].compareTo(a[j])>0)
{
w=a[j];
a[j]=a[j+1];
a[j+1]=w;
}
}
}

System.out.println("Enter word to be searched:");
v=input.readLine();
v=v.toUpperCase();
f=0;
low=0;
high=k-1;

while(high>=low)
{
mid=(high+low)/2;
if(a[mid].compareTo(v)==0)
{
f=1;
break;
}
else
if(a[mid].compareTo(v)>0)
{
low=mid+1;
}
else
if(a[mid].compareTo(v)<0)
{
high=mid-1;
}
}

if(f==1)
System.out.println("Word Is Found");
else
System.out.println("Word Is NOT Found");
}
}
