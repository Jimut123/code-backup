package LinkList;
import java.io.*;
class Listsort
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
class link
{
int a;
void input()throws IOException
{
System.out.println("\ninput the data :");
a=Integer.parseInt(br.readLine());
}
void disp()
{
System.out.print(a+", ");
}
link next;
}
link ob=new link ();
int m=1;
link ob1=ob;
void insert()throws IOException
{
while(m==1)
{
ob1.input();
System.out.println("\n1 for more \n0 for stop");
m=Integer.parseInt(br.readLine());
if(m==1)
{
ob1.next=new link ();
ob1=ob1.next;
}
}
System.out.println("");
ob1.next=null;
ob1=ob;
display();
}
void display()
{
System.out.println("your linked list :\n");
while(ob1!=null)
{
ob1.disp();
ob1=ob1.next;
}
ob1=ob;
}
void sort()
{
System.out.println("");
int t=0;
link ob2,ob3;
for(ob2=ob;ob2.next!=null;ob2=ob2.next)
for(ob3=ob2.next;ob3!=null;ob3=ob3.next)
if(ob2.a>ob3.a)
{
t=ob2.a;
ob2.a=ob3.a;
ob3.a=t;
}
ob1=ob;
System.out.println("\nafter sorting,");
display();
}
}
