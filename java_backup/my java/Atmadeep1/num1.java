import java.io.*;
class num1
{
public static void main(String args[])throws IOException
{
int ch;
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
num ob=new num();
System.out.println("Enter the choice:");
ch=Integer.parseInt(input.readLine());
switch(ch)
{
case 1:ob.perfect();
break;
case 2:ob.arms();
break;
case 3:ob.krish();
break;
default:System.out.println("Wrong statement");
}
}
}