import java.util.*;
class ternaryf
{
public static void main(String args[])
{
int m;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value");
m=sc.nextInt(); 
char g;
g=(m<=30?'f':m<40?'e':m<59?'d':m<=70?'c':m<=80?'b':m<=90?'a':'s');
System.out.println(g);
}
}
