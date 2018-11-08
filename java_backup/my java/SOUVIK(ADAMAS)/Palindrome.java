import java.util.*;
class Palindrome
{
public static void main (String s [])
{
int num,rev,dig;
Scanner sc =new Scanner (System.in);
System.out.println ("enter the no ");
num=sc.nextInt();
int Copy =num;
rev=0;
while (Copy>0)
{
dig=Copy%10;
rev=rev*10+dig;
Copy=Copy/10;
}
if(num==rev)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}