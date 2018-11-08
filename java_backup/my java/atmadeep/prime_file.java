import java.io.*;
class prime_file
{
static String fileName="str.dat";
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
public static void main(String args[])
{
try
{
int n,f=0,i,j;
FileOutputStream fw=new FileOutputStream(fileName);
DataOutputStream dw=new DataOutputStream(fw);
for(i=1;i<=100;i++)
{
f=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
dw.writeInt(i);
}
}
dw.close();
fw.close();
FileInputStream fr=new FileInputStream(fileName);
DataInputStream dr=new DataInputStream(fr);
int u;
boolean EOF=false;
while(!EOF)
{
u=dr.readInt();
System.out.println(u);
}
dr.close();
fr.close();
}
catch(IOException e)
{
System.err.println(e);
}
}
}


