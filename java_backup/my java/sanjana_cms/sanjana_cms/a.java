import java.io.*;
class a
{
public static void main () throws IOException
{
String s;
int i, w, v, p;
BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
System.out.println("Enter String");
s=br.readLine();
s=s+" "; v=0;
w=0; p=0;
for (i=0; i<s.length(); i++)
{
if (s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'|s.charAt(i)=='u')
v++;
else
if (s.charAt(i)==' ')
w++;
else
if (s.charAt(i)==' ')
p++;
}
w=p+' ';
System.out.println(v);
System.out.println(w);
System.out.println(s);
}
}


