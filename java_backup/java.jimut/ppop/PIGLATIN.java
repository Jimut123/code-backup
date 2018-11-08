import java.io.*;
class PIGLATIN
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int x,y;
String str,c,d;
char b=0;
System.out.println("The Piglatin word of the given string:");
y=Integer.parseInt(cd.readLine());
x=Integer.parseInt(cd.readLine());
b=(char)(cd.read());
c=cd.readLine();
d=cd.readLine();
str=cd.readLine();
x=str.length();
for(y=0;y<x;y++)
{
b=(str.charAt(y));
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')
break;
}
c=str.substring(y,x);
d=str.substring(0,y);
System.out.println(c+d+"ay");
}
}