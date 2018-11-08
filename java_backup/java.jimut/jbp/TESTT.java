import java . io.*;
class TESTT
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String m = "NEW",n="YEAR",p="2013";
System.out.println(m+n+p);
System.out.println("HAPPY"+m+n);
System.out.println(n.equals(p));
System.out.println(n.charAt(1)==m.charAt(1));
}
}
