import java.util.*;
class swaps
{
public static void main(String args[])
{
int a,b;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter value");
a=Sc.nextInt();
b=Sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
}
}
