import java.io.*;
class arrayconvertion
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
int b[]=new int [16];
int a[][]=new int[4][4];
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print("Give value:");
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.print(" ");
}
System.out.println("the converted array");
k=0;
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
b[k]=a[i][j];
k++;
}
System.out.print(" ");
}
for(i=0;i<16;i++)
System.out.println(b[i]);
}
}