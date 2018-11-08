import java.io.*;
class reverse_arry
{
public static void main(String args[]) throws IOException
{
int a[]=new int[50];
int d,r=0,n;
System.out.print(" GIVE TERM");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Give nos of elements:");
n=Integer.parseInt(br.readLine());
for(d=0;d<n;d++)
a[d]=Integer.parseInt(br.readLine());
for(d=n-1;d>=0;d--)
System.out.println(a[d]);
}
}