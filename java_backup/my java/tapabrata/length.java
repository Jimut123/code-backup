import java.io.*;
class length
{public static void main(String args[])throws IOException
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,t1;
String s1,w,t;
System.out.println("Give String:");
s1=br.readLine();
String s[]=new String[s1.length()];
w="";
t="";
t1=0;
for(i=0;i<s1.length();i++)
{if(s1.charAt(i)==' ')
{
s[t1++]=w;
w="";
}
else
w=w+s1.charAt(i);
}
s[t1++]=w;
for(i=0;i<t1;i++)
{
System.out.print(s[i]+" ");
}
System.out.println("");
for(i=0;i<t1-1;i++)
for(j=i+1;j<t1;j++)
{
if(s[i].length()>s[j].length())
{
t=s[i];
s[i]=s[j];
s[j]=t;
}
}
for(i=0;i<t1;i++)
{
System.out.print(s[i]+" ");
}
}
}