import java.io.*;
class stringop
{
//declairation of variables
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String s;
int k,k1,i;
char c,c1;
//define the constructor
stringop()
{
s="";
}
//define the function readstring
void readstring()throws IOException
{
System.out.print("ENTER A STRING");
s=br.readLine();
circulardecode();
}
//define the function circulardecode
void circulardecode()
{
for(i=0;i<s.length();i++)
{
c=s.charAt(i);
k=(int)c;
if(k==90)
k1=65;
else
if(k==122)
k1=97;
else
k1=k+1;
c1=caseconverter(k,k1);
System.out.print(c1);
}
}
//define the function caseconverter
char caseconverter(int k,int k1)
{
if(k>=65 && k<=90)
{
k1=k1+32;
}
else
if(k>=97 && k<=122)
{
k1=k1-32;
}
return((char)k1);
}
}