import java.io.*;
class Alphabets
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
String str,str1 = "",str2 = "",str3,str4 = "";
int i = 0,l,n,f = 0,a,b,k,m,u,v;
char c;
System.out.println("ENTER THE SENTENCE:");
str = x.readLine();
System.out.println("ENTER THE NUMBER OF WORDS IN THE SENTENCE:");
n = Integer.parseInt(x.readLine());
String s[] = new String[n];
l = str.length();
for(i = 0;i < l;i++)
{
c = str.charAt(i);
if((c == ' ')||(c == '.')||(c == '?')||(c == '!')||(c == ',')||(c == ';')||(c == ':'))
{
s[f] = str1;
f++;
str1 = "";
}
else
{
str1 = str1 + c;
 }
}
System.out.println("ENTER TWO NUMBERS:");
a = Integer.parseInt(x.readLine());
b = Integer.parseInt(x.readLine());
if(a == b)
{
str1 = s[a-1];
k = str1.length();
for(i = 0;i < k;i++)
{
c = str1.charAt(i);
u = (int)c;
u++;
c = (char)u;
str2 = str2 + c;
}
s[a-1] = str2;
str1 = "";
str2 = "";
}
else
{
str1 = s[a-1];
str3 = s[b-1];
k = str1.length();
m = str3.length();
for(i = 0;i < k;i++)
{
c = str1.charAt(i);
u = (int)c;
u++;
c = (char)u;
str2 = str2 + c;
}
s[a-1] = str2;
for(i = 0;i < m;i++)
{
c = str3.charAt(i);
v = (int)c;
v++;
c = (char)v;
str4 = str4 + c;
}
s[b-1] = str4;
}
System.out.print("THE NEW SENTENCE:");
for(i = 0;i < n;i++)
{
System.out.print(s[i]+" ");
  }
 }
}
