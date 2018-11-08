package date;

//Reading from file
import java.io.*;
class file1
{
static String filename="book";
public static void main(String args[])
{
boolean EOF=false;
try
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
while(!EOF)
{
try
{
String s,s1;
double d;
s=de.readUTF();
s1=de.readUTF();
d=de.readDouble();
System.out.println("Name:"+s);
System.out.println("Code:"+s1);
System.out.println("Price:"+d);
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
