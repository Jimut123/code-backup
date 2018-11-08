package sanjana_cms;

import java.io.*;
class string1
{
public static void main ()throws IOException
{
String S;
int i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter a String");
S=br.readline();
Sp=0;
for(i=0;i<S.length();i++)
if(S.charAt(i)=='.')
Sp++;
System.out.println("Word count:"Sp+1);
}
}