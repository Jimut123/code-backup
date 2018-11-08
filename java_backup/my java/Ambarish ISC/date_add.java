import java.util.*;
class date_add
{
int n;
date_add(int num)
{
n=num;
}
void clac()
{
String a[]={"Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday"};
int j=0;
j=n%7;
System.out.print(a[j]);
}
}
