import java.io.*;
class swapa
{
public static void main()throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a;
a=b;
b=c;
System.out.println(a);
System.out.println(b);
}
}