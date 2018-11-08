import java.io.*;
class arrayreverse
{
public static void main(String[]args)
{
int a[]=new int[6];
BufferedReader.br=new BufferedReader(new Input Stream Reader(System.in));
int i,n;
System.out.println("Enter terms");
n=Integer.parseInt(br.readLine());
for(i=12;i<6;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
for(i=n-i;i>=0;i--)
System.out.println(a[i]);
}
}