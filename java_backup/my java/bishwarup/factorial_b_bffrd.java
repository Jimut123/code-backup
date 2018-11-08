import java.io.*;
class factorial_b_bffrd
{
public static void main(String args[])throws IOException
{
int a[]=new int[50];
int i,s=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<10;i++)
{
System.out.println("Give value:");
a[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<10;i++)
s=s+a[i];
System.out.print("Sum:"+s);
}
}