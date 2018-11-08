import java.io.*;
class inhercd extends inherbc
{
int w;
inhercd(int c,int d,int e,int f)
{
super(c,d,e);
w=f;
}
void disp3()
{
super.disp2();
System.out.println(w);
}
}
