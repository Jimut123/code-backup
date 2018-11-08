package link.linkmerge;

import java.io.*;
class link1
{
   lnk first,newlink,cur,cur1;
   lnk1 first1,newlink1,cur3;
   int k;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public link1()
    {
        first=null;
        first1=null;
        k=1;
        
    }
    void isempty()
    {
        if(first==null || first1==null )
        return;
    }
    void insert()throws IOException
    {
        newlink=new lnk();
        newlink.input();
        newlink.l=first;
        first=newlink;
    }
    void display()
    {
        cur=first;
        while(cur!=null)
        {
            cur.disp();
            cur=cur.l;
        }
    }
   void insert1()throws IOException
    {
        link1 l=new link1();
        link1 l1=new link1();
        
        while(k>0)
        {
        l.insert();
        l1.insert();
         System.out.println("Want another:");
        k=Integer.parseInt(br.readLine());
    }
    l.display();
    l1.display();
    while(l.first!=null && l1.first!=null)
    {
        newlink1=new lnk1();
        newlink1.input( l.first, l1.first);
        newlink1.l=first1;
        first1=newlink1;
        l.first=l.first.l;
        l1.first=l1.first.l;
    } 
    
}  void disp1()
    {
        cur3=first1;
        while(cur3!=null)
        {
            cur3.disp();
            cur3=cur3.l;
        }
   
}  

   }

