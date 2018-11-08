import java.io.*;
class Student
{
  int roll;
  String name;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public void input()throws IOException
  {
      System.out.println("enter roll number");
       roll=Integer.parseInt(br.readLine());
      System.out.println("enter name");
       name=br.readLine();
    }
    public void display()
    {
        System.out.println("name:"+name);
        System.out.println("roll number:"+roll);
    }
    Student next;
}
