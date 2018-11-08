package LinkList;


class DoubleLinkedList4
{
public DoubleLink4 first;
public DoubleLink4 last;
public DoubleLinkedList4()
{
first=last=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert1(int d1)
{
DoubleLink4 newLink=new DoubleLink4(d1);
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
DoubleLink4 newLink=new DoubleLink4(d1);
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
DoubleLink4 current=first;
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
DoubleLink4 current=last;
while(current!=null)
{
current.disp();
current=current.previous;
}
System.out.print("");
}
}
