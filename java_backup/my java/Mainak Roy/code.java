import java.util.*;
public class code
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter code");
String n=sc.nextLine();
int l=0;
int b=91;
String w="";
for(int i=0;i<n.length();i++)
{
String k="";
int p=b;
k=k+n.charAt(i);
int hl=Integer.parseInt(k);
for(int j=1;j<hl;j++)
{
if(p==121)
{
p=97;
}
else
{
p=p+1;
}
}
w=w+(char)p;
}
w=w.toLowerCase();
System.out.println(w);
}
}
