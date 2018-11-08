import java.io.*;
public class linked4
{
    int c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class list
    {
        int a=1;
        void input()throws IOException
        {
            c++;
            System.out.println("Enter data");
            a=Integer.parseInt(br.readLine());
        }
        void display()
        {
            System.out.println(+a);
        }
        list next;
    }
    list ob,ob2;
  linked4()
  {
        ob=new list();
        ob2=ob;
  }
  void check()throws IOException
  {
      
      while(true)
      {
          ob2.input();
          if(ob2.a==0)
             break;
          ob2.next=new list();
          ob2=ob2.next;
      }
      ob2=null;
      ob2=ob;
      print();
    }
    void print()
    {
        int m,n,k=c-1;
       for(m=1;m<=(c-1);m++)
       {
           ob2=ob;
           for(n=1;n<=(c);n++)
           {
               if(n==k)
               {
                   break;
                }
               ob2=ob2.next;
           }
           k--;
            ob2.display();
    }
}
}