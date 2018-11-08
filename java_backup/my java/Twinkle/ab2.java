import java.io.*;
class ab2 extends ab implements ab1
{
int z,t;
void input1()throws IOException
{
super.input();
z=10;
}
void disp1()
{
disp();
cal(z);
}
public void cal(int z)
{
z=z+k;
System.out.print(z);
}
}