import java.io.*;
class arrange5
{
public static void main(String args[])throws IOException
{
int i,p;
String s,vow="",num="",cons="",sym="",w="";
char ch;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text:");
s=input.readLine();
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
//System.out.println(ch);
if(ch!=' ')
{
p=(int)ch;
if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
{
vow=vow+ch;
//break;
}
else
if((p>=48)&&(p<=57))
{
num=num+ch;
//break;
}
else
if(((p>=65)&&(p<=91))||((p>=97)&&(p<=123)))
{
cons=cons+ch;
//break;
}
else
{
sym=sym+ch;
//break;
}
}
else
if(ch==' ')
{
w=w+vow+cons+num+sym;
System.out.print(w+" ");
w="";
vow="";
num="";
cons="";
sym="";
}
}
w=w+vow+cons+num+sym;
System.out.print(w+" ");
}
}