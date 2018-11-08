import java . io . * ;
public class newfactorial
{
public static void main (int a)
{
int i=1,f=1;
do while(i <= a)
{
f = f * i;
i++;
while(i <= a)
System.out.println ("factorial of"+a+"is:"+f);
}
}
}
