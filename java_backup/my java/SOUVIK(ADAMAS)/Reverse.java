import java.util.*;
class Reverse
{
public static void main (String s [])
{
int num;
int rev;
int dig;
Scanner sc =new Scanner (System.in);
System.out.println ("Enter the number ");
num=sc.nextInt();
int copy =num ;
rev=0;
while (copy>0)
{
dig=copy%10;
rev=(rev*10)+dig;
copy=copy/10;
}
System.out.println("Reverse "+rev);
}
}