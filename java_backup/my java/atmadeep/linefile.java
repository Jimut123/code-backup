import java.io.*;
class linefile
{
public static void main(String args[])throws IOException
{
String fileName=new String("line.dat");
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String s;
int n,i;
FileOutputStream fw=new FileOutputStream(fileName);
DataOutputStream dw=new DataOutputStream(fw);
System.out.println("Enter the no. of lines:");
n=Integer.parseInt(input.readLine());
System.out.println("Enter the lines:");
for(i=1;i<=n;i++)
{
s=input.readLine();
dw.writeUTF(s);
}
dw.close();
}
}











