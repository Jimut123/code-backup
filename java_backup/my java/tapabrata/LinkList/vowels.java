package LinkList;
import java.util.*;
class vowels
{
public static void main(String args[])
{
int i;
String s="",w="";
Scanner ob=new Scanner(System.in);
linkedlist5 ob1=new linkedlist5();
System.out.println("enter the string : ");
s=ob.nextLine();
s=s+" ";
for(i=0;i<s.length();i++)
if(s.charAt(i)==' ')
{
ob1.Insert(w);
w="";
}
else
w=w+s.charAt(i);
System.out.println("");
ob1.display();
w="";
link5 current=ob1.first;
while(current!=null)
{
int f=0;
for(i=0;i<current.data.length();i++)
{
char c=current.data.charAt(i);
if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
{
f=1;
break;
}
}
if(f==1)
{
w=w+current.data;
w=w+" ";
}
current=current.next;
}
System.out.println("new string " +w);
}
}
