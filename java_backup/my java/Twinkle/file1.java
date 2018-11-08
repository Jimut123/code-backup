
import java.io.*;
class file1
{
static String fileName=("primes.txt");
// static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
public static void main(String args[])throws IOException
{
BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));
PrintWriter outFile=new PrintWriter(bw);
int i,f=0,j;
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
outFile.println(i);
}
}
outFile.close();
}
}