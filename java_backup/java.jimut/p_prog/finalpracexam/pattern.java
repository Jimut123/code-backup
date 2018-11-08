package finalpracexam;

import java.io.*;
class pattern
{
public static void main(String[]args)
{
int a=1;
while(a<=5)
{
int b=1;
while(b<=a)
{
System.out.print(b);
b++;
}
System.out.println();
a++;
}
}
}