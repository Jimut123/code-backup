import java.io.*;
class REPLACE_sTRING
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,w;
int i,j,m;
char ch;
w="";
m=0;
System.out.println("ENETR UR STRING");
s=br.readLine();
for(i=s.length()-1;i>=0;i--)
{
ch=s.charAt(i);
if(ch==' ')
{
for(j=w.length()-1;j>=0;j--)
System.out.print(w.charAt(j)); 
w="";
m=i;
break;
}
else
w=w+ch;
}
System.out.print(" ");
for(i=0;i<m;i++)
System.out.print(s.charAt(i));
}
}
