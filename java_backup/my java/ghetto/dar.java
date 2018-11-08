import java.io.*;
public class dar 
{
public static void main(String[]args)throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int a[][] = new int[1][5];
int b,c=0;
for(b=0; b<5;b=b+1)
{
System.out.println("ENTER ELEMENT FOR COL OF 2D ARRAY");
a[0][b]=Integer.parseInt(in.readLine());
c=c+a[0][b];
}
System.out.println(+c);
}
}