import java.io.*;
class Student1
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String name,add;
int roll;
void input1()throws IOException
{
System.out.println("Enter the name:");
name=input.readLine();
System.out.println("Enter the roll:");
roll=Integer.parseInt(input.readLine());
System.out.println("Enter the address:");
add=input.readLine();
}
void disp1()
{
System.out.println("the name is:" +name);
System.out.println("the roll is:" +roll);
System.out.println("the address is:" +add);
}
}