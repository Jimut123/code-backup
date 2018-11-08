import java.io.*;
import java.lang.*;
class pattern2
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER THE NUMBER");
int n=Integer.parseInt(Input.readLine());
int i,j,m=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(m);
}
System.out.println(' ');
m++;
}
}
}
