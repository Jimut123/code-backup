package LinkList;
import java.io.*;
import java.util.*;
class merge
{
  int data;
  merge link;
  merge()
  {
      data=0;
      link=null;
    }
    void create()throws IOException
    {
        int n;
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter first data ");
        this.data=Integer.parseInt(in.readLine());
        System.out.println(" Enter the no of to be created ");
        n=Integer.parseInt(in.readLine());
        merge temp;
        merge ptr=this;
        for(int i=1;i<n;i++)
        {
            temp=new merge();
            System.out.println(" enter next data ");
            temp.data=Integer.parseInt(in.readLine());
            temp.link=null;
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;
        }
    }
    void merge(merge start)
    {
        merge ptr=this;
        while(ptr.link!=null)
        ptr=ptr.link;
        ptr.link=start;
        start=null;
    }
    void display()
    {
        merge ptr=this;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
}
            