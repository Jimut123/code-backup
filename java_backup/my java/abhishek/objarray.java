import java.io.*;
class objarray
{ String name;
  int roll;
  int marks;
  DataInputStream in=new DataInputStream(System.in);
  void input()throws IOException
  {System.out.println("enter name:");
   name=in.readLine();
   System.out.println("enter roll:");
   roll=Integer.parseInt(in.readLine());
   System.out.println("enter marks:");
   marks=Integer.parseInt(in.readLine());
  }
  void disp()
  {
   System.out.println("name:"+name);   
      System.out.println("roll:"+roll);
      System.out.println("marks="+marks);
    }
}
  