package LinkList;


class LinkedList3
{
public Link3 first;
public LinkedList3()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(int d1, String d2)
{
Link3 newLink=new Link3(d1,d2);
newLink.next=first;
first=newLink;
}
public void display()
{
System.out.println("\nList (first to last) :::");
Link3 current=first;
while(current!=null)
{
current.disp();
current=current.next;
}
System.out.print("");
}
}
