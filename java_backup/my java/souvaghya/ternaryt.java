import java.io.*;
class ternaryt
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value");
a=Integer.parseInt(br.readLine()); 
char c;
c=(a<50?'f':a<60?'p':a<70?'g':a<80?'s':'a');
System.out.println(c);
}
}
