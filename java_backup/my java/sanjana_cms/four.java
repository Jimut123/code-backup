import java.io.*;
class four
{
public static void main (String args[]) throws IOException
{
String S;
int i,j;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter String");
S=br.readLine();
int v=0;
char a []={'A','E','I','O','U'};
for (i=0;i<a.length;i++)
{
v=0;
for (j=0;j<S.length();j++)
if (S.charAt(j)==a[i])
v++;
if(v>0)
System.out.println("Character:"+a[i]+"Frequency"+v);
}
}
}









