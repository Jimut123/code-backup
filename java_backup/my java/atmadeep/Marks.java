import java.io.*;
class Marks extends Student1 implements sports
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int subject1,subject2,subject3;
int total,avg;
String game;
String type="";
String comp="";
void input2()throws IOException
{
super.input1();
System.out.println("Enter marks of subjects");
subject1=Integer.parseInt(input.readLine());
subject2=Integer.parseInt(input.readLine());
subject3=Integer.parseInt(input.readLine());
total=subject1+subject2+subject3;
avg=total/3;
input3();
}

public void input3()
{
try
{
game=input.readLine();
type=input.readLine();
comp=input.readLine();
System.out.println("Enter marks of subjects");
subject1=Integer.parseInt(input.readLine());
subject2=Integer.parseInt(input.readLine());
subject3=Integer.parseInt(input.readLine());
total=subject1+subject2+subject3;
avg=total/3;
}
catch(Exception e){}
}
void display2()
{
super.disp1();
System.out.println("The marks of subjects are:");
System.out.println("First subject:" +subject1);
System.out.println("Second subject:" +subject2);
System.out.println("Third subject:" +subject3);
System.out.println("Total is:" +total);
System.out.println("Average is:" +avg);
System.out.println("Game is:" +game);
System.out.println("Type is:" +type);
System.out.println("Comp is:" +comp);
}
}
