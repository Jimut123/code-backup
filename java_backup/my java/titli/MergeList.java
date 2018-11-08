import java.io.*;
class MergeList
{
  int n1=0,n2=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Link obj1=new Link();
  Link obj2=new Link();
  Link obj3=new Link();
  Link objList1=new Link();
  Link objL1=new Link();
  Link objList2=new Link();
  Link objL2=new Link();
  Link obj=new Link();
  public void call()throws IOException
  {
      obj2=objList1;
      String ch="y";
      while(ch.compareTo("y")==0)
      {
          obj2.input();
           n1++;
          System.out.println("press y to continue");
           ch=br.readLine();
          if (ch.compareTo("y")==0)
          {
              obj2.next=new Link();
              obj2=obj2.next;
              
            }
        }
        obj2.next=null;
        obj2=objList1;
        System.out.println("\n unsorted 1st list");
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
        obj2=objList2;
      ch="y";
      while(ch.compareTo("y")==0)
      {
          obj2.input();
           n2++;
          System.out.println("press y to continue");
           ch=br.readLine();
          if (ch.compareTo("y")==0)
          {
              obj2.next=new Link();
              obj2=obj2.next;
              
            }
        }
        obj2.next=null;
        obj2=objList2;
        System.out.println("\n unsorted 2nd list");
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
    public void sortList()
    {
        Link obj=new Link();
        for(obj=objList1;obj.next!=null;obj=obj.next)
        {
            for(obj2=obj.next;obj2!=null;obj2=obj2.next)
            {
                if (obj.data>obj2.data)
                {
                    int temp=obj.data;
                    obj.data=obj2.data;
                    obj2.data=temp;
                }
            }
        }
        obj2=objList1;
        System.out.println("\n sorted 1st list");
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
        for(obj=objList2;obj.next!=null;obj=obj.next)
        {
            for(obj2=obj.next;obj2!=null;obj2=obj2.next)
            {
                if (obj.data>obj2.data)
                {
                    int temp=obj.data;
                    obj.data=obj2.data;
                    obj2.data=temp;
                }
            }
        }
        obj2=objList2;
        System.out.println("\n sorted 2nd list");
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
        if (n2>n1)
        {
            objL1=objList1;
            objL2=objList2;
        }
        else
        {
            objL2=objList1;
            objL1=objList2;
        }
        obj3=obj1;
        do
        {
            if(objL1.data<objL2.data)
            {
                obj3.data=objL1.data;
                if (objL1.next!=null)
                 objL1=objL1.next;
                 obj3.next=new Link();
                obj3=obj3.next;
            }
            else
            {
                obj3.data=objL1.data;
                if (objL2.next!=null)
                 objL2=objL2.next;
                 obj3.next=new Link();
                obj3=obj3.next;
            }
        }while(objL2.next!=null);
        obj2=obj1;
        System.out.println("\n sorted and merged list");
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
}
        
        
                
            
    
        