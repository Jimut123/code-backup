import java.io.*;
class add_bffrd
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.print("give 2 Values");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.print(c);
}
}