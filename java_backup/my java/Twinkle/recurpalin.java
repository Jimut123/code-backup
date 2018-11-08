import java.io.*;
class recurpalin
{
int p,q;
String s;
char ch,h;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

void input()throws IOException
{
System.out.println("Enter any string:");
s=input.readLine();
p=s.length()-1;
q=0;
palin();
}

void palin()
{
ch=s.charAt(p);
h=s.charAt(q);
if(ch==h)
{
p--;
q++;
if(p==q)
{
System.out.println("PALINDROME");
return;
}
else
palin();
}
else
{
System.out.println(" NOT PALINDROME");
return;
}
}
}
