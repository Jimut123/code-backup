import java.util.*;
class Factorial
{
public static void main (String s [])
{
int n;
int i;
int fact=1;
Scanner sc =new Scanner (System.in);
System.out.println ("enter the number");
n=sc.nextInt();
if (n<0)
System.out.println ("Number should be non negative");
else
for (i=1;i<=n;i++)
fact=fact*i;
System.out.print ("Factorial is "+fact);
}
}