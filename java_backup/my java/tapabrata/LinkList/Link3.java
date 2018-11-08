package LinkList;


class Link3
{
public int data1;
public String data2="";
public Link3 next;
public Link3(int d1, String d2)
{
data1=d1;
data2=d2;
}
public void disp()
{
System.out.print(data1+": "+data2+", ");
}
}
