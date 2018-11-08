import java.util.*;
public class str
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int a,d;
String s,m,c;
System.out.println("enter String");
c=sc.nextLine();
d=c.length();
m="";
for(a=d-1;a>=0;a=a-1)
{
m=m+c.charAt(a);}
if(m.equalsIgnoreCase(c)==true)
{
System.out.println("THE STRING IS A PALNDROME");
}else{
System.out.println("THE STRING IS NOT A PALINDROME");
}}}
