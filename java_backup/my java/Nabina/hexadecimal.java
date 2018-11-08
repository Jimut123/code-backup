import java.io.*;
class hexadecimal
{
public static void main(String args[])throws IOException
{
int i;
String n;
char p;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Hexa decimal no.:");
n=input.readLine();
System.out.println("Number in Binary:");
for(i=0;i<n.length();i++)
{
p=n.charAt(i);
if(p=='0')
System.out.print("0000");
else
if(p=='1')
System.out.print("0001");
else
if(p=='2')
System.out.print("0010");
else
if(p=='3')
System.out.print("0011");
else
if(p=='4')
System.out.print("0100");
else
if(p=='5')
System.out.print("0101");
else
if(p=='6')
System.out.print("0110");
else
if(p=='7')
System.out.print("0111");
else
if(p=='8')
System.out.print("1000");
else
if(p=='9')
System.out.print("1001");
else
if(p=='A')
System.out.print("1010");
else
if(p=='B')
System.out.print("1011");
else
if(p=='C')
System.out.print("1100");
else
if(p=='D')
System.out.print("1101");
else
if(p=='E')
System.out.print("1110");
else
if(p=='F')
System.out.print("1111");
else
if(p=='.')
System.out.print(".");
else
if(p=='-')
System.out.print("-");
else
System.out.println("Error");
}
}
}