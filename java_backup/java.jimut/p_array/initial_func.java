import java.io.*;
class initial_func
{
void change(String str)
{
String m="";
int i,l;
char ch;
l=str.length();
ch=str.charAt(0);
for(i=1;i<=l-1;i++)
{
ch=str.charAt(i);
if(ch==' ')
{
m=m+str.charAt(i+1);
}
System.out.println(m);
}
}
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String str1;
change ob=new change();
System.out.println("Enter any strign:");
str1=cd.readLine();
ob.change(str1);
}
}