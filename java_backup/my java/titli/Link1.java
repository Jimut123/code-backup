import java.io.*;
public class Link1
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Link ob=new Link();
  Link obj1=new Link();
  Link obj2=null;
  Link obj3=null;
  Link obj4=new Link();
  Link obj5=new Link();
  public void call()throws IOException
  {
      //obj2=obj1;
      int f=0;
      String ch="y";
      while(ch.compareTo("y")==0)
      {
          obj3=new Link();
          obj3.input();
          //obj3.next=null;
          if(obj2==null)
          {
              //System.out.println("Yes");
          obj2=new Link();
          obj2.data=obj3.data;
          obj2.next=null;
        }
          else
          {
             //obj2.next=new CreateList(); 
             if(obj3.data<obj2.data)
             {
                 obj3.next=obj2;
                 obj2=obj3;
                }
                else
                {
                    obj4=obj2;
                    while(obj4.next!=null)
                    {
                        if(obj4.next.data>obj3.data)
                        {
                           //System.out.println(obj4.data);
                        //System.out.println(obj4.next.data);
                            f=1;
                            break;
                        }
                        obj4=obj4.next;
                    }
                    if(f==1)
                    {
                        
                        obj5=obj4.next;
                        obj4.next=obj3;
                        obj3.next=obj5;
                    }
                    else
                    obj4.next=obj3;
          
    }
}
          System.out.println("Want another:(Y/N):");
          ch=br.readLine();
        } 
        obj1=obj2;
        //System.out.println(obj2.data);
        disp();
    }
    public void disp()
    {
        obj2=obj1;
        while(obj2!=null)
        {
            
            obj2.display();
            obj2=obj2.next;
        }
    }
}