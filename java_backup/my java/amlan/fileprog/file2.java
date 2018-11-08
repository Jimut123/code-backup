package fileprog;

//searching a record from file
import java.io.*;
class file2
{
static String filename="book";
public static void main(String args[])
{
String s2;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
boolean EOF=false;
try
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
System.out.println("Give searching code");
s2=br.readLine();
while(!EOF)
{
try
{
String s,s1;
double d;
s=de.readUTF();
s1=de.readUTF();
d=de.readDouble();
if(s2.compareTo(s1)==0)
{
System.out.println("Name:"+s);
System.out.println("Code:"+s1);
System.out.println("Price:"+d);
break;
}
}
catch(EOFException e)
{
System.out.println("End of file.......");
EOF=true;
}
}
}
catch(IOException e)
{
System.err.println(e);
}
}
}
