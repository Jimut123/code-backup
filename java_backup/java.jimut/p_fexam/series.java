import java.io.*;
class series
{
public void disp()
{
int x=5,y=5;
for(int a=5;a>=1;a--)
{
for(int b=x;b>=a;b--)
{
System.out.print(b);
}
for(int c=1;c<=y-1;c++)
{
System.out.print(y);
}
System.out.println();
y=y-1;
}
}
}