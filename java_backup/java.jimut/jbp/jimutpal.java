
import java.io.*;
class jimutpal
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,m,a,g;
int i,l,b=0;
char ch,j,k;
System.out.println("ENTER A CONTAINING THREE WORD::");
s = cd.readLine();
l = s.length();
for(i=0;i<=l-1;i++)
{
ch = s.charAt(i);
if(ch==' ')
{
b=b+1;
if(b==1)
{
j=s.charAt(i);
}
else if(b==2)
{
k=s.charAt(i);
}
}
}
a = substring(0,j);
g = s.substring(k,l);
m=a+g;
System.out.println(m);
}
}



