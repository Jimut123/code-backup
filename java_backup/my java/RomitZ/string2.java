import java.io.*;
class string2
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
String n,w=" ";
char h;
int i,k,j,l,max=0;
System.out.println("Enter The String");
n=Input.readLine();
for(i=0;i<n.length();i++)
{
h=n.charAt(i);
if(h==' ')
{
if(w.length()>max)
{
max=w.length();
}
w="";
}
else
{
w=w+h;
}
}
if(w.length()>max)
{
max=w.length();
}
w="";
for(i=1;i<=max;i++)
{
for(j=0;j<n.length();j++)
{
h=n.charAt(j);
if(h==' ')
{
if(w.length()==i)
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
if(w.length()==i)
{
System.out.print(w+" ");
}
w="";
}
}
}

