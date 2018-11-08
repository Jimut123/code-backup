import java.io.*;
class StudentMain
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Student obj1=new Student();
      Student obj2=new Student();
      String ch="y";
      obj2=obj1;
      while(ch.compareTo("y")==0)
      {
          obj2.input();
          System.out.println("press 'y' to continue");
           ch=br.readLine();
          if(ch.compareTo("y")==0)
          {
              obj2.next=new Student();
              obj2=obj2.next;
            }
        }
        obj2.next=null;
        obj2=obj1;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
}