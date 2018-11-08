import java.io.*;
class file3
{
static String filename=("names.txt");
static InputStreamReader isr=new InputStreamReader(System.in);
static BufferedReader stdin=new BufferedReader(isr);
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter(filename);
BufferedWriter bw=new BufferedWriter(fw);
PrintWriter outFile=new PrintWriter(bw);
int f,j;
for(int i=1;i<=100;i++)
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
outFile.println(i);
}
outFile.close();
}
catch(IOException e)
{
System.err.println(e);
}
}
}