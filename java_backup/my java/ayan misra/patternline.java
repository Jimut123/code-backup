import java.io.*;
public class patternline
{
public static void main(String args[])throws IOException
{
int a,b,c=1,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
n=Integer.parseInt(br.readLine());
for(a=1;a<=n;a++)
{
for(b=1;b<=a;b++)
{
System.out.print(c+",");
c++;
}
System.out.println("");
}
}
}


