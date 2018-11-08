import java.io.*;
class palstring
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String s;
int i,j;
void input()throws IOException
{
System.out.println("Enter the string");
s=input.readLine();
}
void check()
{
i=0;
j=s.length()-1;
rec();
}
void rec()
{
if(s.charAt(i)!=s.charAt(j))
{
System.out.print("Not pallindrome");
return;
}
else
if(i>=j)
{
System.out.print("pallindrome");
return;
}
else
{
i++;
j--;
rec();
}
}
}
