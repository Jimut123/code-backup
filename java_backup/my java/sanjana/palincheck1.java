 

import java.io.*;
class palincheck1
{
String S;
int i,j,f;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
void input ()throws IOException
{
System.out.println("Enter String");
S=br.readLine();
cal();
}
void cal()
{
int f=0;
for (i=0,j=S.length()-1;i<=S.length()/2;i++,j--)
{
if (S.charAt(i)!=S.charAt(j))
{
f=1;
break;
}
}
if (f==0)
System.out.println ("palinodrom");
else
System.out.println("not palinodrom");
}
}
