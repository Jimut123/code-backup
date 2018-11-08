 

//display the file output in sorted order of name
import java.io.*;
class file_pro1
{

public static void main(String args[])
{
String a[][]=new String[100][100];
String temp[][]=new String[100][100];
int i,j,t,k,k1;
String filename="student";
boolean EOF=false;
i=j=0;
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
a[i][j]=s;
j++;
s1=de.readUTF();
a[i][j]=s1;
j++;
d=de.readDouble();
a[i][j]=Double.toString(d);
//System.out.println("Name:"+s);
//System.out.println("Roll:"+s1);
//System.out.println("Fees:"+d);
}
catch(EOFException e)
{
System.out.println("End of file.......");
EOF=true;
}
i++;
j=0;
}
}
catch(IOException e)
{
System.err.println(e);
}
t=i;
System.out.println("Output before sorting");
for(i=0;i<t-1;i++)
{
for(j=0;j<3;j++)
System.out.println(a[i][j]);
}
j=0;
System.out.println("Output after sorting");
for(k=65;k<=90;k++)
{
for(i=0;i<t-1;i++)
{
if(a[i][j].charAt(0)==(char)k || a[i][j].charAt(0)==(char)(k+32))
for(k1=0;k1<3;k1++)
System.out.println(a[i][k1]);
}
}
}
}
