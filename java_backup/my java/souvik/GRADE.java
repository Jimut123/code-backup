class GRADE
{
public static void main(int a,int b,int c)
{
int d,average ;
d=a+b+c;
System.out.println(d);
average=a+b+c/3;
System.out.println(average);
if (average <30)
System.out.println("fail");
else
if (average <60)
System.out.println("pass");
else
if (average <75)
System.out.println("good");
else
if (average <90)
System.out.println("superb");
else
if (average >90)
System.out.println("excellent");
}
}