package LinkList;
class LinkedList1
{
public Link1 first;
public LinkedList1()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(int d1)
{
Link1 newLink=new Link1(d1);
newLink.next=first;
first=newLink;
}
public void display()
{
System.out.println("\nList (first to last) :::");
Link1 current=first;
while(current!=null)
{
current.disp();
current=current.next;
}
}
}
