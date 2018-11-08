import java.io.*;
class student
{
String name;
String roll;
String Class;
String section;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("GIVE NAME");
name=br.readLine();
System.out.println("Class");
Class=br.readLine();
System.out.println("roll");
roll=br.readLine();
System.out.println("section");
section=br.readLine();
}
void display()
{
System.out.println(name);
System.out.println(Class);
System.out.println(roll);
System.out.println(section);
}
}