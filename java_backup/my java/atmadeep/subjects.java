
import java.io.*;
class subjects extends student
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String subject1,subject2,subject3;
void input1()throws IOException
{
super.input();
System.out.println("Enter Name of subjects");
subject1=input.readLine();
subject2=input.readLine();
subject3=input.readLine();
}
void display1()
{
super.display();
System.out.println("The subjects are:");
System.out.print(subject1 +" " +subject2 +" " +subject3);
}
}