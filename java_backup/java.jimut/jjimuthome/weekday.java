import java .io.*;
public class weekday
{
public static void main (int dow)
{
String ans;
switch(dow)
{
case 1:
ans = "sunday";
break;
case 2:
ans = "monday";
break;
case 3:
ans = "tuesday";
break;
case 4:
ans = "wednesday";
break;
case 5:
ans = "thursday";
break;
case 6:
ans = "friday";
break;
case 7:
ans = "saturday";
break;
default:
ans = "Wrong day number";
}
System.out.println(ans);
}
}