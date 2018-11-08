package LinkList;


class DoublelinkedList1
{
public Doublelink1 first;
public Doublelink1 last;
public DoublelinkedList1()
{
first=last=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert1(int d1)
{
Doublelink1 newLink=new Doublelink1(d1);
if(isEmpty())
last=newLink;
else
{
first.previous=newLink;
newLink.next=first;
}
first=newLink;
}
public void Insert2(int d1)
{
Doublelink1 newLink=new Doublelink1(d1);
if(isEmpty())
first=newLink;
else
{
last.next=newLink;
newLink.previous=last;
}
last=newLink;
}
public void display1()
{
System.out.println("\nList (first to last) :::");
Doublelink1 current=first;
while(current!=null)
{
current.disp();
current=current.next;
}
System.out.print("");
}
public void display2()
{
System.out.println("\nList (last to first) :::");
Doublelink1 current=last;
while(current!=null)
{
current.disp();
current=current.previous;
}
System.out.print("");
}
}
