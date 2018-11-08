class demo
{
public static void main(int a,int b,int c)
{
int total;
total=a+b+c;
int average;
average=(a+b+c)/3;
System.out.println(average);
if (average<=30)
System.out.println("grade f");
else
if (average<=45)
System.out.println("grade p");
else
if (average<=60)
System.out.println("grade a");
else
if (average<=75)
System.out.println("grade a+");
else
if (average<=90)
System.out.println("grade s");
else
if (average>90)
System.out.println("grade e");
}
}
