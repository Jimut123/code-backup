import java.io.*;
class C extends B
{
int z;
C(int z1,int x,int y)
{
super(x,y);
z=z1;
}
void disp3()
{
super.disp2();
System.out.println(z);
}
}
