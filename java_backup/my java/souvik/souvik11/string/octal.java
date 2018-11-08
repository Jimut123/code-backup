package souvik11.string;

import java.io.*;
class octal
{
void cal(String s)
{
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch=='.')
System.out.print(".");
else if(ch=='0')
System.out.print("000");
else if(ch=='1')
System.out.print("001");
else if(ch=='2')
System.out.print("010");
else if(ch=='3')
System.out.print("011");
else if(ch=='4')
System.out.print("100");
else if(ch=='5')
System.out.print("101");
else if(ch=='6')
System.out.print("110");
else if(ch=='7')
System.out.print("111");
}
}
}

