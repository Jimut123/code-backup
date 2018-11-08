import java.io.*;
class PalendromicSearch
{
public static void main(String[]args)throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i,j,d,m,l;
String s,w;
w="";
d=0;
l=0;
System.out.print("input String=");
s=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
for(j=d;j<i-1;j++)
{
w=w+s.charAt(j);
}
m=w.length()-1;
for(j=0;j<w.length()/2;j++)
{

if(w.charAt(j)==w.charAt(m))
{
l++;
}
m--;
}
if(l==w.length()/2)
{
System.out.print("\n palendrome =");
for(j=0;j<w.length();j++)
{
System.out.print(w.charAt(j));
}
}
}
w="";
l=0;
m=0;
d=i+1;
}
}
}