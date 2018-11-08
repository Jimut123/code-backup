package LinkList;
class linkedlist5
{
public link5 first;
public linkedlist5()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(String d1)
{
link5 newlink=new link5(d1);
newlink.next=first;
first=newlink;
}
public void display()
{
System.out.println("List (first-->last)");
link5 current=first;
while(current!=null)
{
current.display1();
current=current.next;
}
current=first;
System.out.println("");
}
}
