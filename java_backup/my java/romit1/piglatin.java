import java.io.*;
import java.lang.*;
class piglatin
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
String n;
char h;
int i,j,m;
System.out.println("ENTER THE STRING");
n=Input.readLine();
m=0;
for(i=0;i<n.length();i++)
{
h=n.charAt(i);
if((h=='A')||(h=='a')||(h=='E')||(h=='e')||(h=='I')||(h=='i')||(h=='O')||(h=='o')||(h=='U')||(h=='u'))
{
 m =i;
break;
}
}
 m=m-1;
for(j=i;j<n.length();j++)
{
h=n.charAt(j);
System.out.print(h);
}
for(j=0;j<=m;j++)
{
h=n.charAt(j);
System.out.print(h);
}
System.out.print("AY");
}
}


