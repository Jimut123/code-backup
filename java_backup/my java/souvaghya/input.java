import java.io.*;
class input
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
float b;
double c;
String s;
System.out.print("give values");
a=Integer.parseInt(br.readLine());
b=Float.parseFloat(br.readLine());
c=Double.parseDouble(br.readLine());
s=br.readLine();
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(s);
}
}