package STRING;


import java.io.*;
class change
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int i,l;
String n,p="",q="";
char ch;
System.out.println("Enter any string:");
n=cd.readLine();
n="January 26 is celebrated as the Republic Day of India";
n=n+"";
l=n.length();
for(i=0;i<l;i++)
{
ch=n.charAt(i);
if(n!=' ')
q=q+ch;
else
{
if(q.compareTo("26")==0)
p=p+""+"15";
else if(q.compareTo("January")==0)
p=p+""+"August";
if(q.compareTo("Republic")==0)
p=p+""+"Independence";
else
p=p+""+q;
q="";
}
}
System.out.println(p);
}
}