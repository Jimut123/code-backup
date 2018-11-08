
import java.io.*;
class mrglist
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Link obj1=new Link();
  Link obj2=new Link();
  Link obj3=new Link();
  Link objList1=new Link();
  Link objL1=new Link();
  Link objList2=new Link();
  Link objL2=new Link();
  Link obj=new Link();
  mrglist()throws IOException
  {
      input(obj1);
      input(obj3);
      System.out.println("Unsorted First List");
      disp(obj1);
      System.out.println("Unsorted Second List");
      disp(obj3);
      sort(obj1);
      System.out.println("Sorted First List");
      disp(obj1);
      sort(obj3);
      System.out.println("Sorted Second List");
      disp(obj3);
      mergesort(obj1,obj3,obj);
      System.out.println("Sorted Merged List");
      disp(obj);
    }
    void input(Link obj1)throws IOException
    {
        String ch="YES";
        obj2=obj1;
        while(ch.equalsIgnoreCase("YES")==true)
        {
            obj2.input();
            System.out.println("Give Another(YES/NO):");
            ch=br.readLine();
            if(ch.equalsIgnoreCase("YES")==true)
              {
                  obj2.next=new Link();
                  obj2=obj2.next;
                
                }
            }
            obj2.next=null;
        }
        void disp(Link obj1)
        {
            obj2=obj1;
            while(obj2!=null)
            {
                obj2.display();
                obj2=obj2.next;
            }
        }
       void sort(Link obj1)
       {
           int t;
           for(obj2=obj1;obj2.next!=null;obj2=obj2.next)
            for(objL1=obj2.next;objL1!=null;objL1=objL1.next)
              if(obj2.data>objL1.data)
              {
                  t=obj2.data;
                  obj2.data=objL1.data;
                  objL1.data=t;
                }
            }
            void mergesort(Link obj1,Link obj3,Link obj)
            {
                obj2=obj1;
                objL1=obj3;
                objL2=obj;
                while(obj2!=null && objL1!=null)
                {
                    if(obj2.data>objL1.data)
                    {
                        objL2.data=objL1.data;
                        objL2.next=new Link();
                        objL2=objL2.next;
                        objL1=objL1.next;
                    }
                    else
                    if(obj2.data<objL1.data)
                    {
                        objL2.data=obj2.data;
                        objL2.next=new Link();
                        objL2=objL2.next;
                        obj2=obj2.next;
                    }
                    else
                    {
                      objL2.data=obj2.data;
                        objL2.next=new Link();
                        objL2=objL2.next;
                        obj2=obj2.next;
                        objL1=objL1.next;
                    }
                }
                if(obj2!=null)
                {
                    while(obj2!=null)
                    {
                      objL2.data=obj2.data;
                        objL2.next=new Link();
                        objL2=objL2.next;
                        obj2=obj2.next;
                    }
                }
                else
                if(objL1!=null)
                {
                  while(objL1!=null)
                    {
                      objL2.data=objL1.data;
                        objL2.next=new Link();
                        objL2=objL2.next;
                        objL1=objL1.next;
                    }
                }
      objL2.next=null;
}
}
