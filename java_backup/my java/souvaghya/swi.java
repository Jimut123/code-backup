class swi
{
public static void main(int x)
{
System.out.println("press 1 for good morning");
System.out.println("press 2 for good evening");
System.out.println("press 3 for good night");
switch(x)
{
case 1:System.out.println("good morning");
break;
case 2:System.out.println("good evening");
break;
case 3:System.out.println("good night");
break;
default:System.out.println("error");
}
}
}