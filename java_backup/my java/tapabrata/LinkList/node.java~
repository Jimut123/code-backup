package LinkList;
import java.io.*;
import java.util.*;
class node
{
int data;
node link;
node()
{
data=0;
link=null;
}
void create()throws IOException
{
int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first data ");
this.data=Integer.parseInt(br.readLine());
System.out.println(" Enter the no of to be created ");
n=Integer.parseInt(br.readLine());
node temp;
node ptr=this;
for(int i=1;i<n;i++)
{
temp=new node();
System.out.println(" Enter next data ");
temp.data=Integer.parseInt(br.readLine());
temp.link=null;
ptr.link=temp;
temp=null;
ptr=ptr.link;
}
}
void insertbeg(node start,int x)
{
node temp=new node();
System.out.println(" Enter element for the new list ");
temp.data=x;
temp.link=start;
//temp.link=
start=temp;
//temp=null;
}
void insertmid(node start,int x,int n)
{
node temp=new node();
System.out.println(" Enter elment for the new list ");
temp.data=x;
temp.link=null;
node ptr=start;
int c=0;
while(c<=n)
{
ptr=ptr.link;
c++;
}
temp.link=ptr.link;
ptr.link=temp;
}
void insertend(node start,int x)
{
node temp=new node();
System.out.println(" Enter element for the new list ");
temp.data=x;
temp.link=null;
node ptr=start;
while(ptr.link!=null)
{
ptr=ptr.link;
}
ptr.link=temp;
temp=ptr=null;
}
void display()
{
node ptr=this;
while(ptr!=null)
{
System.out.println(ptr.data);
ptr=ptr.link;
}
}
}
