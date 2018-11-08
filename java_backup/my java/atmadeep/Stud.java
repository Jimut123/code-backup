import java.io.*;
class stud
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String name,cls;
String sectn;
int code;
void input()throws IOException
{
System.out.println("Enter the name,class,section,code:");
name=input.readLine();
cls=input.readLine();
sectn=input.readLine();
code=Integer.parseInt(input.readLine());
}
void display()
{
System.out.println("The name,class,section,code is:");
System.out.print(name +" " +cls +" " +sectn +" " +code +" ");
}
}

