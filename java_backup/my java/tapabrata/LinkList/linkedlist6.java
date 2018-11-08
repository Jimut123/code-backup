package LinkList;
class linkedlist6
{
public link6 first;
public linkedlist6()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(String d1)
{
link6 newlink=new link6(d1);
newlink.next=first;
first=newlink;
}
public void display()
{
System.out.println("List (first-->last)");
link6 current=first;
while(current!=null)
{
current.display1();
current=current.next;
}
current=first;
System.out.println("");
}
}
