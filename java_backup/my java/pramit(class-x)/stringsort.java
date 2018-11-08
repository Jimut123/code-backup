import java.io.*;
class stringsort
{
public static void main(String[]args)throws IOException
{
int i,j,d;
String s;
String w;
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader ll=new BufferedReader(aa);
System.out.print("the string words");
s=ll.readLine();
w="";
d=s.length();
for(i=65;i<90;i++)
{
for(j=0;j<d;j++)
{
if(i==(int) s.charAt(j))
{
w=w+s.charAt(j);
}
else if((i+32)==(int) s.charAt(j))
{
w=w+s.charAt(j);
}
}
}
System.out.println(w);
}
}