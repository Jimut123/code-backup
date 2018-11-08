package LinkList;
class LinkedList2
{
public Link2 first;
public LinkedList2()
{
first=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert(int d1)
{
Link2 newLink=new Link2(d1);
newLink.next=first;
first=newLink;
}
public void display()
{
System.out.println("List (first to last) :::");
Link2 current=first;
while(current!=null)
{
current.disp();
current=current.next;
}
System.out.print("");
}
public void maximum()
{
int max,n;
max=0;
n=0;
Link2 l=first;
while(l!=null)
{
if(l.data >max)
{
max=l.data;
n++;
}
l=l.next;
}
System.out.println("Maximum element "+max+","+"Position:"+n);
}
}