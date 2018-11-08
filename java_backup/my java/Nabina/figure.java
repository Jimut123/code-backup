import java.io.*;
class figure
{
public static void main(String args[])throws IOException
{
int i,j,p,n;
String s=" ";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
p=1;
s=" ";
for(i=0;i<n;i++)
{
System.out.print(s);
for(j=p;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
s=s+" ";
p++;
}
}
}