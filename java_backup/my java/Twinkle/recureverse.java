import java.io.*;
class recureverse
{
int k=0,i;
String s,s1="",s2="";
char ch;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter string:");
s=input.readLine();
rev1();
}
void rev1()
{
//System.out.println(ch);
if(k>=s.length())
{
rev2(s1);
//System.out.println(s1);
System.out.println(s2);
return;
}
else
{
ch=s.charAt(k);
if(ch==' ')
{
//System.out.println(s1);
rev2(s1);
s1="";
}
s1=s1+ch;
k++;
rev1();
}

}
void rev2(String s1)
{
for(i=s1.length()-1;i>=0;i--)
{
s2=s2+s1.charAt(i);
}
//s1="";
//System.out.println(s2);
s2=s2+" ";
}
}