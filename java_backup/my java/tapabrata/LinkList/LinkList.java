package LinkList;
import java.io.*;
class LinkList
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
count();
}
void count()
{
System.out.println("");
int c=0;
while(ob1!=null)
{
c++;
ob1=ob1.next;
}
ob1=ob;
System.out.println("\ncount : "+c);
check();
}
void check()
{
while(ob1!=null)
{
if(ob1.a%2==0)
System.out.println("\neven........");
else
System.out.println("\nodd........");
ob1=ob1.next;
}
ob1=ob;
}
}
