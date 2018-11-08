import java.io.*;
class LinkImp
{
  int n=0;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  Link obj1=new Link();
  Link obj2=new Link();
  Link obj3=new Link();
 
  Link obj5=new Link();
  public void call()throws IOException
  {
      obj2=obj1;
      String ch="y";
      while(ch.compareTo("y")==0)
      {
          obj2.input();
           n++;
          System.out.println("press y to continue");
           ch=br.readLine();
          if (ch.compareTo("y")==0)
          {
              obj2.next=new Link();
              obj2=obj2.next;
              
            }
        }
        //n=n+1;
        obj2.next=null;
        obj2=obj1;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
    public void revList()
    {
        int c,i;
        while(n>=1)
        {
            obj2=obj1;
            c=n;
            i=1;
            while(i<=(c-1))
            {
                obj2=obj2.next;
                i++;
            }
            obj2.display();
            n--;
        }
    }
    public void sortList()
    {
        Link obj=new Link();
        for(obj=obj1;obj.next!=null;obj=obj.next)
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
        obj2=obj1;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
    public void revListElements()
    {
        obj3=obj1;
        obj5=null;
        while(obj3.next!=null)
        {
             Link obj4=new Link();
            obj4.data=obj3.data;
            obj4.next=obj5;
            obj5=obj4;
            obj3=obj3.next;
        }
        obj3.next=obj5;
        obj1=obj3;
        obj2=obj1;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
    public void splitList()throws IOException
    {
        int c=1;
        System.out.println("enter position");
         int pos=Integer.parseInt(br.readLine());
        obj2=obj1;
        while(c!=pos)
        {
            obj2=obj2.next;
        c++;
        }
        obj3=obj2.next;
        obj2.next=null;
        System.out.println("Showing first list");
        obj2=obj1;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
        System.out.println("Showing second list");
        obj2=obj3;
        while(obj2!=null)
        {
            obj2.display();
            obj2=obj2.next;
        }
    }
    }

        