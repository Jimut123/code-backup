import java.io.*;
class string1
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
String n,w="";
char h,ch,chr;
int i,k=0,j,l,m=0;
System.out.println("Enter The String");
n=Input.readLine();
for(i=0;i<n.length();i++)
{
h=n.charAt(i);
if(h==' ')
{
//System.out.println(w);
ch=w.charAt(0);
chr=w.charAt(w.length()-1);
k=(int)ch;
m=(int)chr;
if((k>=65 && k<=90) && (m>=65 && m<=90))
{
System.out.print(w+" ");
}
w="";
}
else
{
w=w+h;
}
}
if((k>=65 && k<=90) && (m>=65 && m<=90))
{
System.out.println(w);
w="";
}
}
}

