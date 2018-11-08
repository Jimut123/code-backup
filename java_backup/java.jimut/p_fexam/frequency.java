import java.io.*;
class frequency
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch,c;
int i,l,count=0;
System.out.println("Enter a sentence and find frequency:");
n=cd.readLine();
System.out.println("Enter a character whose frequency is to be checked:");
c=(char)(cd.read());
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==c)
{
count=count+1;
}
}
System.out.println("Frequency:"+count);
}
}
