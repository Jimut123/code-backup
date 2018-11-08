import java.io.*;
class wordcount
{
public static void main(String args[])throws IOException
{
int i,j,p,c,k=0;
String a[]=new String[100];
String s,s1,w="",w1="";
char ch;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter text:");
s=input.readLine();
s1=s.toUpperCase();
ch=s.charAt(s.length()-1);

if(ch!='.')
{
System.out.println("Error!!");
}
else
{
w="";
for(i=0;i<s1.length();i++)
{
ch=s1.charAt(i);
if((ch==' ')||(ch=='.'))
{
a[k]=w;
k++;
w="";
}
else
w=w+ch;
}

w="";
for(i=0;i<k;i++)
{
for(j=0;j<k-i-1;j++)
{
if(a[j+1].compareTo(a[j])<0)
{
w=a[j+1];
a[j+1]=a[j];
a[j]=w;
}
}
}


System.out.println("Words           Word Count");
w="";
c=0;
p=0;
for(i=p;i<k;i++)
{
w=a[i];
c=0;
for(j=p;j<k;j++)
{
if(w.compareTo(a[j])==0)
{
a[j]="";
c++;
}
else
{
p=j;
break;
}
}

w1="";
for(j=0;j<20-w.length();j++)
w1=w1+" ";

if((c!=0)&&(w!=""))
System.out.println(w+w1+c);
w="";
}
}
}
}
