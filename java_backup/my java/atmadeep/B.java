import java.io.*;
class B extends A
{
int y;
B(int y1,int x)
{
super(x);
y=y1;
}
void disp2()
{
super.disp1();
System.out.println(y);
}
}
