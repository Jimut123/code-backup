import java.io.*;
class inherh2 extends inherhorig
{
int q;
inherh2(int c,int d,int e)
{
super(c,d);
q=e;
}
void disp3()
{
super.disp1();
System.out.println(q);
}
}