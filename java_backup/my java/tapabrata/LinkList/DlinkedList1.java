package LinkList;


class DlinkedList1
{
public Dlink1 first;
public Dlink1 last;
int c=0;
public DlinkedList1()
{
first=last=null;
}
public boolean isEmpty()
{
return (first==null);
}
public void Insert1(int d1)
{
Dlink1 newLink=new Dlink1(d1);
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
Dlink1 newLink=new Dlink1(d1);
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
Dlink1 current=first;
while(current!=null)
{
c++;
current.disp();
current=current.next;
}
System.out.print("");
}
public void display2()
{
System.out.println("\nList (last to first) :::");
Dlink1 current=last;
while(current!=null)
{
current.disp();
current=current.previous;
}
System.out.print("");
}
public void reverse()
{
int k=0;
Dlink1 current1=first;
Dlink1 current2=last;
for(current1=first,current2=last;current1!=null && current2!=null;current1=current1.next,current2=current2.previous)
{
int t=current1.data;
current1.data=current2.data;
current2.data=t;
k++;
if(k>c/2)
break;
}
System.out.print("");
}
}
