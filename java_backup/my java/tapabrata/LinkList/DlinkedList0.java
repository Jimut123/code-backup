package LinkList;


class DlinkedList0
{
public Dlink0 first;
public Dlink0 last;
public DlinkedList0()
{
first=last=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert1(int d1)
{
Dlink0 newLink=new Dlink0(d1);
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
Dlink0 newLink=new Dlink0(d1);
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
Dlink0 current=first;
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
Dlink0 current=last;
while(current!=null)
{
current.disp();
current=current.previous;
}
System.out.print("");
}
void calc()
{
int max,min;
Dlink0 current=first;
max=min=current.data;
while(current!=null)
{
if(current.data>max)
max=current.data;
else
if(current.data<min)
min=current.data;
current=current.next;
}
int ave=(max+min)/2;
System.out.print("average value = "+ave);
}
}
