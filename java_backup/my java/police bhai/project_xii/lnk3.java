package project_xii;


//EXAMPLE OF LINKED LIST(INSERT AND DISPLAY,insert,delete,binary search
import java.io.*;
class lnk3
{
public static void main(String args[])throws IOException
{
int m,n;
String y;
y="YES";
lnk s=new lnk();
lnk s1=new lnk();
lnk s2=new lnk();
lnk s3=new lnk();
lnk s4=new lnk();
lnk s5=new lnk();
lnk s6=new lnk();
s1=s;
int c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("YES")==0)
{
s.input();
c++;
System.out.println("Give another");
y=br.readLine();
if(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("yes")==0)
{
s.l=new lnk();
s=s.l;
}
}
s.l=null;
System.out.println("TOTAL NODES IN THE LIST:"+c);
//s.l=0;
int i=1;
s=s1;
System.out.println("Display the list");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//insertion at begin
s3.input();
s3.l=s1;
s1=s3;
s=s1;
i=1;
c++;
System.out.println("Display the list after insertion at begin");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}

//insertion at end
s4.input();
s=s1;
i=1;
while(s.l!=null)
{
s=s.l;
//i++;
}
s.l=s4;
s4.l=null;
//c++;

//s1.disp();
s=s1;
//i=1;
//c++;
System.out.println("Display the list after insertion at end");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//insertion at desired position
System.out.println("Enter position:");
n=Integer.parseInt(br.readLine());
s5.input();
s=s1;
i=1;
while(i<n)
{
s=s.l;
i++;
}
s6=s.l;
s5.l=s6;
s.l=s5;
//c++;
//s1.disp();
s=s1;
//i=1;
//c++;
System.out.println("Display the list after insertion at desired position");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//deletion from front
s=s1;
s=s.l;
s1=s;
//c--;
//i=1;
s=s1;
System.out.println("After deleting the the front element");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//deletion from end
s=s1;
//i=1;
while(s.l.l!=null)
{
s=s.l;
//i++;
}
s.l=null;
//s1=s;
//c--;
//i=1;
s=s1;
System.out.println("After deleting the the end element");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//deletion from desired position
System.out.println("Enter NUMBER TO DELETE:");
n=Integer.parseInt(br.readLine());
s=s1;
if(s.x==n)
{
s=s.l;
s1=s;
}
else
{
while(s!=null)
{
if(s.l.x==n)
break;
s=s.l;
}
s2=s.l.l;
//delete s.l;
s.l=s2;
}
s=s1;
System.out.println("List after deleting element from desired position");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//sorting process begins
for(s=s1;s.l!=null;s=s.l)
for(s2=s.l;s2!=null;s2=s2.l)
if(s.x >s2.x)
{
m=s.x;
s.x=s2.x;
s2.x=m;
}
s=s1;
System.out.println("List after sorting");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//insert element in sorted list
int f,h,l;
s=s1;
s3.input();
f=0;
if(s3.x<s1.x)
{
s3.l=s1;
s1=s3;
}
else
{
while(s.l!=null)
{
if(s.l.x>s3.x)
{
f=1;
break;
}
s=s.l;
}
if(f==1)
{
s2=s.l;
s3.l=s2;
s.l=s3;
s=s1;
}
else
{
if(s3.x>s.x)
{
s3.l=null;
s.l=s3;
}
}
}
s=s1;
System.out.println("List after inserting element insrted array");
while(s!=null)
{
s.disp();
s=s.l;
//i++;
}
//binary search of an element
System.out.println("Enter NUMBER TO search:");
n=Integer.parseInt(br.readLine());
//System.out.println(c);
h=c-1;
l=1;
m=(h+l)/2;
s=s1;
f=0;
while(l<=h)
{
i=1;
s2=s;
while(i<=m)
{
s2=s2.l;
i++;
}
if(s2.x==n)
{
f=1;
break;
}
else
if(n>s2.x)
{
if(s2.l==null)
break;
s2=s2.l;
l=m+1;
}
else
if(n<s2.x)
{
if(n<s.x)
break;
s2=s;
if(m==1)
{
if(s2.x==n)
{
f=1;
break;
}
}
else
h=m-1;
}
//System.out.println("hh"+h);
//System.out.println("ll"+l);
m=(h+l)/2;
}
if(f==1)
System.out.println("Element found....");
else
System.out.println("Element not found....");
}
}
