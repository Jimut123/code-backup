import java.io.*;
class vowelpercentage
{
public static void main(String args[])throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int i,j,c,k;
String s,w;
char ch;
w="";
c=0;
System.out.print("GIVE TERM");
s=br.readLine();
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
c=0;
for(j=0;j<w.length();j++)
{
if(w.charAt(j)=='a'||w.charAt(j)=='e'||w.charAt(j)=='i'||w.charAt(j)=='o'||w.charAt(j)=='u')
c++;
}
k=(c*100)/w.length();
System.out.print(w+""+k);
w="";
}
else
w=w+s.charAt(i);
}
for(j=0;j<w.length();j++)
if(w.charAt(j)=='a'||w.charAt(j)=='e'||w.charAt(j)=='i'||w.charAt(j)=='o'||w.charAt(j)=='u')
c++;
k=(c*100)/w.length();
System.out.print(w+""+k);
}
}

