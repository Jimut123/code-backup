package STRING;


import java.io.*;
class nextalphabet
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
char ch,ch1;
System.out.println("Enter an alphabet:");
ch=(char)cd.read();
int x,y;
x=(int)ch;
y=x+1;
ch1=(char)y;
System.out.print(ch1);
}
}