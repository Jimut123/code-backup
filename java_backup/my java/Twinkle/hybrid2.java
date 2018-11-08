import java.io.*;
class hybrid2 extends hybrid1
{
int r; 
hybrid2(int c,int d,int e,int f)
{
super(c,d,e);
r=f;
}
void disp2()
{
super.disp2();
System.out.println(r);
}
}