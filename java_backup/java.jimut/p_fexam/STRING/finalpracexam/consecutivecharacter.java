package STRING.finalpracexam;


import java.io.*;
class consecutivecharacter
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch,c;
int i,l,j,k;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
c=n.charAt(i+1);
j=(int)ch;
j=j+1;
k=(int)c;
if(k==j)
{
System.out.println(ch+","+c);
}
}
}
}