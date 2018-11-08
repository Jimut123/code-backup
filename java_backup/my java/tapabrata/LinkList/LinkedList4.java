package LinkList;
class LinkedList4
{
public Link4 first;
public LinkedList4()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(int d1)
{
Link4 newLink=new Link4(d1);
newLink.next=first;
first=newLink;
}
public int delete()
{
Link4 temp=first;
first=first.next;
return temp.data;
}
public void display1()
{
System.out.println("\nList (first to last) :::");
Link4 current=first;
while(current!=null)
{
current.disp();
current=current.next;
}
}
}
