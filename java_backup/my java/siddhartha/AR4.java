import java.io.*;
class AR4
{
public static void main()throws IOException
{ 
String t="",v="";
BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter matrix");
int a[][]=new int [3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 a[i][j]=Integer.parseInt(br.readLine());
}
}
int k=3-1;
for(int i=0;i<3;i++)
{
for(int j=k+1;j<3;j++)
{
 System.out.print(a[i][j]+",");
 
}
k--;
System.out.println("");
}}
}

