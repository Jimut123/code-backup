package sanjana_cms;

import java.io.*;
class reverse2
{
public static void main () throws IOException
{
String S;
int i, j, p;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println ("Enter a String");
S=br.readLine();
for (i=S.length()-1; i>=0; i--)
{
if(S.charAt(i)==' ')
{
for (j=W.length()-1; j>=0; j--)
System.out.print(W.charAt(j));
W="";
p=i;
}
else
W=W+S.charAt(i);
}
for (i=0; i<p; i++)
System.out.println(s.charAt(i));
}
}