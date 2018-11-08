import java.util.*;
public class practice
{
public void run()
{
Scanner sc=new Scanner(System.in);
String w="";
int t=1;
while(t>0)
{
System.out.println("enter string");
w=sc.nextLine();
String m="India is Great";
String m1="India is a Great Country";
if(w.equalsIgnoreCase(m1)||w.equalsIgnoreCase(m))
{
System.out.println("not able to run with this string");
}
else
{
break;
}
}
int c=1;
for(int i=0;i<w.length();i++)
{
if(w.charAt(i)==' ')
c++;
}
String m[]=new String[c];
int h=0;
m[0]="";
for(int i=0;i<w.length();i++)
{
if(w.charAt(i)==' ')
{
h++;
m[h]="";
continue;
}
m[h]+=w.charAt(i);
}

int mid;
if(c%2==0)
{
mid=c/2;
}
else
{
mid=c/2+1;
}
for(int j=0;j<mid;j++)
{
if(m[j].equals(m[c-1-j]))
{
System.out.print(" "+m[j]+" ");
continue;
}
System.out.print(" "+m[j]+" "+m[c-1-j]+" ");
}
}
}

