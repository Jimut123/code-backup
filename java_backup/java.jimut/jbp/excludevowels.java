import java . io.*;
class excludevowels
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String n;
int i,l,count=0;
char ch;
System.out.println("ENTER A TEXT:::::::::::::");
n= cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch = n.charAt(i);
if(Character.isLetter(ch))
{
if((ch!='a')&&(ch!='e')&&(ch!='i')&&(ch!='o')&&(ch!='u')&&(ch!='A')&&(ch!='E')&&(ch!='I')&&(ch!='O')&&(ch!='U'))
{
count = count + 1;
}
}
}
System.out.println("No. of alphabets excluding vowels="+count);
}
}

