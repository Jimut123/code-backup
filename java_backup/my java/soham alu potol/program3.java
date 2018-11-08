import java.io.*;
class program3
{
public static void main(String args[])throws IOException
{
String s;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string:");
s=in.readLine();
int i;
int s1=0;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='0')
s1=s1+0;
else if(s.charAt(i)=='1')
s1=s1+1;
else if(s.charAt(i)=='2')
s1=s1+2;
else if(s.charAt(i)=='3')
s1=s1+3;
else if(s.charAt(i)=='4')
s1=s1+4;
else if(s.charAt(i)=='5')
s1=s1+5;
else if(s.charAt(i)=='6')
s1=s1+6;
else if(s.charAt(i)=='7')
s1=s1+7;
else if(s.charAt(i)=='8')
s1=s1+8;
else if(s.charAt(i)=='9')
s1=s1+9;
}
System.out.println("Sum of the digits........."+s1);
}
}
