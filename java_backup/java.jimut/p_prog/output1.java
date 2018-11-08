import java.io.*;
class output1
{
public static void main(String[]args)
{
int x=15,y=14,a;
a=++x + ++y + --x + --y + x%y +x/y +x*y;
System.out.println(a);
}
}