import java.util.*;
public class ascending
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int m=0;
String w=Integer.toString(n);
for(int i=0;i<=9;i++)
{
for(int j=0;j<w.length();j++)
{
String g="";
g=g+w.charAt(j);
if(i==Integer.parseInt(g))
{
m=m*10;
m=m+Integer.parseInt(g);
}
}
}
System.out.println(m);
}
}
