import java.io.*;
class withoutusingarray
{
public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int n,i,s=1;
System.out.println("ENTER A NO:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
System.out.println(s);
s=s*11;
}

System.out.println(" ");
}
}
