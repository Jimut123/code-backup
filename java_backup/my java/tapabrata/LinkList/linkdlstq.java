package LinkList;

class linkdlstq
{
public linkq first;
public linkdlstq()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(int d1)
{
linkq newlink=new linkq(d1);
newlink.next=first;
first=newlink;
}
public linkq delete()
{
linkq temp=first;
first=first.next;
return temp;
}
public void display()
{
System.out.println("List (first-->last)");
linkq current=first;
while(current!=null)
{
current.display1();
current=current.next;
}
System.out.println("");
}
}
