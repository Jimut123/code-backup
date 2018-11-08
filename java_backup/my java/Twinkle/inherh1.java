import java.io.*;
class inherh1 extends inherhorig
{
int p;
inherh1(int c,int d,int e)
{
super(c,d);
p=e;
}
void disp2()
{
super.disp1();
System.out.println(p);
}
}