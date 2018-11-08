import java.io.*;
class palindrum
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
String A[]=new String[10];
int i,k,l,f=0;
String w="";
char h;
for(i=0;i<10;i++)
{
System.out.println("Enter Ten Words");
A[i]=Input.readLine();
}
for(k=0;k<10;k++)
{
f=0;
for(l=A[k].length()-1;l>=0;l--)
{
w=w+A[k].charAt(l);
}
if(A[k].compareTo(w)==0)
{
f=1;
}
else
{
f=0;
}
if(f==1)
{
System.out.println("The Word Is Palindrum:" +A[k]);
}
w="";
}
}
}