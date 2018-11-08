import java.io.*;
class pattern3
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k;
long l;
System.out.println("Enter The Length");
k=Integer.parseInt(Input.readLine());
l=1;
for(i=0;i<k;i++)
{
System.out.println(l);
l=l*11;
}
}
}
