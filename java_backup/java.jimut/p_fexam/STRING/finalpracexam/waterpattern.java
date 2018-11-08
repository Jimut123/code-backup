package STRING.finalpracexam;


import java.io.*;
class waterpattern
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch;
int i,l,j,c;
System.out.println("Enter 1 for choice1,2 for choice 2, & 3 for choice3");
System.out.println("Enter your choice:");
c=Integer.parseInt(cd.readLine());
System.out.println("Enter a word:");
n=cd.readLine();
l=n.length();
switch(c)
{
case 1:
{
for(i=0;i<l;i++)
{
for(j=0;j<=i;j++)
{
ch=n.charAt(j);
System.out.print(ch);
}
System.out.println();
}
break;
}
case 2:
{
for(i=l-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
ch=n.charAt(i);
System.out.print(ch);
}
System.out.println();
}
break;
}
case 3:
{
for(i=l-1;i>=0;i++)
{
for(j=i;j>=0;j--)
{
ch=n.charAt(i);
System.out.print(ch);
}
System.out.println();
}
break;
}
default:
{
System.out.println("Wrong choice");
}
}
}
}