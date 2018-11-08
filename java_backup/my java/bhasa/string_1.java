import java.io.*;
class string_1
{
public static void main (String args[])throws IOException
{
int n,c,d,e,m,i,j,k;
String v="aeiou",w="",x="";
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter no. of array elements");
n=Integer.parseInt(br.readLine());
String s[]=new String [n];
for (i=0;i<n;i++)
{
s[i]=br.readLine();
}
m=0;
for (i=0;i<n;i++)
{
w=s[i];
c=0;
for (j=0;j<v.length();j++)
{
for (k=0;k<w.length();k++)
{
if (w.charAt(k)==v.charAt(j))
{
c=c+1;
}
}
}
System.out.println (c);
d=c*100;
e=d/w.length();
System.out.println (e);
if (e>m)
{
m=e;
x=w;
}
w="";
c=0;
d=0;
e=0;

}
System.out.print (x);
}
}


