import java.io.*;
class mat
{
public static void main(String args[])throws IOException
{
int a[][]=new int[4][4];

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
String s=br.readLine();
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.println("Vaslues:");
a[i][j]=Integer.parseInt(br.readLine());
}
}
}
}